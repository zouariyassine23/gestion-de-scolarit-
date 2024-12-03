package repository;

import model.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatiereRepository extends JpaRepository<Matiere, Long> {
    // Add custom queries if needed, e.g., find by subject name
}
