package lesso2;

import lesso2.birds.Bird;

public class Main {
    public static void main(String[] args) {
//        Animal cat = new Cat("cat");
//        Animal dog = new Dog("dog");
        Animal animal = new Bird("biard", 70);
//        Animal popuGai =new PopuGai("KeSha", 1, "руский");
//        Animal snake = new Snake("zmeay");
//        cat.voice();
//        dog.voice();
//        biard.voice();
//        popuGai.voice();
//        snake.voice();
        System.out.println(animal instanceof Bird );
        System.out.println(animal instanceof Animal);
        System.out.println(animal instanceof Dog );
    }
}
