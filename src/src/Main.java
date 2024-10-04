package src;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main (String [] args){

        //OBS: filen måste tas bort vid varje körning!
        Dice.createFile();
        int [] createArray2 =Dice.createArray();
        int[] analyseArray2 = Dice.analyseArray(createArray2);
        for (int i=0; i<analyseArray2.length; i++){
            System.out.println ("Nummer" + (i+1) + ":" + analyseArray2[i]);

            try (PrintWriter diceNumbersFile = new PrintWriter
                    (new BufferedWriter
                            (new FileWriter("DiceNumberResult.txt", true)))) {
                diceNumbersFile.print("Nummer" + (i+1) + ":" + analyseArray2 [i] + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
