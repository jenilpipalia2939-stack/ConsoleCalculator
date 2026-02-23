package org.calculator.service;

import org.calculator.exception.DivisionByZeroException;
import org.calculator.model.CalculationResult;
import org.calculator.model.Operator;

public class CalculatorService {
    public CalculationResult calculate(double n1, Operator op, double n2) throws DivisionByZeroException {
        // Switch Cases here where operator is checking and then doing operation calling from methods.
        double result = switch (op) {
            case ADD -> add(n1, n2);
            case SUBTRACT -> subtract(n1, n2);
            case MULTIPLY -> multiply(n1, n2);
            case DIVIDE -> divide(n1, n2);
            case MODULUS -> modulus(n1, n2);
            case POWER -> power(n1, n2);
            case SQRT -> squareRoot(n1);
        };
        return new CalculationResult(n1, op, n2, result);
    }

    private double add(double n1, double n2) {
        return n1 + n2;
    }

    private double subtract(double n1, double n2) {
        return n1 - n2;
    }

    private double multiply(double n1, double n2) {
        return n1 * n2;
    }

    private double divide(double n1, double n2) throws DivisionByZeroException {
        if (n2 == 0) {
            throw new DivisionByZeroException("Can't divide by zero");
        }
        return n1 / n2;
    }

    private double modulus(double n1, double n2) {
        return n1 % n2;
    }

    private double power(double n1, double n2) {
        return Math.pow(n1, n2);
    }

    private double squareRoot(double n1) {
        return Math.sqrt(n1);
    }
}