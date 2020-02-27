package com.company;

public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println(service.monthlyPayment(1_000_000,1,0.0999)); // 87 911
        System.out.println(service.monthlyPayment(1_000_000,2,0.0999)); // 46 140
        System.out.println(service.monthlyPayment(1_000_000,3,0.0999)); // 32 262
    }
}
