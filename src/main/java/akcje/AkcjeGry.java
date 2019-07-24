package akcje;


import application.Losowanie;
import console.ConsoleOperations;

import java.io.IOException;

public class AkcjeGry {

    private ConsoleOperations consoleOperations;

    public AkcjeGry(ConsoleOperations consoleOperations) {
        this.consoleOperations = consoleOperations;
    }

    public Integer losujZdarzenie() {
        Losowanie losowanie = new Losowanie();
        Integer wylosowane = losowanie.losuj();
        return wylosowane;
    }

    public String pobierzZdarzenie(Integer wylosowane){
        if (wylosowane <= 15) {
            return "Smok";
        } else if (wylosowane > 15 && wylosowane <= 30) {
            return "Gargulec";
        } else if (wylosowane > 30 && wylosowane <= 45) {
            return "Olbrzym";
        } else if (wylosowane > 45 && wylosowane <= 60) {
            return "Duch";
        } else {
            return "nic";
        }
    }


    public String wykonajRuch() throws IOException {
        System.out.println("Gdzie się udasz ? (N, S, W, E) ");
        String ruch = sprawdzRuch(consoleOperations.czytajZKonsoli());
        String zdarzenie = pobierzZdarzenie(losujZdarzenie());
        return zdarzenie;
    }

    public String sprawdzRuch(String ruch) {
        if (ruch != null && ruch.isEmpty()) {
            throw new IllegalArgumentException("Pusta wartosc! Wyjatek");
        }
        if ("N".equalsIgnoreCase(ruch)) {
            return "Polnoc";
        } else if ("S".equalsIgnoreCase(ruch)) {
            return "Poludnie";
        } else if ("E".equalsIgnoreCase(ruch)) {
            return "Wschod";
        } else if ("W".equalsIgnoreCase(ruch)) {
            return "Zachod";
        } else {
            return "niewlasciwy kierunek";
        }
    }

}
