/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PublisherFinance;

import Business.Order.Order;
import java.util.Date;

/**
 *
 * @author Vishwa
 */
public class Invoice {
    
    private String publisherName;
    private int invoiceID;
    private static int count = 0;
    private Date invoiceDate;
    private int noOfImpressions;
    private int currentDue = 0;
    private int bidAmount;
    private int totalAmount;
    private Order order;
    
    public Invoice()
    {
        count++;
        invoiceID = count;
        invoiceDate = new Date();
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public int getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        
        this.invoiceDate = invoiceDate;
    }

    public int getCurrentDue() {
        this.currentDue = this.currentDue + this.totalAmount;
        return currentDue;
    }

    public void setCurrentDue(int currentDue) {
        this.currentDue = currentDue;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(int bidAmount) {
        this.bidAmount = bidAmount;
    }

    public int getNoOfImpressions() {
        return noOfImpressions;
    }

    public void setNoOfImpressions(int noOfImpressions) {
        this.noOfImpressions = noOfImpressions;
    }

    public int getTotalAmount() {
        this.totalAmount = this.bidAmount * this.noOfImpressions;
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(invoiceID);
    }
    
    
    
}
