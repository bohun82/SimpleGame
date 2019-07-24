package application;

import java.util.Random;

public class Losowanie {

    public Integer losuj() {
        Random random = new Random();
        return random.nextInt(100);
    }

}
