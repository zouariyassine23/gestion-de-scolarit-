package repository;

import model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    // Custom query to find a user by email
    Utilisateur findByEmail(String email);
}
