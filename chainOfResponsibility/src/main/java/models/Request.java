package models;

import java.math.BigDecimal;

public class Request {

    private Operation operation;

    private BigDecimal firstNumber;

    private BigDecimal secondNumber;

    public Request(Operation operation, BigDecimal firstNumber, BigDecimal secondNumber) {
        this.operation = operation;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public BigDecimal getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(BigDecimal firstNumber) {
        this.firstNumber = firstNumber;
    }

    public BigDecimal getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(BigDecimal secondNumber) {
        this.secondNumber = secondNumber;
    }

    @Override
    public String toString() {
        return "Request{" +
                "operation=" + operation +
                ", firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                '}';
    }
}
