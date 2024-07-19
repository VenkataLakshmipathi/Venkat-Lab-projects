package javafullstack;

// Parent class for storing basic student details
public class StudentDetails {
    protected String studentName; // Protected access for student name
    private int studentId;       // Private access for student ID

    // Constructor to initialize studentName and studentId
    public StudentDetails(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    // Method to display student information
    public void display() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
    }
}