package com.example.pma;

public class Turizam {
    private String naziv;
    private String ocena;
    private String datum;
    private String opis;
    private Integer slika;

    public Turizam(String naziv, String ocena, String datum, Integer slika,String opis) {
        this.naziv = naziv;
        this.ocena = ocena;
        this.datum = datum;
        this.slika = slika;
        this.opis = opis;

    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOcena() {
        return ocena;
    }

    public void setOcena(String ocena) {
        this.ocena = ocena;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }


    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Integer getSlika() {
        return slika;
    }

    public void setSlika(Integer slika) {
        this.slika = slika;
    }
}
