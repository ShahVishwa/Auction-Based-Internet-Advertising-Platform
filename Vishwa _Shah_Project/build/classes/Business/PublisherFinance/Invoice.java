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
    private Date invoiceDate;
//    private Date dueDate;
//    private Date currentDate;
    private int noOfImpressions;
    private int currentDue = 0;
    private int costPerImpression;
    private int totalAmount;
    private Order order;
    
    public Invoice()
    {
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

//    public Date getDueDate() {
//        return dueDate;
//    }
//
//    public void setDueDate(Date dueDate) {
//        this.dueDate = dueDate;
//    }

    public int getCurrentDue() {
        this.currentDue = this.currentDue + this.totalAmount;
        return currentDue;
    }

    public void setCurrentDue(int currentDue) {
        this.currentDue = currentDue;
    }

//    public Date getCurrentDate() {
//        return currentDate;
//    }
//
//    public void setCurrentDate(Date currentDate) {
//        this.currentDate = currentDate;
//    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getCostPerImpression() {
        return costPerImpression;
    }

    public void setCostPerImpression(int costPerImpression) {
        this.costPerImpression = costPerImpression;
    }

    public int getNoOfImpressions() {
        return noOfImpressions;
    }

    public void setNoOfImpressions(int noOfImpressions) {
        this.noOfImpressions = noOfImpressions;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
    
    
    
    
    
}
