package src.oop.sprint1.inlämningsuppgift;

import javax.swing.*;

public class GreenestVäxtHotell {
    public static void main(String[] args) {

        while (true) {
            String väljaVäxt = JOptionPane.showInputDialog("Vilken växt ska få vätska?”");
    //OBS: polymorfism
            Växter igge = new Kaktusar(0.2, 2, "Igge");
            Växter laura = new Palmer(5, 0.5, "Laura");
            Växter meatloaf = new KöttätandeVäxter(0.7, 20, "Meatloaf", 10);
            Växter olof = new Palmer(1, 0.5, "Olof");
    //anropar vattna-metoden
            igge.vattna();
            laura.vattna();
            meatloaf.vattna();
            olof.vattna();
    /* if-satser för utskrifter
       obs: enum kommer till användning här
     */
            if (väljaVäxt.equalsIgnoreCase("avbryt")) {
                break;
            }
            if (väljaVäxt.trim().length() == 0){
                JOptionPane.showMessageDialog(null, "Du måste mata in ett namn!" );
            } else if (väljaVäxt.equalsIgnoreCase(igge.getNamn())) {
                JOptionPane.showMessageDialog(null, igge.getNamn() + " " + "behöver" + " " +igge.vattna() + " " + "cl" +" " + VätskaTyp.MINERALVATTEN.getVätska()+ " " + "per dag");
            } else if (väljaVäxt.equalsIgnoreCase(laura.getNamn())) {
                System.out.println(laura.vattna());
                JOptionPane.showMessageDialog(null, (laura.getNamn()) + " " + "behöver" + " " + (laura.vattna()) + " " + "l" +" " + VätskaTyp.KRANVATTEN.getVätska() + " " + "per dag");
            } else if (väljaVäxt.equalsIgnoreCase(meatloaf.getNamn())) {
                System.out.println(meatloaf.vattna());
                JOptionPane.showMessageDialog(null, meatloaf.getNamn() + " " + "behöver" + " " + meatloaf.vattna() + " " + "cl" +" " + VätskaTyp.PROTEINDRYCK.getVätska()+ " " + "per dag");
            } else if (väljaVäxt.equalsIgnoreCase(olof.getNamn())) {
                System.out.println(olof.vattna());
                JOptionPane.showMessageDialog(null, olof.getNamn() + " " + "behöver" + " " + olof.vattna() + " " + "l" +" " + VätskaTyp.KRANVATTEN.getVätska()+ " " + "per dag");
            } else {
                JOptionPane.showMessageDialog(null, "Växten finns inte på hotellet.");
            }
        }
    }
}





