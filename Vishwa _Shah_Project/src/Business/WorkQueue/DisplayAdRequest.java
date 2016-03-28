/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Ad.Advertisement;
import Business.Publisher.Page;

/**
 *
 * @author Vishwa
 */
public class DisplayAdRequest extends WorkRequest{

    private Page page;
    private Advertisement ad;
    private boolean bid;
    

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
