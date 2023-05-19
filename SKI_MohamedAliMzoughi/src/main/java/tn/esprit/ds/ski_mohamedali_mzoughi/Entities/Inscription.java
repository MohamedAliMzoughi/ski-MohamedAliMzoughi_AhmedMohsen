package tn.esprit.ds.ski_mohamedali_mzoughi.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@javax.persistence.Entity
@AllArgsConstructor
@NoArgsConstructor
public class Inscription {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int numInscription;
   private int numSemaine;
   @ManyToOne
   public Cours cours;
   @JsonIgnore
   @ManyToOne
    public Skieur skieur;
}
