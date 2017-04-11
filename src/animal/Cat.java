package animal;
public class Cat extends Animal {

    public Cat(String name) {
        super(name);
        maxRunDist = 2000f;

        maxJamp = 1.2f;

    }

    @Override
    public void swim(float dist) {
        System.out.println(name+" не умет плавать");
    }
}
