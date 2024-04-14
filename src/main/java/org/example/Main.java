package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditCard c = new CreditCard();
        Scanner sc = new Scanner(System.in);
        System.out.println("Pay Credit Card bill");
        System.out.println("Choose your option:");
        System.out.println("1)Pay using Debit Card");
        System.out.println("2)Pay using Net Banking");
        System.out.println("3)Pay using UPI");
        System.out.println("4)Pay using Paytm Wallet");
        Integer option = sc.nextInt();
        switch(option) {
            case 1:
                c.pay("debit");
                break;
            case 2:
                c.pay("netbanking");
                break;
            case 3:
                c.pay("upi");
                break;
            case 4:
                c.pay("paytm");
                break;
            default:
                c.pay("cred");
        }
    }
}