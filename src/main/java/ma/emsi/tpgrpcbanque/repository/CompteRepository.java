package ma.emsi.tpgrpcbanque.repository;

import ma.emsi.tpgrpcbanque.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompteRepository extends JpaRepository<Compte, String> {

    List<Compte> findByType(String type);

}
