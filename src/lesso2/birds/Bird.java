package lesso2.birds;

import lesso2.Animal;

public class Bird extends Animal {
    private int h;



    public Bird(String name, int h) {
        super(name);
        this.h = h;
    }

    public void fly() {
        System.out.println( name+" летает навысоте "+h);
    }

    @Override
    public void voice() {
        System.out.println(name+ " chr-chr");
    }
}
