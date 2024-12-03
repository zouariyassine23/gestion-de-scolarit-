package service;

import model.EmploiDuTemps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EmploiDuTempsRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmploiDuTempsService {

    @Autowired
    private EmploiDuTempsRepository emploiDuTempsRepository;

    // Get all schedules
    public List<EmploiDuTemps> getAllEmplois() {
        return emploiDuTempsRepository.findAll();
    }

    // Get schedule by ID
    public Optional<EmploiDuTemps> getEmploiById(Long id) {
        return emploiDuTempsRepository.findById(id);
    }

    // Create or update a schedule
    public EmploiDuTemps saveEmploi(EmploiDuTemps emploiDuTemps) {
        return emploiDuTempsRepository.save(emploiDuTemps);
    }

    // Delete a schedule
    public void deleteEmploi(Long id) {
        emploiDuTempsRepository.deleteById(id);
    }
}
