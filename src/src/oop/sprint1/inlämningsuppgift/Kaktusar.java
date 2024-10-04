package src.oop.sprint1.inlämningsuppgift;

public class Kaktusar extends Växter implements Omvårdnad{

    //konstruktor
    public Kaktusar(double längd, double vätska, String namn) {
        super(längd, vätska, namn );
    }

    //här har jag använt mig av interface
    @Override
    public double vattna() {
        return 2;
    }
}
