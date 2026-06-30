oops have 4 piller :
1. inheritance
2. polymophism
3. Abstraction
4. Encapulation

1. Encapsulation 🔒
Definition

Encapsulation is the process of wrapping data (variables) and methods (functions) into a single unit (class) and restricting direct access to the data using access modifiers.

In simple words:

Hide data from outside the class.
Provide controlled access using getters and setters.
Real-Life Example

Think of an ATM.

You cannot directly access the bank's database.
You interact through buttons (methods).

class Student {
    private String name;

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Vijay");

        System.out.println(s.getName());
    }
}




2. Inheritance 👨‍👦
Definition

Inheritance allows one class to acquire the properties and methods of another class.

The class being inherited is called the Parent (Super) Class, and the class that inherits is called the Child (Sub) Class.

Real-Life Example

A Car is a Vehicle.

Car inherits common properties like speed and fuel from Vehicle.

class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}


Types of Inheritance in Java
Type	Supported in Classes?
Single	✅ Yes
Multilevel	✅ Yes
Hierarchical	✅ Yes
Multiple	❌ No (with classes)
Hybrid	❌ No (with classes)

Note: Java supports multiple inheritance through interfaces, not through classes.

3. Polymorphism 🎭
Definition

Polymorphism means "many forms." The same method name can behave differently depending on the object or parameters.

There are two types:

A) Compile-Time Polymorphism (Method Overloading)

Same method name, different parameters.

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.add(5, 10));

        System.out.println(c.add(5, 10, 15));
    }
}

B) Runtime Polymorphism (Method Overriding)

The child class provides its own implementation of a method defined in the parent class.

class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
    }
}