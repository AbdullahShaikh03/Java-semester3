//Student class with Constructor and Method Overloading
class SEStudent {
private String name;
private int rollNumber;
private int marks;
// Constructor 1: Only name and roll number
public SEStudent(String name, int rollNumber) {
this.name = name;
this.rollNumber = rollNumber;
this.marks = -1; // default value indicating marks not set
}
// Constructor 2: Name, roll number, and marks
public SEStudent(String name, int rollNumber, int marks) {
this.name = name;
this.rollNumber = rollNumber;
this.marks = marks;
}
// Method 1: Display name and roll number only
public void display() {
System.out.println("Name: " + name);
System.out.println("Roll Number: " + rollNumber);
}
// Method 2: Display all details including marks
public void display(boolean showMarks) {
display(); // reuse the basic display
if (showMarks && marks != -1) {
System.out.println("Marks: " + marks);
} else if (showMarks) {
System.out.println("Marks: Not Available");
}
}
}

//Main class to test the program
public class Lab_02 {
public static void main(String[] args) {
// Using Constructor 1
SEStudent student1 = new SEStudent("AMIR KAHN", 101);
// Using Constructor 2
SEStudent student2 = new SEStudent("ALKESH", 102, 90);
// Using Method Overloading
System.out.println("Student 1 (Basic Info):");
student1.display(); // name and roll number only
System.out.println("\nStudent 2 (Full Info):");
student2.display(true); // name, roll number, and marks
}
}