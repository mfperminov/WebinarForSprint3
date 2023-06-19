package com.practicum.incapsulation;

public class InitializationExample {

    private String firstVariable = "First variable";

    {
        secondVariable = "Second variable";
        System.out.println(firstVariable);
    }

    private String secondVariable = "Uninitialized";

    public InitializationExample() {
        System.out.println(secondVariable);
        thirdMethod();
    }

    public void thirdMethod() {
        System.out.println("Third method");
    }

    public static void main(String[] args) {
        InitializationExample example = new InitializationExample();
    }
}

