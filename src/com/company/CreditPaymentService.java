package com.company;

public class CreditPaymentService {

    public int monthlyPayment (int creditAmount, int durationYears, double percentage) {
        return (int)(creditAmount * getAnnuity(percentage / 12, durationYears * 12));
    }
    public double getAnnuity (double percentagePerMonth, int monthsToPay) {
        double powerValue = Math.pow(1.0 + percentagePerMonth, monthsToPay);
        return percentagePerMonth * powerValue / (powerValue - 1);
    }
}
