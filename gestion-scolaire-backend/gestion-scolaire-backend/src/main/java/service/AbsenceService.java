package service;

import model.Absence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AbsenceRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AbsenceService {

    @Autowired
    private AbsenceRepository absenceRepository;

    // Get all absences
    public List<Absence> getAllAbsences() {
        return absenceRepository.findAll();
    }

    // Get absence by ID
    public Optional<Absence> getAbsenceById(Long id) {
        return absenceRepository.findById(id);
    }

    // Create or update an absence
    public Absence saveAbsence(Absence absence) {
        return absenceRepository.save(absence);
    }

    // Delete an absence
    public void deleteAbsence(Long id) {
        absenceRepository.deleteById(id);
    }
}
