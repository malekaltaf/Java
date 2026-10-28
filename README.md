# ☕ Java Programs – Learning Repository

A collection of Java programs written as part of a structured learning curriculum. The programs cover core Java fundamentals — from basic I/O and arithmetic to OOP concepts like inheritance, abstraction, and interfaces.

---

## 📁 Project Structure

```
Java/
├── Unit 1 – Java Basics & Fundamentals
│   ├── firstprogram.java
│   ├── simpleinterest.java
│   ├── hypot.java
│   ├── mypro3.java
│   ├── clargu.java
│   ├── Prog2_EMI.java
│   ├── prog2_reversearray.java
│   ├── Prog3_carbil.java
│   └── pro4_largest_num.java
│
└── Unit 2 – Object-Oriented Programming (OOP)
    ├── matrix_Add.java
    ├── abstract.java
    ├── override_method.java
    ├── super1.java
    ├── super2.java
    ├── super3.java
    ├── unit2_prog5.java
    ├── unit2_prog7.java
    └── unit2_prog8.java
```

---

## 🧩 Unit 1 — Java Basics & Fundamentals

### `firstprogram.java`
> **Hello World** — The classic first program.

Prints `"Hello World! This Is My First -- Ever Java Program"` to the console.

```bash
javac firstprogram.java
java firstprogram
```

---

### `simpleinterest.java`
> **Simple Interest Calculator**

Calculates simple interest using the formula: `SI = (P × R × N) / 100`  
Default values: Principal = 100, Rate = 5%, Time = 2 years.

```bash
javac simpleinterest.java
java simpleinterest
```

---

### `hypot.java`
> **Hypotenuse Calculator**

Calculates the hypotenuse of a right-angled triangle using `Math.sqrt()`.  
Default values: x = 3.0, y = 4.0 → Hypotenuse = **5.0**

```bash
javac hypot.java
java hypot
```

---

### `mypro3.java`
> **Sum of Two Numbers (User Input)**

Reads two integers from the user via `Scanner` and prints their sum.

```bash
javac mypro3.java
java mypro3
```

---

### `clargu.java`
> **Command-Line Arguments Demo**

Demonstrates how to read and display command-line arguments passed to a Java program.

```bash
javac clargu.java
java clargu Hello World
```

---

### `Prog2_EMI.java`
> **EMI Calculator**

Calculates the Equated Monthly Installment (EMI) for a loan.  
- **Principal** is passed as a command-line argument  
- **Rate** is entered via user input  
- **Time** is fixed at 5 years  

Formula: `EMI = (P × R × (1+R)^N) / ((1+R)^N - 1)`

```bash
javac Prog2_EMI.java
java Prog2_EMI 50000
# Then enter rate when prompted
```

---

### `prog2_reversearray.java`
> **Reverse an Array**

Reverses the elements of an integer array `{1, 2, 3, 4, 5}` in place using a two-pointer technique and prints both the original and reversed arrays.

```bash
javac prog2_reversearray.java
java prog2_reversearray
```

---

### `Prog3_carbil.java`
> **Car Accessories Billing System**

An interactive menu-driven program that simulates a car accessories shop billing system.

| # | Item | Base Price | Tax |
|---|------|-----------|-----|
| 1 | Seat Cover | Rs.6,000 | 2% |
| 2 | Steering Wheel | Rs.20,000 | 3% |
| 3 | Car Lighting | Rs.15,000 | 15% |
| 4 | Air Purifiers | Rs.5,000 | 2% |
| 5 | Other Items | Rs.1,000 | 2% |

Keeps running until user selects option `6 (Quit)`, then prints a formatted bill with totals.

```bash
javac Prog3_carbil.java
java Prog3_carbil
```

---

### `pro4_largest_num.java`
> **Largest of Three Numbers**

Accepts three integers via command-line arguments and determines the largest using `if-else if-else`.

```bash
javac pro4_largest_num.java
java pro4_largest_num 10 45 30
# Output: 45 Is Largest Number Amoung Us.
```

---

## 🏗️ Unit 2 — Object-Oriented Programming (OOP)

### `matrix_Add.java`
> **Matrix Addition**

Reads two matrices from user input (dimensions and elements) and prints their element-wise sum.

```bash
javac matrix_Add.java
java matrix_Add
```

---

### `abstract.java` — Abstract Classes
> **Abstract Class Demo (`bike` → `honda`)**

Demonstrates **abstract classes** and **method implementation**:
- `bike` is an abstract class with abstract method `run()`
- `honda` extends `bike` and implements `run()`
- Object is referenced through the abstract type: `bike obj = new honda()`

```bash
javac abstract.java
java honda
```

---

### `override_method.java` — Method Overriding
> **Runtime Polymorphism Demo**

Shows **method overriding** in action:
- `parent` class has `show()` method
- `child` overrides `show()`
- A `parent` reference holding a `child` object calls `child`'s version → **runtime polymorphism**

```bash
javac override_method.java
java method_override
```

---

### `super1.java` — `super` Keyword (Field Access)
> **Accessing Parent Class Field with `super`**

Demonstrates using `super.fieldName` to access a **parent class variable** that is shadowed by a child class variable.
- `veh` has `maxspeed = 120`
- `car` has `maxspeed = 180`
- `super.maxspeed` in `car.display()` prints `120`

```bash
javac super1.java
java super1
```

---

### `super2.java` — `super` Keyword (Method Call)
> **Calling Parent Class Method with `super`**

Shows how `super.method()` can invoke the **overridden parent method** from within a child class.
- `student.display()` calls both `msg()` (child) and `super.msg()` (parent)

```bash
javac super2.java
java super2
```

---

### `super3.java` — `super` in Constructors
> **Implicit `super()` Constructor Call**

Demonstrates that the **parent constructor is automatically called** when a child object is created.
- Creating `new student()` first prints `"person"` (parent constructor), then `"Student"` (child constructor)

```bash
javac super3.java
java super3
```

---

### `unit2_prog5.java` — Interfaces
> **Interface Implementation (`numbers` → `sum1`, `average1`)**

Demonstrates **interfaces** in Java:
- `numbers` interface defines `process(int x, int y)`
- `sum1` implements it to return **sum**
- `average1` implements it to return **average**

```bash
javac unit2_prog5.java
java unit2_prog5
```

---

### `unit2_prog7.java` — Abstract Class with Subclasses
> **Abstract `vehicle` → `car` and `truck`**

Demonstrates an **abstract class hierarchy**:
- `vehicle` is abstract with abstract method `numwheels()`
- `car` (4 wheels) and `truck` (16 wheels) both extend `vehicle` and implement `numwheels()`

```bash
javac unit2_prog7.java
java unit2_prog7
```

---

### `unit2_prog8.java` — Multiple Interfaces
> **Student Result System using Multiple Interfaces**

Implements **multiple interfaces** in a single class:
- `exam` interface: `pass(int mark)` — returns `true` if mark >= 35
- `classify` interface: `division(int avg)` — returns grade division (First / Second / Pass / Fail)
- `Result` class implements **both** interfaces

```bash
javac unit2_prog8.java
java unit2_prog8
# Enter marks and average when prompted
```

---

## 🛠️ Prerequisites & Setup

| Tool | Version |
|------|---------|
| Java Development Kit (JDK) | 8 or higher |
| Any Terminal / Command Prompt | — |

### Installation Check
```bash
java -version
javac -version
```

### Compile & Run Any Program
```bash
# Step 1: Compile
javac FileName.java

# Step 2: Run
java ClassName
```

---

## 📚 Concepts Covered

| Concept | Programs |
|---------|----------|
| Basic Output (`System.out.println`) | `firstprogram.java` |
| Arithmetic & Math Library | `simpleinterest.java`, `hypot.java`, `Prog2_EMI.java` |
| User Input (`Scanner`) | `mypro3.java`, `Prog3_carbil.java`, `matrix_Add.java` |
| Command-Line Arguments (`args[]`) | `clargu.java`, `Prog2_EMI.java`, `pro4_largest_num.java` |
| Arrays & Loops | `prog2_reversearray.java`, `matrix_Add.java` |
| `switch-case` & Menu Systems | `Prog3_carbil.java` |
| Conditional Logic (`if-else`) | `pro4_largest_num.java`, `unit2_prog8.java` |
| Abstract Classes | `abstract.java`, `unit2_prog7.java` |
| Inheritance (`extends`) | `super1.java`, `super2.java`, `super3.java`, `override_method.java` |
| Method Overriding & Polymorphism | `override_method.java` |
| `super` Keyword | `super1.java`, `super2.java`, `super3.java` |
| Interfaces (`implements`) | `unit2_prog5.java`, `unit2_prog8.java` |
| Multiple Interface Implementation | `unit2_prog8.java` |

---

## 👤 Author

**Altaf Malek**  
Java Programming — Academic Learning Repository

---

> *"The best way to learn to program is to write programs."* — Dennis Ritchie
