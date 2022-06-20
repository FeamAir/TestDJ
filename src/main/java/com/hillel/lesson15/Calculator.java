package com.hillel.lesson15;


public class Calculator {

    public Double calculate(double a, String operation, double b) {
        Operation value = Operation.convert(operation);
        if (value != null || operation.length() == 1
                || operation.equalsIgnoreCase("+")
                || operation.equalsIgnoreCase("-")
                || operation.equalsIgnoreCase("*")
                || operation.equalsIgnoreCase("/")) {
            switch (value) {
                case ADD:
                    if (a < 0 || b < 0) {
                        return Operation.add(a, b);
                    } else {
                        return Operation.add(a, b);
                    }
                case SUB:
                    if (b < 0) {
                        throw new ArithmeticException("Указали два минуса");
                    } else {
                        return Operation.sub(a, b);
                    }
                case MUL:
                    if (a < 0 || b < 0) {
                        return Operation.mul(a, b);
                    } else {
                        return Operation.mul(a, b);
                    }
                case DIV:
                    if (a == 0 || b == 0) {
                        throw new ArithmeticException("Не возможно деление на 0");
                    } else if (a < 0 || b < 0) {
                        return Operation.div(a, b);
                    } else if (a > 0 || b > 0) {
                        return Operation.div(a, b);
                    }
            }
        }
        return -1.0;
    }
    public String calculateEx(String a, String operation, String b) throws CalculatorException {
        try {
            double resultA = Double.parseDouble(a);
            double resultB = Double.parseDouble(b);
        } catch (NumberFormatException e) {
            System.err.println("operation is not supported");
            throw new CalculatorException("value incorrect");
        }

        return a + operation + b;
    }

}
