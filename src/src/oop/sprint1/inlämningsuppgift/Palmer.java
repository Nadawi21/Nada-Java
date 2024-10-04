package src.oop.sprint1.inlämningsuppgift;

public class Palmer extends Växter implements Omvårdnad{

    private VätskaTyp vätska = VätskaTyp.KRANVATTEN;

    //konstruktor
    public Palmer(double längd, double vätska, String namn) {
        super(längd, vätska,namn );
    }
    //här har jag använt mig av interface
    @Override
    public double vattna() {
        double vattnaPalm = getLängd() * getVätska();
        return vattnaPalm;
    }
}
