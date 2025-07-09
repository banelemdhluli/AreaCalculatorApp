==============================
🧮 AREA CALCULATOR APPLICATION
==============================

👤 Author: Banele Mdhluli  
💻 Language: Java  
🛠️ IDE: NetBeans / IntelliJ / Any Java IDE  
📄 Description: This application calculates the area of various 2D shapes using OOP principles like abstraction and polymorphism.


📌 1. OVERVIEW

This project demonstrates basic Java Object-Oriented Programming concepts by modeling various 2D shapes 
as subclasses of an abstract class called `Shape`. Each subclass overrides the `calculateArea()` method 
to compute the area of a specific geometric shape.

✅ Shapes included:
- 🟠 Circle
- 🔲 Square
- ▭ Rectangle
- 🔺 Triangle
- 🔷 Parallelogram
- 🔶 Rhombus
- 🟥 Trapezium

Each shape prompts the user for the required dimensions via console input and outputs the calculated area.

📁 2. FILE STRUCTURE

The project includes the following files:

- Shape.java                → Abstract superclass
- Circle.java               → Subclass implementing area of a circle
- Square.java               → Subclass implementing area of a square
- Rectangle.java            → Subclass implementing area of a rectangle
- Triangle.java             → Subclass implementing area of a triangle
- Parallelogram.java        → Subclass implementing area of a parallelogram
- Rhombus.java              → Subclass implementing area of a rhombus
- Trapezium.java            → Subclass implementing area of a trapezium
- AreaCalculatorApp.java    → Main class to run and test the application


▶️ 3. HOW TO RUN

1. 📥 Clone or download the project files.
2. 🧑‍💻 Open the project in your preferred Java IDE.
3. 📂 Ensure all `.java` files are in the same package or directory.
4. 🚀 Run the `AreaCalculatorApp` class.
5. 🎯 Follow the on-screen prompts to select a shape and enter its dimensions.


🔍 4. SAMPLE USAGE

Example for Rectangle:
> Enter rectangle dimensions:  
> Width >> 5  
> Height >> 10  
> Rectangle Area >> 50.0


🧠 5. OBJECT-ORIENTED PRINCIPLES USED

✅ **Abstraction** – Abstract class `Shape` defines a contract for all shapes.  
✅ **Inheritance** – All shape classes inherit from `Shape`.  
✅ **Polymorphism** – Each shape overrides the `calculateArea()` method differently.  
✅ **Encapsulation** – User input is managed within each class using local variables.

📝 6. LICENSE

This project is free to use and modify for learning and educational purposes.
