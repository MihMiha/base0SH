package lesso2;

public abstract class Animal {
    protected String name;

//    public Animal() {
//    }

    public Animal(String name) {
        this.name = name;
    }

    public void moveOn() {
        System.out.println( name+" ходит лапами по земле");
    }

    public abstract void voice() ;
}
