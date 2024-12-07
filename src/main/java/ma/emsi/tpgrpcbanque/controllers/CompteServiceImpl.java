package ma.emsi.tpgrpcbanque.controllers;

import io.grpc.stub.StreamObserver;
import ma.emsi.tpgrpcbanque.service.CompteService;
import ma.emsi.tpgrpcbanque.stubs.*;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.stream.Collectors;


@GrpcService
public class CompteServiceImpl extends CompteServiceGrpc.CompteServiceImplBase {
    private final CompteService compteService;

    public CompteServiceImpl(CompteService compteService) {
        this.compteService = compteService;
    }

    @Override
    public void allComptes(GetAllComptesRequest request,
                           StreamObserver<GetAllComptesResponse> responseObserver) {
        var comptes = compteService.findAllComptes().stream()
                .map(compte -> Compte.newBuilder()
                        .setId(compte.getId())
                        .setSolde(compte.getSolde())
                        .setDateCreation(compte.getDateCreation())
                        .setType(TypeCompte.valueOf(compte.getType()))
                        .build())
                .collect(Collectors.toList());

        responseObserver.onNext(GetAllComptesResponse.newBuilder()
                .addAllComptes(comptes)
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void saveCompte(SaveCompteRequest request,
                           StreamObserver<SaveCompteResponse> responseObserver) {
        var compteReq = request.getCompte();
        var compte = new ma.emsi.tpgrpcbanque.entity.Compte();
        compte.setSolde(compteReq.getSolde());
        compte.setDateCreation(compteReq.getDateCreation());
        compte.setType(compteReq.getType().name());

        var savedCompte = compteService.saveCompte(compte);

        var grpcCompte = Compte.newBuilder()
                .setId(savedCompte.getId())
                .setSolde(savedCompte.getSolde())
                .setDateCreation(savedCompte.getDateCreation())
                .setType(TypeCompte.valueOf(savedCompte.getType()))
                .build();

        responseObserver.onNext(SaveCompteResponse.newBuilder()
                .setCompte(grpcCompte)
                .build());
        responseObserver.onCompleted();
    }

    //

    @Override
    public void deleteCompte(DeleteCompteRequest request,
                             StreamObserver<DeleteCompteResponse> responseObserver) {
        var id = request.getId();
        compteService.deleteCompte(id);

        responseObserver.onNext(DeleteCompteResponse.newBuilder()
                .setMessage("Compte with ID " + id + " deleted successfully.")
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void getComptesByType(GetComptesByTypeRequest request,
                                 StreamObserver<GetComptesByTypeResponse> responseObserver) {
        var type = request.getType().name();
        var comptes = compteService.findComptesByType(type).stream()
                .map(compte -> Compte.newBuilder()
                        .setId(compte.getId())
                        .setSolde(compte.getSolde())
                        .setDateCreation(compte.getDateCreation())
                        .setType(TypeCompte.valueOf(compte.getType()))
                        .build())
                .collect(Collectors.toList());

        responseObserver.onNext(GetComptesByTypeResponse.newBuilder()
                .addAllComptes(comptes)
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void compteById(GetCompteByIdRequest request,
                           StreamObserver<GetCompteByIdResponse> responseObserver) {
        var id = request.getId();
        var compte = compteService.findCompteById(id);

        if (compte == null) {
            responseObserver.onError(
                    new RuntimeException("Compte with ID " + id + " not found.")
            );
            return;
        }

        var grpcCompte = Compte.newBuilder()
                .setId(compte.getId())
                .setSolde(compte.getSolde())
                .setDateCreation(compte.getDateCreation())
                .setType(TypeCompte.valueOf(compte.getType()))
                .build();

        responseObserver.onNext(GetCompteByIdResponse.newBuilder()
                .setCompte(grpcCompte)
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void getTotalSolde(GetTotalSoldeRequest request,
                              StreamObserver<GetTotalSoldeResponse> responseObserver) {
        // Get all accounts from the service
        var comptes = compteService.findAllComptes();

        // Calculate statistics
        int count = comptes.size();
        float sum = (float) comptes.stream().mapToDouble(ma.emsi.tpgrpcbanque.entity.Compte::getSolde).sum();
        float average = count > 0 ? sum / count : 0;

        // Build the response
        var stats = SoldeStats.newBuilder()
                .setCount(count)
                .setSum(sum)
                .setAverage(average)
                .build();

        responseObserver.onNext(GetTotalSoldeResponse.newBuilder()
                .setStats(stats)
                .build());
        responseObserver.onCompleted();
    }


}
