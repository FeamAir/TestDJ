package com.hillel.lesson15;

public enum Operation {
    ADD("+"),
    SUB("-"),
    MUL("*"),
    DIV("/");

    private final String value;

    Operation(String value) {

        this.value = value;
    }


    public static Operation convert(String value) {
        for (Operation valueType : values()) {
            if (valueType.value == value) {
                return valueType;
            }
        }
        return null;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

}
