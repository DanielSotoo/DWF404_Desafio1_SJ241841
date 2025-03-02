package sv.edu.udb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.edu.udb.model.Inscription;

public interface InscriptionRepository extends JpaRepository<Inscription, Long> {
}