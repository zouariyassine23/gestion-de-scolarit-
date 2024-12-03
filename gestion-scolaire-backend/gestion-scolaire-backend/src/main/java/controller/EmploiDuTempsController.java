package controller;

import model.EmploiDuTemps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.EmploiDuTempsService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/emplois")
public class EmploiDuTempsController {

    @Autowired
    private EmploiDuTempsService emploiDuTempsService;

    // Get all schedules
    @GetMapping
    public List<EmploiDuTemps> getAllEmplois() {
        return emploiDuTempsService.getAllEmplois();
    }

    // Get schedule by ID
    @GetMapping("/{id}")
    public Optional<EmploiDuTemps> getEmploiById(@PathVariable Long id) {
        return emploiDuTempsService.getEmploiById(id);
    }

    // Create or update a schedule
    @PostMapping
    public EmploiDuTemps createEmploi(@RequestBody EmploiDuTemps emploiDuTemps) {
        return emploiDuTempsService.saveEmploi(emploiDuTemps);
    }

    // Delete a schedule by ID
    @DeleteMapping("/{id}")
    public void deleteEmploi(@PathVariable Long id) {
        emploiDuTempsService.deleteEmploi(id);
    }
}
