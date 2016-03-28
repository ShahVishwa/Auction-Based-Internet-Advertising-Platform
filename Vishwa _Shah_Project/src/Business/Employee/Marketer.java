/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Marketing.AdPriceRules;

/**
 *
 * @author Vishwa
 */
public class Marketer extends Employee{
    
    private AdPriceRules adPriceRules;
    private float publisherReservePrice;
    private boolean bid;
    private int noOfThousaneImpressions;
    
    public Marketer()
    {
        adPriceRules = new AdPriceRules();
    }

    public AdPriceRules getAdPriceRules() {
        return adPriceRules;
    }

    public void setAdPriceRules(AdPriceRules adPriceRules) {
        this.adPriceRules = adPriceRules;
    }

    public boolean isBid() {
        return bid;
    }

    public void setBid(boolean bid) {
        this.bid = bid;
    }

    public float getPublisherReservePrice() {
        return publisherReservePrice;
    }

    public void setPublisherReservePrice(float publisherReservePrice) {
        this.publisherReservePrice = publisherReservePrice;
    }

    public int getNoOfThousaneImpressions() {
        return noOfThousaneImpressions;
    }

    public void setNoOfThousaneImpressions(int noOfThousaneImpressions) {
        this.noOfThousaneImpressions = noOfThousaneImpressions;
    }
    
    
 
}
