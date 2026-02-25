# Java Console Calculator

A console-based calculator built in Java.
---

## Features

- Addition, Subtraction, Multiplication, Division
- Modulus (`%`), Power (`^`), Square Root (`sqrt`)
- Input validation with helpful error messages
- Division by zero handled gracefully
- Continuous session — calculate multiple times without restarting
- Clean exit by typing `exit`.

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

## License

MIT License — free to use and modify.
