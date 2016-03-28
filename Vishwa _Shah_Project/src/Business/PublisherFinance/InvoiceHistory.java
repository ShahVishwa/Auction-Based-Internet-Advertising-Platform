/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PublisherFinance;

import java.util.ArrayList;

/**
 *
 * @author Vishwa
 */
public class InvoiceHistory {
    
    private ArrayList<Invoice> invoiceList;
    
    public InvoiceHistory()
    {
        invoiceList = new ArrayList<>();
    }

    public ArrayList<Invoice> getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(ArrayList<Invoice> invoiceList) {
        this.invoiceList = invoiceList;
    }
    
    public Invoice createAndAddInvoice()
    {
        Invoice invoice = new Invoice();
        invoiceList.add(invoice);
        return invoice;
    }
    
    public void removeInvoice(Invoice invoice)
    {
        invoiceList.remove(invoice);
        return;
    }
    
}
