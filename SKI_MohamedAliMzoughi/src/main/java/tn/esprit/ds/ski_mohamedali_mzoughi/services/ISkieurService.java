package tn.esprit.ds.ski_mohamedali_mzoughi.services;

import tn.esprit.ds.ski_mohamedali_mzoughi.Entities.Skieur;
import tn.esprit.ds.ski_mohamedali_mzoughi.Entities.TypeAbonnement;

import java.util.List;
import java.util.Optional;

public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();
    Skieur addSkieur(Skieur skieur);


    void removeSkieur (Long numSkieur);
    Optional<Skieur> retrieveSkieur (Long numSkieur);
    Skieur updateSkieur (Skieur Skieur);
    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);
    Skieur AssignSkierToSubscription(long numSkieur, long numAbon);
    List<Skieur> retrieveSkieurBySubscriptionType(TypeAbonnement typeAbonnement);


    Skieur addSkieurAndAssignToCourse(Skieur skieur);
}
