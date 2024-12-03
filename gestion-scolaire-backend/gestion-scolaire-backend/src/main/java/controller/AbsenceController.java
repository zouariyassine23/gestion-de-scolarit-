package controller;

import model.Absence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.AbsenceService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/absences")
public class AbsenceController {

    @Autowired
    private AbsenceService absenceService;

    // Get all absences
    @GetMapping
    public List<Absence> getAllAbsences() {
        return absenceService.getAllAbsences();
    }

    // Get absence by ID
    @GetMapping("/{id}")
    public Optional<Absence> getAbsenceById(@PathVariable Long id) {
        return absenceService.getAbsenceById(id);
    }

    // Create or update an absence
    @PostMapping
    public Absence createAbsence(@RequestBody Absence absence) {
        return absenceService.saveAbsence(absence);
    }

    // Delete an absence by ID
    @DeleteMapping("/{id}")
    public void deleteAbsence(@PathVariable Long id) {
        absenceService.deleteAbsence(id);
    }
}
