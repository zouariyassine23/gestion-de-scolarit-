package repository;

import model.Absence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbsenceRepository extends JpaRepository<Absence, Long> {
    // Add custom queries if needed, e.g., find absences by student or date
}
