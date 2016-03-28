/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Order.Order;
import Business.PublisherFinance.InvoiceHistory;

/**
 *
 * @author Vishwa
 */
public class PublisherFinance extends Employee{
    
    private InvoiceHistory invoiceHistory;
    private Order order;
    
    public PublisherFinance()
    {
        invoiceHistory = new InvoiceHistory();
    }

    public InvoiceHistory getInvoiceHistory() {
        return invoiceHistory;
    }

    public void setInvoiceHistory(InvoiceHistory invoiceHistory) {
        this.invoiceHistory = invoiceHistory;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    
    
    
}
