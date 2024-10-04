package src.oop.sprint1;

abstract class Fordon {
    private int hastighet;
    private int vikt;

    Fordon (){}
    public Fordon(int hastighet, int vikt) {
        this.hastighet = hastighet;
        this.vikt = vikt;
    }

    public void ändraHastighet (int hastighet){


    }


    public int getHastighet() {
        return hastighet;
    }

    public int getVikt() {
        return vikt;
    }
}
