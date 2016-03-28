/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AdvertiserFinance;

import java.util.ArrayList;

/**
 *
 * @author Vishwa
 */
public class PaymentHistory {
    
    private ArrayList<Payment> paymentList;
    
    public PaymentHistory()
    {
        paymentList = new ArrayList<>();
    }

    public ArrayList<Payment> getPaymentList() {
        return paymentList;
    }
    
    public Payment createAndAddPayment(Payment payment)
    {
        paymentList.add(payment);
        return payment;
    }
    
    public void removePayment(Payment payment)
    {
        paymentList.remove(payment);
        return;
    }
    
}
