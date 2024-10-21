package src.oop.sprint2_inlämningsuppgift;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.io.IOException;


public class BestGymEver {
    public static void main(String[] args) {

        // Skapar arraylist och anropar readCustomerData
        ArrayList<Customer> customerInfoList = FileMethods.readCustomerData();

        // Receptionistens input
        String receptionistInput = JOptionPane.showInputDialog(null, "Vilken kund vill du ha information om?");
        if (receptionistInput.trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Du måste mata in ett namn eller personnummer!");
            return;
        }

        boolean existInFile = false;

        //Loop som kollar om det inmatade namnet eller personnumret finns och skriver ut rätt meddelande
        for (Customer c : customerInfoList) {
            if (c.getName().equalsIgnoreCase(receptionistInput) || c.getPersonalNumber().equals(receptionistInput)) {
                Period p = Period.between(c.getDate(), LocalDate.now());
                int periodInDays = p.getDays() + (p.getMonths() * 30) + (p.getYears() * 365);
                    if (periodInDays < 365) {
                        JOptionPane.showMessageDialog(null, c.getName() + " " + "är medlem hos Best Gym Ever.");
                        existInFile = true;
                        try {
                            //om personen är medlem då registreras besöket
                            FileMethods.costumerVisit(c);
                            JOptionPane.showMessageDialog(null, "Besöket har registrerats.");
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "Det gick inte att skriva till filen.");
                            return;
                        }
                    }
                    if (periodInDays > 365) {
                        existInFile = true;
                        JOptionPane.showMessageDialog(null, c.getName() + " " + "var medlem hos Best Gym Ever för mer än 1 år sedan.");
                    }
                }
            }
            if (!existInFile) {
                JOptionPane.showMessageDialog(null, receptionistInput + " " + "finns inte i systemet och har inte varit medlem hos Best Gym Ever.");
            }
        }
    }






