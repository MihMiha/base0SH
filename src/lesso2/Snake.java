package lesso2;

public class Snake extends Animal {
    public Snake(String name) {
        super(name);
    }

    @Override
    public void moveOn() {
      super.moveOn();
        System.out.println(name+" ползаю по земле");
    }

    @Override
    public void voice() {
        System.out.println(name+" shhhhhh");
    }
}
