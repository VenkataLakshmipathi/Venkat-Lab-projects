package javalabs;

import javafullstack.StudentDetails; // Importing StudentDetails class from javafullstack package

// Child class extending StudentDetails to include grade information
public class StudentId extends StudentDetails {
    private int grade; // Private field to store student's grade

    // Constructor to initialize studentName, studentId, and grade
    public StudentId(String studentName, int studentId, int grade) {
        super(studentName, studentId); // Calling parent class constructor (StudentDetails)
        this.grade = grade; // Initializing grade
    }

    // Method to display extended student information including grade
    public void Grade() {
        super.display(); // Accessing parent class method to display basic details (StudentDetails)
        System.out.println("Grade: " + grade); // Printing student's grade
    }

    // Main method for testing the Student class
    public static void main(String[] args) {
        // Creating an instance of Student
        StudentId student = new StudentId("Venkat", 1, 10);

        // Calling the displayExtended method to display the student's extended information
        student.Grade();
    }
}