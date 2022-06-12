package com.hillel.lesson15;



public class Calculator {
    public void main(String[] args) {
        Double t = calculate(4,"+",2);
        System.out.println(t);
    }


    public Double calculate(double a, String operation, double b) {
        Operation value = Operation.convert(operation);
        if (value != null || operation.length() == 1
                || operation.equalsIgnoreCase("+")
                || operation.equalsIgnoreCase("-")
                || operation.equalsIgnoreCase("*")
                || operation.equalsIgnoreCase("/")) {
            switch (value) {
                case ADD:
                    return Operation.add(a, b);
                case SUB:
                    return Operation.sub(a, b);
                case MUL:
                    return Operation.mul(a, b);
                case DIV:
                    if (a == 0 || b == 0) {
                        System.out.println("Divide by 0");
                        return -1.0;
                    }
                    return Operation.div(a, b);
            }
        }
        return -1.0;
    }
}
