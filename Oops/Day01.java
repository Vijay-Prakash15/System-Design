class Student {
    // Properties
    String name;
    int rollNo;
    int age;

    // Behavior
    void study() {
        System.out.println("Student is Studying.");
    }

    void attendClass() {
        System.out.println("Student is attending class.");
    }
}

public class Day01 {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Vijay";
        s1.rollNo = 101;
        s1.age = 20;

        System.out.println("Name : " + s1.name);
        System.out.println("Roll No : " + s1.rollNo);
        System.out.println("Age : " + s1.age);

        s1.study();
        s1.attendClass();
        Student s3 = new Student();
        s3.name = "Mamta";
        s3.age = 22;
        System.out.println("Name: "+ s3.name);
        System.out.println("Age :"+ s3.age);
        s3.attendClass();
    }
}