// Base class
class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}

// Single Inheritance: Student inherits from Person
class SE_Student extends Person {
    protected int rollNumber;

    public SE_Student(String name, int rollNumber) {
        super(name);
        this.rollNumber = rollNumber;
    }

    // Overridable method
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Multilevel Inheritance: GraduateStudent inherits from Student
class GraduateStudent extends SE_Student {
    private String specialization;

    public GraduateStudent(String name, int rollNumber, String specialization) {
        super(name, rollNumber);
        this.specialization = specialization;
    }

    // Method Overriding (Runtime Polymorphism)
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
    }
}

// Interface 1: for multiple inheritance
interface ScholarshipHolder {
    void displayScholarshipAmount();
}

// Interface 2: for multiple inheritance
interface SportsPlayer {
    void displaySport();
}

// Class implementing multiple interfaces
class AllRounderStudent extends GraduateStudent implements ScholarshipHolder, SportsPlayer {
    private double scholarshipAmount;
    private String sport;

    public AllRounderStudent(String name, int rollNumber, String specialization, double scholarshipAmount, String sport) {
        super(name, rollNumber, specialization);
        this.scholarshipAmount = scholarshipAmount;
        this.sport = sport;
    }

    @Override
    public void displayScholarshipAmount() {
        System.out.println("Scholarship Amount: $" + scholarshipAmount);
    }

    @Override
    public void displaySport() {
        System.out.println("Sport: " + sport);
    }

    // Overriding displayInfo to add more details
    @Override
    public void displayInfo() {
        super.displayInfo(); // call GraduateStudent's displayInfo
        displayScholarshipAmount();
        displaySport();
    }
}

// Main class to run the demo
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Graduate Student Info ===");
        GraduateStudent gradStudent = new GraduateStudent(" TAMANNA ", 15, "Computer Science");
        gradStudent.displayInfo();

        System.out.println("\n=== All-Rounder Student Info ===");
        AllRounderStudent allRounder = new AllRounderStudent("ZIDAN", 38, "Electrical Engineering", 1500.00, "Basketball");
        allRounder.displayInfo(); // Runtime Polymorphism
    }
}