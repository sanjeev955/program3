public import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class Student {
    private String name;
    private LocalDate dob;

    public Student(String name, String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // Adjust format if needed
        this.name = name;
        this.dob = LocalDate.parse(dob, formatter);
    }
    public int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + getAge() + " years");
    }
    public static void main(String[] args) {
        Student student1 = new Student("Sanjeev", "15-08-2002");
        student1.displayDetails();
    }
}
