package javafullstack;
import java.util.ArrayList;

//Define the Student class
class Student {
 private String name;
 private int age;
 private String studentId;

 // Constructor
 public Student(String name, int age, String studentId) {
     this.name = name;
     this.age = age;
     this.studentId = studentId;
 }

 // Getters
 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 public String getStudentId() {
     return studentId;
 }

 // Override the toString() method to print student details
 @Override
 public String toString() {
     return "Student{name='" + name + "', age=" + age + ", studentId='" + studentId + "'}";
 }
}

public class Studenttt {
 public static void main(String[] args) {
     // Create an ArrayList to store Student objects
     ArrayList<Student> students = new ArrayList<>();

     // Add 10 Student objects to the ArrayList
     students.add(new Student("Venkat", 20, "01"));
     students.add(new Student("Upender", 22, "02"));
     students.add(new Student("Srinu", 21, "03"));
     students.add(new Student("Balu", 23, "04"));
     students.add(new Student("Charlie", 19, "05"));
     students.add(new Student("salman", 20, "06"));
     students.add(new Student("Roshan", 22, "07"));
     students.add(new Student("jackie", 21, "08"));
     students.add(new Student("Chiru", 23, "09"));
     students.add(new Student("Naidu", 19, "10"));

     // Use a for-each loop to print each student
     for (Student student : students) {
         System.out.println(student);
     }
 }
}