package tn.esprit.ds.ski_mohamedali_mzoughi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.ski_mohamedali_mzoughi.Entities.Piste;
import tn.esprit.ds.ski_mohamedali_mzoughi.services.IPisteService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("piste")
public class PisteController {

    @Autowired
    IPisteService iPisteService;
    @GetMapping
    public List<Piste> getAll(){
        return iPisteService.retrieveAllPistes();

    }

    @GetMapping("{numPiste}")

    public Optional<Piste> retrievePiste(@PathVariable Long numPiste) {

        return  iPisteService.retrievePiste(numPiste);

    }
    @PostMapping

    public Piste addPiste(@RequestBody Piste piste){

        return iPisteService.addPiste(piste);
    }

    @DeleteMapping("{numpiste}")
    public void removePiste(@PathVariable Long numpiste){

        iPisteService.removePiste(numpiste);
    }
    @PutMapping
    public Piste updatePiste(@RequestBody Piste Piste) {

        return  iPisteService.updatePiste(Piste);

    }

}