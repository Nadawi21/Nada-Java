package src.oop.sprint1;

import oop.Printable;

public class Bil extends Fordon implements Printable {
    private int antalVäxlar;
    private int växelJustNu;

    public Bil(int hastighet, int vikt) {
        super(hastighet, vikt);
    }


    public void växla(int antalVäxlar){

    }

    @Override
    public void printMe() {

    }
}
