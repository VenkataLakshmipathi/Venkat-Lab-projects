package javafullstack;
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println(name + " is " + age + " years old");
    }

    public class Student {
        int grade;
        Person person;

        public Student(int grade, Person person) {
            this.grade = grade;
            this.person = person;
        }

        public void study() {
            System.out.println(person.name + " is studying for grade " + this.grade);
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Venkat", 23);
        Student student = person.new Student(16, person);

        person.speak();
        student.study();
    }
}