package repository;

import model.EmploiDuTemps;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmploiDuTempsRepository extends JpaRepository<EmploiDuTemps, Long> {
    // Add custom queries if needed, e.g., find by class or date
}
