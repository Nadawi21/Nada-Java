package src.oop.sprint1;

import oop.Printable;

public class MainFordon {
    public static void main (String [] args){

        Printable f1 = new Båt(2,7,9);
        Printable f2 = new Båt(7,4,1);
        Fordon t1 = new Tåg(7,4,1);
        f1.printMe();

    }
}
