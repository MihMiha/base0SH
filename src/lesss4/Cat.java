package lesss4;

public class Cat {
    private String namee;
    private String colore;
    private int age;

    public Cat(String namee, String colore, int age) {
        this.namee = namee;
        this.colore = colore;
        this.age = age;
    }

    public Cat(String namee) {

    this.namee = namee;
     colore = "wfwf";
      age = 1;
    }

    public void printInfo() {
        System.out.println("cat name "+namee+" color "+colore+" "+age);
    }

    public String getNamee() {
        return namee;
    }

    public String getColore() {
        return colore;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
