package ma.emsi.tpgrpcbanque.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: CompteService.proto")
public final class CompteServiceGrpc {

  private CompteServiceGrpc() {}

  public static final String SERVICE_NAME = "CompteService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.emsi.tpgrpcbanque.stubs.GetAllComptesRequest,
      ma.emsi.tpgrpcbanque.stubs.GetAllComptesResponse> getAllComptesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllComptes",
      requestType = ma.emsi.tpgrpcbanque.stubs.GetAllComptesRequest.class,
      responseType = ma.emsi.tpgrpcbanque.stubs.GetAllComptesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.tpgrpcbanque.stubs.GetAllComptesRequest,
      ma.emsi.tpgrpcbanque.stubs.GetAllComptesResponse> getAllComptesMethod() {
    io.grpc.MethodDescriptor<ma.emsi.tpgrpcbanque.stubs.GetAllComptesRequest, ma.emsi.tpgrpcbanque.stubs.GetAllComptesResponse> getAllComptesMethod;
    if ((getAllComptesMethod = CompteServiceGrpc.getAllComptesMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getAllComptesMethod = CompteServiceGrpc.getAllComptesMethod) == null) {
          CompteServiceGrpc.getAllComptesMethod = getAllComptesMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.tpgrpcbanque.stubs.GetAllComptesRequest, ma.emsi.tpgrpcbanque.stubs.GetAllComptesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteService", "AllComptes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.tpgrpcbanque.stubs.GetAllComptesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.tpgrpcbanque.stubs.GetAllComptesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("AllComptes"))
                  .build();
          }
        }
     }
     return getAllComptesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.tpgrpcbanque.stubs.GetCompteByIdRequest,
      ma.emsi.tpgrpcbanque.stubs.GetCompteByIdResponse> getCompteByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CompteById",
      requestType = ma.emsi.tpgrpcbanque.stubs.GetCompteByIdRequest.class,
      responseType = ma.emsi.tpgrpcbanque.stubs.GetCompteByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.tpgrpcbanque.stubs.GetCompteByIdRequest,
      ma.emsi.tpgrpcbanque.stubs.GetCompteByIdResponse> getCompteByIdMethod() {
    io.grpc.MethodDescriptor<ma.emsi.tpgrpcbanque.stubs.GetCompteByIdRequest, ma.emsi.tpgrpcbanque.stubs.GetCompteByIdResponse> getCompteByIdMethod;
    if ((getCompteByIdMethod = CompteServiceGrpc.getCompteByIdMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getCompteByIdMethod = CompteServiceGrpc.getCompteByIdMethod) == null) {
          CompteServiceGrpc.getCompteByIdMethod = getCompteByIdMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.tpgrpcbanque.stubs.GetCompteByIdRequest, ma.emsi.tpgrpcbanque.stubs.GetCompteByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteService", "CompteById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.tpgrpcbanque.stubs.GetCompteByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.tpgrpcbanque.stubs.GetCompteByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("CompteById"))
                  .build();
          }
        }
     }
     return getCompteByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.tpgrpcbanque.stubs.GetTotalSoldeRequest,
      ma.emsi.tpgrpcbanque.stubs.GetTotalSoldeResponse> getGetTotalSoldeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTotalSolde",
      requestType = ma.emsi.tpgrpcbanque.stubs.GetTotalSoldeRequest.class,
      responseType = ma.emsi.tpgrpcbanque.stubs.GetTotalSoldeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.tpgrpcbanque.stubs.GetTotalSoldeRequest,
      ma.emsi.tpgrpcbanque.stubs.GetTotalSoldeResponse> getGetTotalSoldeMethod() {
    io.grpc.MethodDescriptor<ma.emsi.tpgrpcbanque.stubs.GetTotalSoldeRequest, ma.emsi.tpgrpcbanque.stubs.GetTotalSoldeResponse> getGetTotalSoldeMethod;
    if ((getGetTotalSoldeMethod = CompteServiceGrpc.getGetTotalSoldeMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getGetTotalSoldeMethod = CompteServiceGrpc.getGetTotalSoldeMethod) == null) {
          CompteServiceGrpc.getGetTotalSoldeMethod = getGetTotalSoldeMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.tpgrpcbanque.stubs.GetTotalSoldeRequest, ma.emsi.tpgrpcbanque.stubs.GetTotalSoldeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteService", "GetTotalSolde"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.tpgrpcbanque.stubs.GetTotalSoldeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.tpgrpcbanque.stubs.GetTotalSoldeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("GetTotalSolde"))
                  .build();
          }
        }
     }
     return getGetTotalSoldeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.tpgrpcbanque.stubs.SaveCompteRequest,
      ma.emsi.tpgrpcbanque.stubs.SaveCompteResponse> getSaveCompteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveCompte",
      requestType = ma.emsi.tpgrpcbanque.stubs.SaveCompteRequest.class,
      responseType = ma.emsi.tpgrpcbanque.stubs.SaveCompteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.tpgrpcbanque.stubs.SaveCompteRequest,
      ma.emsi.tpgrpcbanque.stubs.SaveCompteResponse> getSaveCompteMethod() {
    io.grpc.MethodDescriptor<ma.emsi.tpgrpcbanque.stubs.SaveCompteRequest, ma.emsi.tpgrpcbanque.stubs.SaveCompteResponse> getSaveCompteMethod;
    if ((getSaveCompteMethod = CompteServiceGrpc.getSaveCompteMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getSaveCompteMethod = CompteServiceGrpc.getSaveCompteMethod) == null) {
          CompteServiceGrpc.getSaveCompteMethod = getSaveCompteMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.tpgrpcbanque.stubs.SaveCompteRequest, ma.emsi.tpgrpcbanque.stubs.SaveCompteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteService", "SaveCompte"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.tpgrpcbanque.stubs.SaveCompteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.tpgrpcbanque.stubs.SaveCompteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("SaveCompte"))
                  .build();
          }
        }
     }
     return getSaveCompteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.tpgrpcbanque.stubs.DeleteCompteRequest,
      ma.emsi.tpgrpcbanque.stubs.DeleteCompteResponse> getDeleteCompteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCompte",
      requestType = ma.emsi.tpgrpcbanque.stubs.DeleteCompteRequest.class,
      responseType = ma.emsi.tpgrpcbanque.stubs.DeleteCompteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.tpgrpcbanque.stubs.DeleteCompteRequest,
      ma.emsi.tpgrpcbanque.stubs.DeleteCompteResponse> getDeleteCompteMethod() {
    io.grpc.MethodDescriptor<ma.emsi.tpgrpcbanque.stubs.DeleteCompteRequest, ma.emsi.tpgrpcbanque.stubs.DeleteCompteResponse> getDeleteCompteMethod;
    if ((getDeleteCompteMethod = CompteServiceGrpc.getDeleteCompteMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getDeleteCompteMethod = CompteServiceGrpc.getDeleteCompteMethod) == null) {
          CompteServiceGrpc.getDeleteCompteMethod = getDeleteCompteMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.tpgrpcbanque.stubs.DeleteCompteRequest, ma.emsi.tpgrpcbanque.stubs.DeleteCompteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteService", "DeleteCompte"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.tpgrpcbanque.stubs.DeleteCompteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.tpgrpcbanque.stubs.DeleteCompteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("DeleteCompte"))
                  .build();
          }
        }
     }
     return getDeleteCompteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest,
      ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse> getGetComptesByTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetComptesByType",
      requestType = ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest.class,
      responseType = ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest,
      ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse> getGetComptesByTypeMethod() {
    io.grpc.MethodDescriptor<ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest, ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse> getGetComptesByTypeMethod;
    if ((getGetComptesByTypeMethod = CompteServiceGrpc.getGetComptesByTypeMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getGetComptesByTypeMethod = CompteServiceGrpc.getGetComptesByTypeMethod) == null) {
          CompteServiceGrpc.getGetComptesByTypeMethod = getGetComptesByTypeMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest, ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteService", "GetComptesByType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("GetComptesByType"))
                  .build();
          }
        }
     }
     return getGetComptesByTypeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CompteServiceStub newStub(io.grpc.Channel channel) {
    return new CompteServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CompteServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CompteServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CompteServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CompteServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CompteServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void allComptes(ma.emsi.tpgrpcbanque.stubs.GetAllComptesRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.tpgrpcbanque.stubs.GetAllComptesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllComptesMethod(), responseObserver);
    }

    /**
     */
    public void compteById(ma.emsi.tpgrpcbanque.stubs.GetCompteByIdRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.tpgrpcbanque.stubs.GetCompteByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCompteByIdMethod(), responseObserver);
    }

    /**
     */
    public void getTotalSolde(ma.emsi.tpgrpcbanque.stubs.GetTotalSoldeRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.tpgrpcbanque.stubs.GetTotalSoldeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTotalSoldeMethod(), responseObserver);
    }

    /**
     */
    public void saveCompte(ma.emsi.tpgrpcbanque.stubs.SaveCompteRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.tpgrpcbanque.stubs.SaveCompteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveCompteMethod(), responseObserver);
    }

    /**
     */
    public void deleteCompte(ma.emsi.tpgrpcbanque.stubs.DeleteCompteRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.tpgrpcbanque.stubs.DeleteCompteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCompteMethod(), responseObserver);
    }

    /**
     */
    public void getComptesByType(ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetComptesByTypeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllComptesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.tpgrpcbanque.stubs.GetAllComptesRequest,
                ma.emsi.tpgrpcbanque.stubs.GetAllComptesResponse>(
                  this, METHODID_ALL_COMPTES)))
          .addMethod(
            getCompteByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.tpgrpcbanque.stubs.GetCompteByIdRequest,
                ma.emsi.tpgrpcbanque.stubs.GetCompteByIdResponse>(
                  this, METHODID_COMPTE_BY_ID)))
          .addMethod(
            getGetTotalSoldeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.tpgrpcbanque.stubs.GetTotalSoldeRequest,
                ma.emsi.tpgrpcbanque.stubs.GetTotalSoldeResponse>(
                  this, METHODID_GET_TOTAL_SOLDE)))
          .addMethod(
            getSaveCompteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.tpgrpcbanque.stubs.SaveCompteRequest,
                ma.emsi.tpgrpcbanque.stubs.SaveCompteResponse>(
                  this, METHODID_SAVE_COMPTE)))
          .addMethod(
            getDeleteCompteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.tpgrpcbanque.stubs.DeleteCompteRequest,
                ma.emsi.tpgrpcbanque.stubs.DeleteCompteResponse>(
                  this, METHODID_DELETE_COMPTE)))
          .addMethod(
            getGetComptesByTypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest,
                ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse>(
                  this, METHODID_GET_COMPTES_BY_TYPE)))
          .build();
    }
  }

  /**
   */
  public static final class CompteServiceStub extends io.grpc.stub.AbstractStub<CompteServiceStub> {
    private CompteServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompteServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompteServiceStub(channel, callOptions);
    }

    /**
     */
    public void allComptes(ma.emsi.tpgrpcbanque.stubs.GetAllComptesRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.tpgrpcbanque.stubs.GetAllComptesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllComptesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void compteById(ma.emsi.tpgrpcbanque.stubs.GetCompteByIdRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.tpgrpcbanque.stubs.GetCompteByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCompteByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTotalSolde(ma.emsi.tpgrpcbanque.stubs.GetTotalSoldeRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.tpgrpcbanque.stubs.GetTotalSoldeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTotalSoldeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveCompte(ma.emsi.tpgrpcbanque.stubs.SaveCompteRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.tpgrpcbanque.stubs.SaveCompteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveCompteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCompte(ma.emsi.tpgrpcbanque.stubs.DeleteCompteRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.tpgrpcbanque.stubs.DeleteCompteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCompteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getComptesByType(ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetComptesByTypeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CompteServiceBlockingStub extends io.grpc.stub.AbstractStub<CompteServiceBlockingStub> {
    private CompteServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompteServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompteServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.emsi.tpgrpcbanque.stubs.GetAllComptesResponse allComptes(ma.emsi.tpgrpcbanque.stubs.GetAllComptesRequest request) {
      return blockingUnaryCall(
          getChannel(), getAllComptesMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.emsi.tpgrpcbanque.stubs.GetCompteByIdResponse compteById(ma.emsi.tpgrpcbanque.stubs.GetCompteByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getCompteByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.emsi.tpgrpcbanque.stubs.GetTotalSoldeResponse getTotalSolde(ma.emsi.tpgrpcbanque.stubs.GetTotalSoldeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTotalSoldeMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.emsi.tpgrpcbanque.stubs.SaveCompteResponse saveCompte(ma.emsi.tpgrpcbanque.stubs.SaveCompteRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveCompteMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.emsi.tpgrpcbanque.stubs.DeleteCompteResponse deleteCompte(ma.emsi.tpgrpcbanque.stubs.DeleteCompteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCompteMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse getComptesByType(ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetComptesByTypeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CompteServiceFutureStub extends io.grpc.stub.AbstractStub<CompteServiceFutureStub> {
    private CompteServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompteServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompteServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.tpgrpcbanque.stubs.GetAllComptesResponse> allComptes(
        ma.emsi.tpgrpcbanque.stubs.GetAllComptesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAllComptesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.tpgrpcbanque.stubs.GetCompteByIdResponse> compteById(
        ma.emsi.tpgrpcbanque.stubs.GetCompteByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCompteByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.tpgrpcbanque.stubs.GetTotalSoldeResponse> getTotalSolde(
        ma.emsi.tpgrpcbanque.stubs.GetTotalSoldeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTotalSoldeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.tpgrpcbanque.stubs.SaveCompteResponse> saveCompte(
        ma.emsi.tpgrpcbanque.stubs.SaveCompteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveCompteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.tpgrpcbanque.stubs.DeleteCompteResponse> deleteCompte(
        ma.emsi.tpgrpcbanque.stubs.DeleteCompteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCompteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse> getComptesByType(
        ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetComptesByTypeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALL_COMPTES = 0;
  private static final int METHODID_COMPTE_BY_ID = 1;
  private static final int METHODID_GET_TOTAL_SOLDE = 2;
  private static final int METHODID_SAVE_COMPTE = 3;
  private static final int METHODID_DELETE_COMPTE = 4;
  private static final int METHODID_GET_COMPTES_BY_TYPE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CompteServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CompteServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALL_COMPTES:
          serviceImpl.allComptes((ma.emsi.tpgrpcbanque.stubs.GetAllComptesRequest) request,
              (io.grpc.stub.StreamObserver<ma.emsi.tpgrpcbanque.stubs.GetAllComptesResponse>) responseObserver);
          break;
        case METHODID_COMPTE_BY_ID:
          serviceImpl.compteById((ma.emsi.tpgrpcbanque.stubs.GetCompteByIdRequest) request,
              (io.grpc.stub.StreamObserver<ma.emsi.tpgrpcbanque.stubs.GetCompteByIdResponse>) responseObserver);
          break;
        case METHODID_GET_TOTAL_SOLDE:
          serviceImpl.getTotalSolde((ma.emsi.tpgrpcbanque.stubs.GetTotalSoldeRequest) request,
              (io.grpc.stub.StreamObserver<ma.emsi.tpgrpcbanque.stubs.GetTotalSoldeResponse>) responseObserver);
          break;
        case METHODID_SAVE_COMPTE:
          serviceImpl.saveCompte((ma.emsi.tpgrpcbanque.stubs.SaveCompteRequest) request,
              (io.grpc.stub.StreamObserver<ma.emsi.tpgrpcbanque.stubs.SaveCompteResponse>) responseObserver);
          break;
        case METHODID_DELETE_COMPTE:
          serviceImpl.deleteCompte((ma.emsi.tpgrpcbanque.stubs.DeleteCompteRequest) request,
              (io.grpc.stub.StreamObserver<ma.emsi.tpgrpcbanque.stubs.DeleteCompteResponse>) responseObserver);
          break;
        case METHODID_GET_COMPTES_BY_TYPE:
          serviceImpl.getComptesByType((ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest) request,
              (io.grpc.stub.StreamObserver<ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CompteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CompteServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.emsi.tpgrpcbanque.stubs.CompteServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CompteService");
    }
  }

  private static final class CompteServiceFileDescriptorSupplier
      extends CompteServiceBaseDescriptorSupplier {
    CompteServiceFileDescriptorSupplier() {}
  }

  private static final class CompteServiceMethodDescriptorSupplier
      extends CompteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CompteServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CompteServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CompteServiceFileDescriptorSupplier())
              .addMethod(getAllComptesMethod())
              .addMethod(getCompteByIdMethod())
              .addMethod(getGetTotalSoldeMethod())
              .addMethod(getSaveCompteMethod())
              .addMethod(getDeleteCompteMethod())
              .addMethod(getGetComptesByTypeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
