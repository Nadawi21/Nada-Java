package src.oop;

public class Person {

    private String name;
    private String adress;
    private int age;


    //getter
    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getAge() {
        return age;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //konstruktor
    public Person(String name, String adress, int age) {
        this.name = name;
        this.adress = adress;
        this.age = age;
    }

    public Person(){}
}
