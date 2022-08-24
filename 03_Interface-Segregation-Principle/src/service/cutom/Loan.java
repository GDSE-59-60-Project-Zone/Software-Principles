package service.cutom;

import service.Payment;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public interface Loan extends Payment {
    void initiateLoanSettlement();
    void initiateRePayment();
}
