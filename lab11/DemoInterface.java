 package javafullstack;  
 // Define an interface Person1 with an abstract method speak()
interface Person1 {
    void speak();
}

// Implement the Person1 interface in the Student1 class
class Student1 implements Person1 {
    // Override the speak() method to specify behavior for students
    public void speak() {
        System.out.println("I am a student.");
    }
}

// Implement the Person1 interface in the Teacher class
class Teacher implements Person1 {
    // Override the speak() method to specify behavior for teachers
    public void speak() {
        System.out.println("I am a teacher.");
    }
}

// Main class DemoInterface to demonstrate the usage of interfaces and classes
public class DemoInterface {
    public static void main(String[] args) {
        // Create an object of Student1 and reference it using the Person1 interface
        Person1 student1 = new Student1();
        
        // Create an object of Teacher and reference it using the Person1 interface
        Person1 teacher = new Teacher();
        
        // Call the speak() method on the student1 object, which invokes Student1's implementation
        student1.speak();
        
        // Call the speak() method on the teacher object, which invokes Teacher's implementation
        teacher.speak(); 
    }
}
