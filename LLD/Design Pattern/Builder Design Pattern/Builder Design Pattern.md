Builder Design Pattern is a creational design pattern that is used to construct complex objects step-by-step, especially when an object has many optional parameters.

👉 Complex object ko step-by-step create karne ke liye Builder Pattern use hota hai.
It’s particularly useful in situations where:

An object has many optional fields, and most callers only need a subset.
You want to avoid telescoping constructors or long parameter lists.
The object must be assembled through multiple steps, possibly in a specific order.

Without a builder, developers often end up with overloaded constructors or a wide set of setters. For example, a User object might include fields like name, email, phone, address, and preferences. As the number of fields grows, the API becomes harder to use correctly, easier to misuse, and more difficult to maintain.

Why It Exists (The Problem)

Imagine a House class that can have: walls, doors, windows, roof, garage, swimming pool, garden, etc. Some of these are optional.

Bad approach — Telescoping Constructor:

java
House house = new House(4, 2, 6, true, false, true, false, true, ...);

This is unreadable — what does true, false, true even mean? You'd need constructors for every possible combination of parameters, which explodes exponentially.

