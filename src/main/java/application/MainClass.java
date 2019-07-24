package application;

import akcje.AkcjeGry;
import console.ConsoleOperations;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.inicjujGre();
    }

    public void inicjujGre() {
        ConsoleOperations consoleOperations = new ConsoleOperations();
        List<String> przeciwnicy = Arrays.asList("Smok", "Gargulec", "Olbrzym", "Duch");
        try {
            Gracz gracz = consoleOperations.stworzGracza();
            Gra gra = new Gra(gracz, przeciwnicy);
            graj(gra, consoleOperations);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void graj(Gra gra, ConsoleOperations consoleOperations) throws IOException {
        AkcjeGry akcjeGry = new AkcjeGry(consoleOperations);
        while (true) {
            String zdarzenie = akcjeGry.wykonajRuch();
            if(!zdarzenie.equalsIgnoreCase("nic")){
                consoleOperations.wypiszNaKonsoli("Spotykasz na swej drodze : " + zdarzenie);
            }
        }
    }

}
