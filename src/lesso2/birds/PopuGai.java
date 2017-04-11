package lesso2.birds;

public class PopuGai extends Bird {
    private String language;

    public PopuGai(String name, int h, String language) {

        super(name, h);
        this.language = language;
    }

    public void speak() {
        System.out.println(name + " speek " + language + " язык");
    }

    @Override
    public void voice() {
        System.out.println(name+" speekspeek");
    }
}
