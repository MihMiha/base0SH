package ipodrom;

public class Horse {

    String name;
    int speed;
    String color;
    boolean isMail;
    int age;

    void eat() {
        System.out.println("eatin");

    }

    void about() {
        String sex = (isMail) ? "Male" : "Femail";
        System.out.printf(" name ; %s, age; %d, sex; %s \t\t",name,age,sex);
    }

    void ride() {
        about();
        System.out.println("скачу  со скростью "+speed);
    }
}
