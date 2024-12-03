package service;

import model.Classe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ClasseRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClasseService {

    @Autowired
    private ClasseRepository classeRepository;

    // Get all classes
    public List<Classe> getAllClasses() {
        return classeRepository.findAll();
    }

    // Get class by ID
    public Optional<Classe> getClassById(Long id) {
        return classeRepository.findById(id);
    }

    // Create or update a class
    public Classe saveClass(Classe classe) {
        return classeRepository.save(classe);
    }

    // Delete a class
    public void deleteClass(Long id) {
        classeRepository.deleteById(id);
    }
}
