package controller;

import model.Classe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ClasseService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/classes")
public class ClasseController {

    @Autowired
    private ClasseService classeService;

    // Get all classes
    @GetMapping
    public List<Classe> getAllClasses() {
        return classeService.getAllClasses();
    }

    // Get class by ID
    @GetMapping("/{id}")
    public Optional<Classe> getClassById(@PathVariable Long id) {
        return classeService.getClassById(id);
    }

    // Create or update a class
    @PostMapping
    public Classe createClass(@RequestBody Classe classe) {
        return classeService.saveClass(classe);
    }

    // Delete a class by ID
    @DeleteMapping("/{id}")
    public void deleteClass(@PathVariable Long id) {
        classeService.deleteClass(id);
    }
}
