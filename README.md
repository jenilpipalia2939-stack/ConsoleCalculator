# Java Console Calculator

A console-based calculator built in Java as part of a structured SDLC learning project.

---

## Features

- Addition, Subtraction, Multiplication, Division
- Modulus (`%`), Power (`^`), Square Root (`sqrt`)
- Input validation with helpful error messages
- Division by zero handled gracefully
- Continuous session — calculate multiple times without restarting
- Clean exit by typing `exit` or `q`

---

## Requirements

- Java JDK 11 or higher
- Maven 3.8 or higher

Verify your setup:
```bash
java --version
mvn --version
```

---

## Project Structure

```
com.calculator/
  ├── Main.java
  ├── model/
  │   ├── Operator.java
  │   └── CalculationResult.java
  ├── service/
  │   └── CalculatorService.java
  ├── util/
  │   ├── InputValidator.java
  │   └── DisplayHelper.java
  └── exception/
      ├── DivisionByZeroException.java
      └── InvalidOperatorException.java
```

---

## Build

```bash
mvn clean package
```

The compiled JAR will be at `target/calculator-1.0.jar`.

---

## Run

```bash
java -jar target/calculator-1.0.jar
```

---

## Example Usage

```
=== Java Console Calculator ===
Type 'exit' at any prompt to quit.

Enter first number: 10
Enter operator (+, -, *, /, %, ^, sqrt): /
Enter second number: 4
Result: 10.0 / 4.0 = 2.5

Calculate again? (yes/no): yes

Enter first number: 25
Enter operator (+, -, *, /, %, ^, sqrt): sqrt
Result: sqrt(25.0) = 5.0
```

---

## Run Tests

```bash
mvn test
```

---

## Supported Operators

| Operator | Symbol | Example         |
|----------|--------|-----------------|
| Add      | `+`    | 5 + 3 = 8       |
| Subtract | `-`    | 10 - 4 = 6      |
| Multiply | `*`    | 6 * 7 = 42      |
| Divide   | `/`    | 9 / 2 = 4.5     |
| Modulus  | `%`    | 10 % 3 = 1      |
| Power    | `^`    | 2 ^ 8 = 256     |
| Sqrt     | `sqrt` | sqrt(16) = 4    |

---

## Version History

| Version | Date          | Notes          |
|---------|---------------|----------------|
| 1.0     | February 2026 | Initial release |

---

## Author

Your Name  
[GitHub Profile](https://github.com/yourusername)

---

## License

MIT License — free to use and modify.