/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AdvertiserFinance;

import Business.PublisherFinance.Invoice;
import java.util.Date;

/**
 *
 * @author Vishwa
 */
public class Payment {
    
    private String paymentMethod;
    private double cardNo;
    private Date expiryDate;
    private String nameOnCard;
    private int CVV;
    private int no;
    private static int count = 0;
    private String advertiserName;
    private Invoice invoice;
    
    public Payment()
    {
        count++;
        no = count;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getCardNo() {
        return cardNo;
    }

    public void setCardNo(double cardNo) {
        this.cardNo = cardNo;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }
    
    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public String getAdvertiserName() {
        return advertiserName;
    }

    public void setAdvertiserName(String advertiserName) {
        this.advertiserName = advertiserName;
    }
    
    
    
}
