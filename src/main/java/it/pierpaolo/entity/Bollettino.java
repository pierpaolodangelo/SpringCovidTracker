package it.pierpaolo.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Bollettino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate data;
    private int terapiaIntensiva;
    private int totaleOspedalizzati;
    private int isolamentoDomiciliare;
    private int totalePositivi;
    private int variazioneTotalePositivi;
    private int nuoviPositivi;
    private int dimessiGuariti;
    private int deceduti;
    private int casiDaSospettoDiagnostico;
    private int casiDaScreening;
    private int totaleCasi;
    private int tamponi;
    private int casiTestati;
    private String note;
    private int ingressiTerapiaIntensiva;
    private String note_test;
    private String noteCasi;
    private int totalePositiviTestMolecolare;
    private int totalePositiviTestAntigenicoRapido;
    private int tamponiTestMolecolare;
    private int tamponiTestAntigenicoRapido;
    @ManyToOne
    @JoinColumn(name = "id_regione", nullable = false)
    private Regione regione;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getTerapiaIntensiva() {
        return terapiaIntensiva;
    }

    public void setTerapiaIntensiva(int terapiaIntensiva) {
        this.terapiaIntensiva = terapiaIntensiva;
    }

    public int getTotaleOspedalizzati() {
        return totaleOspedalizzati;
    }

    public void setTotaleOspedalizzati(int totaleOspedalizzati) {
        this.totaleOspedalizzati = totaleOspedalizzati;
    }

    public int getIsolamentoDomiciliare() {
        return isolamentoDomiciliare;
    }

    public void setIsolamentoDomiciliare(int isolamentoDomiciliare) {
        this.isolamentoDomiciliare = isolamentoDomiciliare;
    }

    public int getTotalePositivi() {
        return totalePositivi;
    }

    public void setTotalePositivi(int totalePositivi) {
        this.totalePositivi = totalePositivi;
    }

    public int getVariazioneTotalePositivi() {
        return variazioneTotalePositivi;
    }

    public void setVariazioneTotalePositivi(int variazioneTotalePositivi) {
        this.variazioneTotalePositivi = variazioneTotalePositivi;
    }

    public int getNuoviPositivi() {
        return nuoviPositivi;
    }

    public void setNuoviPositivi(int nuoviPositivi) {
        this.nuoviPositivi = nuoviPositivi;
    }

    public int getDimessiGuariti() {
        return dimessiGuariti;
    }

    public void setDimessiGuariti(int dimessiGuariti) {
        this.dimessiGuariti = dimessiGuariti;
    }

    public int getDeceduti() {
        return deceduti;
    }

    public void setDeceduti(int deceduti) {
        this.deceduti = deceduti;
    }

    public int getCasiDaSospettoDiagnostico() {
        return casiDaSospettoDiagnostico;
    }

    public void setCasiDaSospettoDiagnostico(int casiDaSospettoDiagnostico) {
        this.casiDaSospettoDiagnostico = casiDaSospettoDiagnostico;
    }

    public int getCasiDaScreening() {
        return casiDaScreening;
    }

    public void setCasiDaScreening(int casiDaScreening) {
        this.casiDaScreening = casiDaScreening;
    }

    public int getTotaleCasi() {
        return totaleCasi;
    }

    public void setTotaleCasi(int totaleCasi) {
        this.totaleCasi = totaleCasi;
    }

    public int getTamponi() {
        return tamponi;
    }

    public void setTamponi(int tamponi) {
        this.tamponi = tamponi;
    }

    public int getCasiTestati() {
        return casiTestati;
    }

    public void setCasiTestati(int casiTestati) {
        this.casiTestati = casiTestati;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getIngressiTerapiaIntensiva() {
        return ingressiTerapiaIntensiva;
    }

    public void setIngressiTerapiaIntensiva(int ingressiTerapiaIntensiva) {
        this.ingressiTerapiaIntensiva = ingressiTerapiaIntensiva;
    }

    public String getNote_test() {
        return note_test;
    }

    public void setNote_test(String note_test) {
        this.note_test = note_test;
    }

    public String getNoteCasi() {
        return noteCasi;
    }

    public void setNoteCasi(String noteCasi) {
        this.noteCasi = noteCasi;
    }

    public int getTotalePositiviTestMolecolare() {
        return totalePositiviTestMolecolare;
    }

    public void setTotalePositiviTestMolecolare(int totalePositiviTestMolecolare) {
        this.totalePositiviTestMolecolare = totalePositiviTestMolecolare;
    }

    public int getTotalePositiviTestAntigenicoRapido() {
        return totalePositiviTestAntigenicoRapido;
    }

    public void setTotalePositiviTestAntigenicoRapido(int totalePositiviTestAntigenicoRapido) {
        this.totalePositiviTestAntigenicoRapido = totalePositiviTestAntigenicoRapido;
    }

    public int getTamponiTestMolecolare() {
        return tamponiTestMolecolare;
    }

    public void setTamponiTestMolecolare(int tamponiTestMolecolare) {
        this.tamponiTestMolecolare = tamponiTestMolecolare;
    }

    public int getTamponiTestAntigenicoRapido() {
        return tamponiTestAntigenicoRapido;
    }

    public void setTamponiTestAntigenicoRapido(int tamponiTestAntigenicoRapido) {
        this.tamponiTestAntigenicoRapido = tamponiTestAntigenicoRapido;
    }

    public Regione getRegione() {
        return regione;
    }

    public void setRegione(Regione regione) {
        this.regione = regione;
    }
}
