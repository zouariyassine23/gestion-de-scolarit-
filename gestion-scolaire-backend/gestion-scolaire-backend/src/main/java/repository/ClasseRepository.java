package repository;

import model.Classe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClasseRepository extends JpaRepository<Classe, Long> {
    // Add custom queries if needed, e.g., find by class name
}
