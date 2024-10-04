package src;

import java.io.*;
import java.util.Random;

public class Dice {
    // Metod nr. 1
    public static void createFile () {
        for (int i = 0; i < 1000; i++) {
            Random diceNumber = new Random();
            int diceNumberRandom = diceNumber.nextInt((6 - 1) + 1) + 1;

            try (PrintWriter diceNumbersFile = new PrintWriter
                    (new BufferedWriter
                            (new FileWriter("DiceNumber.txt", true)))) {
                diceNumbersFile.print(diceNumberRandom + " ");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    //Metod nr. 2
    public static int [] createArray (){
            int[] diceNumberArray = new int[1000];

            try (BufferedReader input = new BufferedReader(new FileReader("DiceNumber.txt"))) {
                String arrayLine = input.readLine();
                int counter=0;
                for (int i= 0; i<arrayLine.length(); i++){
                    if (Character.isDigit(arrayLine.charAt(i))){
                        diceNumberArray[counter]=Integer.parseInt(String.valueOf(arrayLine.charAt(i)));
                        counter++;
                    }

                }

        } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

         return diceNumberArray;

        }
    // Metod nr. 3
    public static int[] analyseArray(int[] diceNumberArray){
        int [] secondArray = new int [6];
             for (int i=0; i<diceNumberArray.length; i++){
                 secondArray [diceNumberArray [i]-1]++;

             }
        return secondArray;
    }
}


