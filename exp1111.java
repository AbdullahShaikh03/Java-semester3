class Student {
    // Private data members (Encapsulation)
    private String name;
    private int rollNumber;
    private char grade;
    // Constructor to initialize student details
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }
    // Public method to display student details (Code Reuse)
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("----------------------");
    }
}
//Main class to test Student objects
public class Main {
    public static void main(String[] args) {
        // Creating student objects (Object creation)
        Student student1 = new Student("Afrah", 34, 'A');
        Student student2 = new Student("Fardeen", 43, 'A');
        // Displaying student details
        student1.displayDetails();
        student2.displayDetails();
    }
}