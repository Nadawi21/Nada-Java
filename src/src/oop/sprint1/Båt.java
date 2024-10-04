package src.oop.sprint1;

import oop.Printable;

public class Båt extends Fordon implements Printable {
    private int dödvikt;

    public Båt(int hastighet, int vikt, int dödvikt) {
        super(hastighet, vikt);
        this.dödvikt = dödvikt;
    }

    public void sväng (int dödvikt){


    }

    @Override
    public void printMe() {
        System.out.println("Hastighet:" + getHastighet() + "\nVikt" + getVikt() + "\ndödvikt:" + dödvikt);
    }

}
