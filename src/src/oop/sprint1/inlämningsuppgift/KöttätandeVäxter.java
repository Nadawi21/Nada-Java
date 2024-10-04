package src.oop.sprint1.inlämningsuppgift;

public class KöttätandeVäxter extends Växter implements Omvårdnad{
    // lägger till en ny instansvariabel
    private double basVätska;

    //konstruktor
    public KöttätandeVäxter(double längd, double vätska, String namn, double basVätska) {
        super(längd, vätska, namn );
        this.basVätska=basVätska;
    }
    //här har jag använt mig av interface
    @Override
    public double vattna() {
        double vattnaKöttätandeVäxt = basVätska + (getVätska()* getLängd());
        return vattnaKöttätandeVäxt;
    }
}
