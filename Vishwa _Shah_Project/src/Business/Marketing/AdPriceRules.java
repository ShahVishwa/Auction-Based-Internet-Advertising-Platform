/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Marketing;

import Business.Ad.ProductCatalog;

/**
 *
 * @author Vishwa
 */
public class AdPriceRules {
    
    private float minPageHitRate;
    private int maxAge;
    private int minAge;
    private String interest;
    private ProductCatalog productCatalog;
    private AdPrice adPrice;
    
    public AdPriceRules()
    {
        adPrice = new AdPrice();
    }

    public float getMinPageHitRate() {
        return minPageHitRate;
    }

    public void setMinPageHitRate(float minPageHitRate) {
        this.minPageHitRate = minPageHitRate;
    }
    
    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public AdPrice getAdPrice() {
        return adPrice;
    }

    public void setAdPrice(AdPrice adPrice) {
        this.adPrice = adPrice;
    }  
    
}
