package service.cutom;

import service.Payment;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public interface Bank extends Payment {
    void initiatePayments();
}
