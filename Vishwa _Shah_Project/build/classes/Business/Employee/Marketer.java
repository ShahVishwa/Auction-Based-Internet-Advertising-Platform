/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Marketing.AdPriceRules;
import Business.Marketing.DSP;

/**
 *
 * @author Vishwa
 */
public class Marketer extends Employee{
    
    private DSP dsp;
    private AdPriceRules adPriceRules;
    private float publisherReservePrice;
    private boolean bid;
    
    public Marketer()
    {
        dsp = new DSP();
        adPriceRules = new AdPriceRules();
    }

    public DSP getDsp() {
        return dsp;
    }

    public void setDsp(DSP dsp) {
        this.dsp = dsp;
    }

    public AdPriceRules getAdPriceRules() {
        return adPriceRules;
    }

    public void setAdPriceRules(AdPriceRules adPriceRules) {
        this.adPriceRules = adPriceRules;
    }
    
//    public void accesingAdExchange()
//    {
//        for(Network network : system.getNetworklist())
//        {
//            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriselist())
//            {
//                if(enterprise instanceof AdExchangeEnterprise)
//                {
//                    for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationlist())
//                    {
//                        if(organization instanceof AuctionOrganization)
//                        {
//                            for(UserAccount account : organization.getUserAccountDirectory().getUserAccountList())
//                            {
//                                account.getUsername();
//                                account.getPassword();
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }

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
    
    
 
}
