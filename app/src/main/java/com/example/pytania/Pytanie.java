package com.example.pytania;

public class Pytanie {
    private long idZdjecia;
    private String trescPytania;
    private Boolean poprawnaOdpowiedz;
    //True // False
    private boolean czyPoprawnie ;
    // poprawna odp = True

    public Pytanie(long idZdjecia, String trescPytania, Boolean poprawnaOdpowiedz) {
        this.idZdjecia = idZdjecia;
        this.trescPytania = trescPytania;
        this.poprawnaOdpowiedz = poprawnaOdpowiedz;
        czyPoprawnie = false;
    }

    public long getIdZdjecia() {
        return idZdjecia;
    }

    public String getTrescPytania() {
        return trescPytania;
    }

    public Boolean getPoprawnaOdpowiedz() {
        return poprawnaOdpowiedz;
    }

    public boolean isCzyPoprawnie() {
        return czyPoprawnie;
    }

    public void setCzyPoprawnie(boolean czyPoprawnie) {
        this.czyPoprawnie = czyPoprawnie;
    }
}
