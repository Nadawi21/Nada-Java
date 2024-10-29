package src.oop.sprint2_inlämningsuppgift;

import java.time.LocalDate;

public class Customer {

    private String personalNumber;
    private String name;
    private LocalDate date;

   //Getters
    public String getName() {
        return name;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public LocalDate getDate() {
        return date;
    }

   //konstruktor
    public Customer(String personalNumber, String name, LocalDate date) {
        this.name = name;
        this.personalNumber = personalNumber;
        this.date = date;
    }
}

