package src.oop.sprint1;

import oop.Printable;

public class Tåg extends Fordon implements Printable {
    private int antalVagnar;

    public Tåg(int hastighet, int vikt, int antalVagnar) {
        super(hastighet, vikt);
        this.antalVagnar = antalVagnar;
    }

    public void kopplaVagn (int antalVagnar){
    }

    @Override
    public void printMe() {
        System.out.println("Hastighet:" + getHastighet() + "\nVikt" + getVikt() + "\nantalvagnar:" + antalVagnar);
    }
}
