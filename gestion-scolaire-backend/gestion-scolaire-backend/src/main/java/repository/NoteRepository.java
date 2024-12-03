package repository;

import model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
    // Add custom queries if needed, e.g., find by student or subject
}
