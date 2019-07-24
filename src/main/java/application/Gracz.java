package application;

public class Gracz {

    private String bron;

    private String imie;
    private String nazwikso;
    private int wiek;

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public Gracz(String imie, Integer wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public String getBron() {
        return bron;
    }

    public void setBron(String bron) {
        this.bron = bron;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwikso() {
        return nazwikso;
    }

    public void setNazwikso(String nazwikso) {
        this.nazwikso = nazwikso;
    }
}
