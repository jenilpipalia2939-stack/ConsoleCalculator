package org.calculator.model;

public class CalculationResult {
    private Double result;
    private Operator operator;
    private Double operand1;
    private Double operand2;

    public CalculationResult( Double n1, Operator operator, Double n2, Double result) {
        this.operand1 = n1;
        this.operator = operator;
        this.operand2 = n2;
        this.result = result;
    }

    public Double getResult() {
        return this.result;
    }

    @Override
    public String toString() {
        return operand1 + " " + operator + " " + operand2;
    }
}
