package src.oop.sprint1;

import oop.Printable;

public class Cykel extends Fordon implements Printable {
    private int antalVäxlar;
    private int växelJustNu;


    public Cykel(int hastighet, int vikt, int antalVäxlar) {
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
    }

    public void växla(int antalVäxlar){

    }

    @Override
    public void printMe() {

    }
}
