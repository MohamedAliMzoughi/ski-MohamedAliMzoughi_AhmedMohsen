package tn.esprit.ds.ski_mohamedali_mzoughi.services;

import tn.esprit.ds.ski_mohamedali_mzoughi.Entities.Inscription;

import java.util.List;
import java.util.Optional;

public interface IInscriptionService {

    List<Inscription> retrieveAllInscription();
    Inscription addInscription(Inscription inscription);
    Inscription updateInscription(Inscription inscription);
    Optional<Inscription> retrieveInscription(Long numInscription);

    void removeInscription(Long numInscription);
}
