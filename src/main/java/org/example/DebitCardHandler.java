package org.example;

public class DebitCardHandler implements PaymentHandler{
    /*
  .
  .
  Rest of the methods
  .
  .
  */
    @Override
    public void pay(){
        System.out.println("Bill paid successfully using DebitCard");
    }
}
