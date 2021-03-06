/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Consumer;
import Business.Marketing.AdPrice;
import Business.Publisher.Page;

/**
 *
 * @author Vishwa
 */
public class AdSpaceRequest extends WorkRequest{
    
    private Consumer consumer;
    private Page page;
    private float adPrice;

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

    public float getAdPrice() {
        return adPrice;
    }

    public void setAdPrice(float adPrice) {
        this.adPrice = adPrice;
    }
 
}
