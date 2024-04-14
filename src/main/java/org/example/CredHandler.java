package org.example;

public class CredHandler implements PaymentHandler {

    @Override
    public void pay(){
        System.out.println("Paying credit card bill using CRED App");
    }
}