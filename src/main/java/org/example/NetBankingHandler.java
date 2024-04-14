package org.example;

public class NetBankingHandler implements PaymentHandler{
    /*
  .
  .
  Rest of the methods
  .
  .
  */
    @Override
    public void pay(){
        System.out.println("Bill paid successfully using NetBanking");
    }
}