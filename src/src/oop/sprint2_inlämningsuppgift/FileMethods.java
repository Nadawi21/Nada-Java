package src.oop.sprint2_inlämningsuppgift;

import javax.swing.*;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class FileMethods {

    //Definierar dateformatter
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    //Metod som läser från fil och placerar info i arrayList
    public static ArrayList<Customer> readCustomerData(){
        String temp;
        ArrayList<Customer> customerInfoList = new ArrayList<>();
        try (BufferedReader bufIn = new BufferedReader(new FileReader("src/src/oop/Sprint2_inlämningsuppgift/CustomerData"))) {
            while ((temp = bufIn.readLine()) != null) {
                //Delar upp informationen
                String firstLine = temp;
                String secondLine = bufIn.readLine().trim();
                //Delar upp första raden för varje person
                String firstLinesplit = firstLine;
                String[] myArray = firstLinesplit.split(",");

                String personalNumber = myArray[0];
                String customerName = myArray[1];

                //Omvandlar sträng till datum
                DateTimeFormatter formatter
                        = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate registrationDate = LocalDate.parse(secondLine, formatter);
                //Skapar objekt och lägger in i arraylisten
                Customer myCustomer = new Customer(personalNumber.trim(), customerName.trim(), registrationDate);
                customerInfoList.add(myCustomer);

            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Filen hittas inte.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ett fel inträffade.");
        }
        return customerInfoList;
    }

    //Metod som skriver info till fil
    public static void costumerVisit(Customer customer) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/src/oop/Sprint2_inlämningsuppgift/CustomerVisit", true))) {
            String visitInfo = customer.getName() + "," + customer.getPersonalNumber() + "," + LocalDate.now().format(DATE_FORMATTER) + "\n";
            writer.write(visitInfo);
        }
    }

}
