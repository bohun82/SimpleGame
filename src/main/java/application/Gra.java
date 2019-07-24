package application;

import java.util.List;

public class Gra {

    private Gracz gracz;

    private List<String> wrogowie;

    public Gra(Gracz gracz, List<String> wrogowie) {
        this.gracz = gracz;
        this.wrogowie = wrogowie;
    }

    public String attack() {
        return "Gracz atakuje przy pomocy: " + gracz.getBron();
    }

    public int numberOfEnemies() {
        return wrogowie.size();
    }

}
