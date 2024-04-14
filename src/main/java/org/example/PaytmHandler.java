package org.example;

public class PaytmHandler implements PaymentHandler{
    /*
  .
  .
  Rest of the methods
  .
  .
  */
    @Override
    public void pay(){
        System.out.println("Bill paid successfully using PaytmWallet");
    }
}
