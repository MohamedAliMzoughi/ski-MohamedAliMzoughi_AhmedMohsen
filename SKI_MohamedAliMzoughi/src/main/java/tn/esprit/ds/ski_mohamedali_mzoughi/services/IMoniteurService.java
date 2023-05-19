package tn.esprit.ds.ski_mohamedali_mzoughi.services;

import tn.esprit.ds.ski_mohamedali_mzoughi.Entities.Monitor;

import java.util.List;
import java.util.Optional;

public interface IMoniteurService {


    List<Monitor> retrieveAllMoniteurs();
    Monitor addMoniteur(Monitor moniteur);
    Monitor updateMoniteur (Monitor moniteur);
    Optional<Monitor> retrieveMoniteur (Long numMoniteur);
    void removeMoniteur  (Long numMoniteur);
    Monitor addInstructorAndAssignToCourse(Monitor moniteur, Long numCourse);

}
