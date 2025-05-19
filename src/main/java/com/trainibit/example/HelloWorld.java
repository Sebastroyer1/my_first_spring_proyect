package com.trainibit.example;

public class HelloWorld {
    private String message;
    private User user;

    // Setter Metodo para la inyección de dependencia
    public void setMessage(String message) {
        this.message = message;
    }

    // inyección de dependencia
    public void setUser(User user) {
        this.user = user;
    }

    // Method to print the message
    public void printMessage() {
        System.out.println("Message: " + message + " User: " + user.getFirstName()+ " " + user.getLastName()+user.getDateOfBirth());
    }

}