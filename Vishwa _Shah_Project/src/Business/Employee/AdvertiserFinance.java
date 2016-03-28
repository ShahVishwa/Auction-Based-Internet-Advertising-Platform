/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.AdvertiserFinance.PaymentHistory;

/**
 *
 * @author Vishwa
 */
public class AdvertiserFinance extends Employee{

    private PaymentHistory paymentHistory;
    
    public AdvertiserFinance()
    {
        paymentHistory = new PaymentHistory();
    }

    public PaymentHistory getPaymentHistory() {
        return paymentHistory;
    }

    public void setPaymentHistory(PaymentHistory paymentHistory) {
        this.paymentHistory = paymentHistory;
    }
    
}
