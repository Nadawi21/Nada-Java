package src;

import javax.swing.*;

public class Uppgift1VG {
    public static void main(String[] args) {
        String matematisktUttryck = JOptionPane.showInputDialog("Skriv in ett matematiskt uttryck:");
        if (matematisktUttryck.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fel inmatning, det får inte vara tomt!");

        }

        if (!(matematisktUttryck.contains("+") || matematisktUttryck.contains("-")
        || matematisktUttryck.contains("*") || matematisktUttryck.contains("/"))){
            JOptionPane.showMessageDialog(null, "Fel tecken matades in");
        }

        //Om operanden ör "+"
        if (matematisktUttryck.contains("+")){
            int indexOfOperation = getIndexOfOperation ("+", matematisktUttryck);

            //firstOperand = operanden till vänster om operationen
            String firstOperand="";
            for (int i = 0; i < indexOfOperation; i++){
                firstOperand = firstOperand + matematisktUttryck.charAt(i);
            }

            //secondOperand = operanden till höger om operationen
            String secondOperand="";
            for (int i = (indexOfOperation + 1); i < matematisktUttryck.length(); i++){
                secondOperand = secondOperand + matematisktUttryck.charAt(i);
            }

            if (firstOperand.contains("+") || firstOperand.contains("*") || firstOperand.contains("/") ||
                    (firstOperand.contains("-") && firstOperand.charAt(0) != '-')|| firstOperand.length()>0){
                JOptionPane.showMessageDialog(null, "Fel tecken matades in");
            }

            if (secondOperand.contains("+") || secondOperand.contains("*") || secondOperand.contains("/") ||
                    (secondOperand.contains("-") && secondOperand.charAt(0) != '-')|| secondOperand.length()>0){
                JOptionPane.showMessageDialog(null, "Fel tecken matades in");
            }

try {
    Double firstOperandDouble= Double.parseDouble(firstOperand);
    Double secondOperandDouble= Double.parseDouble(secondOperand);
    JOptionPane.showMessageDialog(null,firstOperandDouble + secondOperandDouble);
}catch (Exception e){
    JOptionPane.showMessageDialog(null, "Fel tecken matades in, mata endas in reella tal!");
}

        }

//Om operanden är "*"
        if (matematisktUttryck.contains("*")){
            int indexOfOperation = getIndexOfOperation ("*", matematisktUttryck);
            String firstOperand="";

            for (int i = 0; i < indexOfOperation; i++){
                firstOperand = firstOperand + matematisktUttryck.charAt(i);
            }

            String secondOperand="";
            for (int i = (indexOfOperation + 1); i < matematisktUttryck.length(); i++){
                secondOperand = secondOperand + matematisktUttryck.charAt(i);
            }

            if (firstOperand.contains("+") || firstOperand.contains("*") || firstOperand.contains("/") ||
                    (firstOperand.contains("-") && firstOperand.charAt(0) != '-') || firstOperand.length()>0){
                JOptionPane.showMessageDialog(null, "Fel tecken matades in");
            }

            if (secondOperand.contains("+") || secondOperand.contains("*") || secondOperand.contains("/") ||
                    (secondOperand.contains("-") && secondOperand.charAt(0) != '-') || secondOperand.length()>0){
                JOptionPane.showMessageDialog(null, "Fel tecken matades in");
            }

            try {
                Double firstOperandDouble= Double.parseDouble(firstOperand);
                Double secondOperandDouble= Double.parseDouble(secondOperand);
                JOptionPane.showMessageDialog(null,firstOperandDouble * secondOperandDouble);
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Fel tecken matades in, mata endas in reella tal!");

            }
        }

        //Om operanden är"/"
        if (matematisktUttryck.contains("/")){
            int indexOfOperation = getIndexOfOperation ("/", matematisktUttryck);
            String firstOperand="";
            for (int i = 0; i < indexOfOperation; i++){
                firstOperand = firstOperand + matematisktUttryck.charAt(i);
            }

            String secondOperand="";
            for (int i = (indexOfOperation + 1); i < matematisktUttryck.length(); i++){
                secondOperand = secondOperand + matematisktUttryck.charAt(i);
            }

            if (firstOperand.contains("+") || firstOperand.contains("*") || firstOperand.contains("/") ||
                    (firstOperand.contains("-") && firstOperand.charAt(0) != '-')| firstOperand.length()>0){
                JOptionPane.showMessageDialog(null, "Fel tecken matades in");
            }

            if (secondOperand.contains("+") || secondOperand.contains("*") || secondOperand.contains("/") || secondOperand.equals("0") ||
                    (secondOperand.contains("-") && secondOperand.charAt(0) != '-') || secondOperand.length()>0){
                JOptionPane.showMessageDialog(null, "Fel tecken matades in");
                return;
            }

            try {
                Double firstOperandDouble= Double.parseDouble(firstOperand);
                Double secondOperandDouble= Double.parseDouble(secondOperand);
                JOptionPane.showMessageDialog(null,firstOperandDouble / secondOperandDouble);
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Fel tecken matades in, mata endas in reella tal!");
            }

        }

//Om operanden är "-"
        if (matematisktUttryck.substring(1).contains("-")){
            int indexOfOperation = getIndexOfOperation ("-", matematisktUttryck.substring(1));
            indexOfOperation++;
            String firstOperand="";
            for (int i = 0; i < indexOfOperation; i++){
                firstOperand = firstOperand + matematisktUttryck.charAt(i);
            }

            String secondOperand="";
            for (int i = (indexOfOperation + 1); i < matematisktUttryck.length(); i++){
                secondOperand = secondOperand + matematisktUttryck.charAt(i);
            }

            if (firstOperand.contains("+") || firstOperand.contains("*") || firstOperand.contains("/") ||
                    (firstOperand.contains("-") && firstOperand.charAt(0) != '-')| firstOperand.length()>0){
                JOptionPane.showMessageDialog(null, "Fel tecken matades in");
            }
            if (secondOperand.contains("+") || secondOperand.contains("*") || secondOperand.contains("/") || secondOperand.equals("0") ||
                    (secondOperand.contains("-") && secondOperand.charAt(0) != '-') || secondOperand.length()>0){
                JOptionPane.showMessageDialog(null, "Fel tecken matades in");
                return;
            }

            try {
                Double firstOperandDouble= Double.parseDouble(firstOperand);
                Double secondOperandDouble= Double.parseDouble(secondOperand);
                JOptionPane.showMessageDialog(null,firstOperandDouble - secondOperandDouble);
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Fel tecken matades in, mata endas in reella tal!");
            }
        }
    }

    public static int getIndexOfOperation(String operation, String input) {
        return input.indexOf(operation);
    }


}

