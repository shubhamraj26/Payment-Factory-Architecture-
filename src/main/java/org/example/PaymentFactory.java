package org.example;

public class PaymentFactory {

    public static PaymentHandler getPaymentHandler(String paymentMode) {

        switch(paymentMode) {
            case "debit" : return new DebitCardHandler();
            case "netbanking" : return new NetBankingHandler();
            case "upi" : return new UPIHandler();
            case "paytm" :  return new PaytmHandler();
            case "cred" : return new CredHandler();
            default : return new CredHandler();
        }
    }


}
