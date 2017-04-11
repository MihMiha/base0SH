package ipodrom;

import java.util.Random;

public class Hippodrome {
    public static void main(String[] args) {
        Horse[] horses = new Horse[10];
        Random random = new Random();

        for (int i = 0; i < horses.length; i++) {
            horses[i] = new Horse();
            horses[i].name="буцик "+i;
            horses[i].age = 1 + random.nextInt(10);
            horses[i].speed = 10 + random.nextInt(100);
            horses[i].isMail =  random.nextBoolean();

        }
        for (Horse hors : horses) {

            hors.ride();
        }
    }
}
