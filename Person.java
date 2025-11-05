// Parent Class
class Person {
    String name;
    int age;

    void inputPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child Class
class StudentSingle extends Person {
    int rollNumber;

    void inputStudent(String name, int age, int rollNumber) {
        inputPerson(name, age);
        this.rollNumber = rollNumber;
    }

    void displayStudent() {
        displayPerson();
        System.out.println("Roll Number: " + rollNumber);
    }

    public static void main(String[] args) {
        StudentSingle s = new StudentSingle();
        s.inputStudent("Alice", 20, 101);
        s.displayStudent();
    }
}

