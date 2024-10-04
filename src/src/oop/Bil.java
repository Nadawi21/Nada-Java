package src.oop;

public class Bil {

    private String regnr;
    private int type;
    private String brand;

     //Konstruktor
    public Bil(String regnr, int type, String brand) {
        this.regnr = regnr;
        this.type = type;
        this.brand = brand;


    }

    @Override
    public String toString() {
        return "Bil{" +
                "regnr='" + regnr + '\'' +
                ", type=" + type +
                ", brand='" + brand + '\'' +
                '}';
    }
}
