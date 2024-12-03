package service;

import model.Matiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.MatiereRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MatiereService {

    @Autowired
    private MatiereRepository matiereRepository;

    // Get all subjects
    public List<Matiere> getAllMatieres() {
        return matiereRepository.findAll();
    }

    // Get subject by ID
    public Optional<Matiere> getMatiereById(Long id) {
        return matiereRepository.findById(id);
    }

    // Create or update a subject
    public Matiere saveMatiere(Matiere matiere) {
        return matiereRepository.save(matiere);
    }

    // Delete a subject
    public void deleteMatiere(Long id) {
        matiereRepository.deleteById(id);
    }
}
