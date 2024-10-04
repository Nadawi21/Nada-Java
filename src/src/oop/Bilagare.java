package src.oop;

public class Bilagare extends Person{

    private Bil bil;

    public Bilagare(String name, String adress, int age, Bil bil) {
        super(name, adress, age);
        this.bil = bil;
    }

    public Bilagare(String name, String adress, int age) {
        super(name, adress, age);
    }
    public Bilagare(Bil bil) {
        this.bil = bil;
    }

    public void kopBil(Bil i_bil){
        bil = i_bil;
    }

    public void saljBil(){
        bil = null;
    }

    public Bil getBil() {
        return bil;
    }
}
