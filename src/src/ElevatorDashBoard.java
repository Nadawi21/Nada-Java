package src;

import javax.swing.*;

public class ElevatorDashBoard {
    public static void main(String[] args) {

        Elevator myElevator = new Elevator(5);
        while (true){
            String newLevel = JOptionPane.showInputDialog("Vilken våning vill du åka till?");
            try {
                int newLevelInt = Integer.parseInt(newLevel);
                if(newLevelInt<-2 || newLevelInt>10){
                    JOptionPane.showMessageDialog ( null,"Ogiltig våningsnummer, testa på nytt!");
                }
                myElevator.goTo(newLevelInt);
                myElevator.where(newLevelInt);
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Du matade in fel värde. Mata in en siffra!");
            }
        }
    }
}
