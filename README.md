# Java 17 Feature Demo Project

This project demonstrates the use of Java 17 features, specifically **sealed classes** and **non-sealed classes**, in a simple Java application. The project is structured as a Maven project and includes unit tests using JUnit 5.

## Java 17 Features Used

### Sealed Classes
- The `Person` class is declared as a **sealed class**, which restricts which other classes may extend or implement it.
- Only the classes `Director` and `Engineer` are permitted to extend `Person`.

### Non-Sealed Classes
- Both `Director` and `Engineer` are declared as **non-sealed classes**, meaning they can be further subclassed without restriction.

## Project Structure

```
src/
  main/
    java/
      com/java17/
        app/
          App.java
        sealedclasses/
          Person.java
          Director.java
          Engineer.java
          Car.java
  test/
    java/
      com/java17/sealedclasses/
        CarTest.java
```

- `App.java`: Main application entry point (currently empty, for demonstration purposes).
- `sealedclasses/`: Contains the sealed class hierarchy and a simple `Car` class.
- `CarTest.java`: JUnit test for the `Car` class.

## Build & Run

This project uses Maven for build automation. Ensure you have JDK 17+ and Maven installed.

### Compile
```
mvn clean compile
```

### Run Tests
```
mvn test
```

## Requirements
- Java 17 or higher
- Maven 3.6+

## License
This project is for educational purposes and demonstrates Java 17 features. 