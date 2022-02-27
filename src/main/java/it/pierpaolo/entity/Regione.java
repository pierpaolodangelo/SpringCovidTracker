package it.pierpaolo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Regione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String codice;
    private String denominazione;
    @OneToMany(mappedBy = "regione")
    private Set<Bollettino> bollettini;

    public Set<Bollettino> getBollettini() {
        return bollettini;
    }

    public void setBollettini(Set<Bollettino> bollettini) {
        this.bollettini = bollettini;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }
}
