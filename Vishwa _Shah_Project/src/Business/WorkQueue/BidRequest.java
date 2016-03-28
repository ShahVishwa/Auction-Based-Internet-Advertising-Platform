/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Ad.Advertisement;
import Business.Employee.Consumer;
import Business.Publisher.Page;

/**
 *
 * @author Vishwa
 */
public class BidRequest extends WorkRequest{
    
    private float bidAmount;
    private Advertisement ad;
    private int noOfThousandImpressions;
    private Consumer consumer;
    private Page page;
    private boolean bid;

    public float getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(float bidAmount) {
        this.bidAmount = bidAmount;
    }

    public Advertisement getAd() {
        return ad;
    }

    public void setAd(Advertisement ad) {
        this.ad = ad;
    }

    public int getNoOfThousandImpressions() {
        return noOfThousandImpressions;
    }

    public void setNoOfThousandImpressions(int noOfThousandImpressions) {
        this.noOfThousandImpressions = noOfThousandImpressions;
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

    public boolean isBid() {
        return bid;
    }

    public void setBid(boolean bid) {
        this.bid = bid;
    }
    
    
    
}
