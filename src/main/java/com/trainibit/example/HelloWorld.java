package com.trainibit.example;

public class HelloWorld {
    private String message;

    // Setter Metodo para la inyección de dependencia
    public void setMessage(String message) {
        this.message = message;
    }

    // Method to print the message
    public void printMessage() {
        System.out.println("Message: " + message);
    }
}