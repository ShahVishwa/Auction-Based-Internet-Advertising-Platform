/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Advertiser;
import Business.Employee.Consumer;
import Business.Publisher.Page;

/**
 *
 * @author Vishwa
 */
public class PublisherWorkRequest extends WorkRequest{
   
    private Consumer consumer;
    private Page page;
    private boolean request;

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public boolean isRequest() {
        return request;
    }

    public void setRequest(boolean request) {
        this.request = request;
    }
    
    
   
}
