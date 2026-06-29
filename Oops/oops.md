Oops - Objects Oriented Programming

Def - Object-Oriented Programming (OOP) is a programming paradigm that organizes software design around objects—entities that combine data (attributes) and behavior (methods). It uses classes as blueprints to create objects, enabling modular, reusable, and maintainable code.


-> An entity is any real-world thing that has:

Properties (Data)/ Characteristic → What it has
Behavior (Functions/Methods) → What it does

eg:-
    for exaample i have a class name as Car.(Entity -> Real World)
    properties:-
    1.color
    2.brand
    3.model number
    4.number plate
    behavior:-
    1.start
    2.gearshift
    3.acc
    4.stop
    5.destination(map)

Key Building Blocks:

Class – A template defining attributes and methods.
        A class is a blueprint or template for creating objects.

        class Car{
            //properties
            String Color;
            String Brand_Name;
            Strinf Number_Plate;
            //behavior
            start();
            stop();
            Map();
        }


Object – An instance of a class with specific data.

Attributes – Variables holding object state.

Methods – Functions defining object behavior.


        constructor:- 
A constructor is a special method that has the same name as the class and is automatically invoked when an object is created. It does not have a return type (not even void).

class Student {
    String name;
    int age;

    Student(String name, int age) {
        name = name;
        age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Vijay", 20);
        
        s1.display();
    }
}

Constructor Rules:-

Constructor name must be the same as the class name.
It does not have any return type, not even void.
It is called automatically when an object is created using new.
Constructors can be overloaded.
Constructors cannot be inherited.
If you do not write any constructor, Java provides a default constructor automatically (only if no constructor is defined).