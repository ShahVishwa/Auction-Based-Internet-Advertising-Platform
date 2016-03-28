/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserPotential;

/**
 *
 * @author Vishwa
 */
public class UserPotential {
    
    private int onClick;
    private int noOfClicks;
    private static int count = 0;
    private int buyOnClick;
    private int noOfBuyObClicks;
    private static int count1 = 0;
    private int clickOnAd;
    private int noOfClickOnAd;
    private static int count2 = 0;
    private float pageHitRate;

    public int getOnClick() {
        count++;
        this.onClick = count;
        return onClick;
    }

    public void setOnClick(int onClick) {
        this.onClick = onClick;
    }

    public int getNoOfClicks() {
        this.noOfClicks = this.onClick;
        return noOfClicks;
    }

    public void setNoOfClicks(int noOfClicks) {
        this.noOfClicks = noOfClicks;
    }

    public int getBuyOnClick() {
        count1++;
        this.buyOnClick = count1;
        return buyOnClick;
    }

    public void setBuyOnClick(int buyOnClick) {
        this.buyOnClick = buyOnClick;
    }

    public int getNoOfBuyObClicks() {
        this.noOfBuyObClicks = this.buyOnClick;
        return noOfBuyObClicks;
    }

    public void setNoOfBuyObClicks(int noOfBuyObClicks) {
        this.noOfBuyObClicks = noOfBuyObClicks;
    }

    public int getClickOnAd() {
        count2++;
        this.clickOnAd = count2;
        return clickOnAd;
    }

    public void setClickOnAd(int clickOnAd) {
        this.clickOnAd = clickOnAd;
    }

    public int getNoOfClickOnAd() {
        this.noOfClickOnAd = this.clickOnAd;
        return noOfClickOnAd;
    }

    public void setNoOfClickOnAd(int noOfClickOnAd) {
        this.noOfClickOnAd = noOfClickOnAd;
    }

    public float getPageHitRate() {
        this.pageHitRate = this.noOfBuyObClicks/this.noOfClicks;
        return pageHitRate;
    }

    public void setPageHitRate(float pageHitRate) {
        this.pageHitRate = pageHitRate;
    }
    
    
    
}
