/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Ad.Advertisement;
import Business.Employee.Consumer;
import Business.Employee.Marketer;
import Business.Publisher.Page;

/**
 *
 * @author Vishwa
 */
public class GenerateBillWorkRequest extends WorkRequest{
    
    private int noOfThousandImpressions;
    private Marketer marketer;
    private Consumer consumer;
    private Page page;
    private Advertisement ad;
    private boolean bid;

    public int getNoOfThousandImpressions() {
        return noOfThousandImpressions;
    }

    public void setNoOfThousandImpressions(int noOfThousandImpressions) {
        this.noOfThousandImpressions = noOfThousandImpressions;
    }

    public Marketer getMarketer() {
        return marketer;
    }

    public void setMarketer(Marketer marketer) {
        this.marketer = marketer;
    }

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

    public Advertisement getAd() {
        return ad;
    }

    public void setAd(Advertisement ad) {
        this.ad = ad;
    }

    public boolean isBid() {
        return bid;
    }

    public void setBid(boolean bid) {
        this.bid = bid;
    }
    
    
    
    
    
}
