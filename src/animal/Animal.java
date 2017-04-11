package animal;

public class Animal {
    protected float maxRunDist;
    protected float maxSwim;
    protected float maxJamp;
    protected final String name;

    public Animal(String name) {
        this.name = name;
    }

    public void run(float dist) {
        if (dist <= maxRunDist) {
            System.out.println(name + " пробежал " + dist + " м");

        } else {
            System.out.println(name + " не смог пробежать " + dist + " м");
        }
    }

    public void jump(float height) {
        if (height <= maxJamp) {
            System.out.println(name + " перепрыгнул " + height + " м");

        } else {
            System.out.println(name + " не смог перепрыгнуть " + height + " м");
        }
    }public void swim(float dist) {
        if (dist <= maxSwim) {
            System.out.println(name + " переплыл " + dist + " м");

        } else {
            System.out.println(name + " не смог переплыть " + dist + " м");
        }
    }
}
