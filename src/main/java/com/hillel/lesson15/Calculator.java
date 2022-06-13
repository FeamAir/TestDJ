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
                    if (a < 0 || b < 0) {
                        return Operation.sub(a, b);
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
                        System.out.println("Divide by 0");
                        return -1.0;
                    } else if (a < 0 || b < 0) {
                        return Operation.div(a, b);
                    } else if (a > 0 || b > 0) {
                        return Operation.div(a, b);
                    }
            }
        }
        return -1.0;
    }
}
