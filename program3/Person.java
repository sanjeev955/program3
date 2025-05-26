package program3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class Person {
    private String name;
    private LocalDate dob;

    public Person(String name, String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // Adjust format if needed
        this.name = name;
        this.dob = LocalDate.parse(dob, formatter);
    }

    public int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }

    public void displayDetails() {
        System.out.println("Person Name: " + name);
        System.out.println("Age: " + getAge() + " years");
    }
}

