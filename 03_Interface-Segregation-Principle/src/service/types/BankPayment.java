package service.types;

import service.Payment;

import java.util.List;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class BankPayment implements Payment {
    @Override
    public void initiatePayments() {
        // Payment Initiate Logic
        System.out.println("Payment Initiated");
    }

    @Override
    public Object status() {
        // Status returning logic
        System.out.println("Status Called");
        return null;
    }

    @Override
    public List<Object> getPayments() {
        // Get all payments
        System.out.println("Returned all payments");
        return null;
    }

    @Override
    public void initiateLoanSettlement() {
        throw new UnsupportedOperationException("Bank Payments don't have Initial Loan Payments");
    }

    @Override
    public void initiateRePayment() {
        throw new UnsupportedOperationException("Bank Payments don't have Initial Re Payments");
    }
}
