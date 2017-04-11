package animal;

public class Main {

    private static final int ANIMAL_SIZE = 3;


    public static void main(String[] args) {
        Animal[] animals = new Animal[ANIMAL_SIZE];

        animals[0] = new Cat("cot");
        animals[1] = new Dog("dog");
        animals[2] = new Horse("horse");
        final float RUN_DIST = 450f;
        final float SWINM_DIST = 16f;
        final float JAMP_DIST = 1.5f;

        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            animal.jump(JAMP_DIST);
            animal.swim(SWINM_DIST);
            animal.run(RUN_DIST);
            System.out.println();
        }
    }



}
