package console;

import application.Gracz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleOperations {

    public Gracz stworzGracza() throws Exception {
        wypiszNaKonsoli("Witaj! Podaj imię gracza");
        String imie = czytajZKonsoli();
        wypiszNaKonsoli("Witaj " + imie);
        wypiszNaKonsoli("Podaj wiek gracza: ");
        String wiekString = czytajZKonsoli();
        Integer wiek = walidujWiek(wiekString);
        if (wiek < 18) {
            throw new Exception("Jestes za mlody");
        }
        Gracz gracz = new Gracz(imie, wiek);
        return gracz;
    }

    public void wypiszNaKonsoli(String tekst) {
        System.out.println(tekst);
    }

    public Integer walidujWiek(String daneWejsciowe) {
        Integer daneWyjsciowe = Integer.parseInt(daneWejsciowe);
        return daneWyjsciowe;
    }

    public String czytajZKonsoli() throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        System.out.println(line);
        return line;
    }
}