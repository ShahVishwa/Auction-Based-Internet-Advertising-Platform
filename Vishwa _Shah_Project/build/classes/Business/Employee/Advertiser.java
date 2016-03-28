/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Ad.AdInventory;
import Business.Ad.Advertisement;
import Business.Ad.ProductCatalog;
import Business.Consumer.ConsumerDirectory;

/**
 *
 * @author Vishwa
 */
public class Advertiser extends Employee{
    
    private String field;
    private String companyName;
    private AdInventory adInventory;
    private ProductCatalog productCatalog;
    private ConsumerDirectory consumerDirectory;
    private Advertisement ad;
    
    
    public Advertiser()
    {
        adInventory = new AdInventory();
        productCatalog = new ProductCatalog();
        consumerDirectory = new ConsumerDirectory();
    }

    public AdInventory getAdInventory() {
        return adInventory;
    }

    public void setAdInventory(AdInventory adInventory) {
        this.adInventory = adInventory;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ConsumerDirectory getConsumerDirectory() {
        return consumerDirectory;
    }

    public void setConsumerDirectory(ConsumerDirectory consumerDirectory) {
        this.consumerDirectory = consumerDirectory;
    }

    public Advertisement getAd() {
        return ad;
    }

    public void setAd(Advertisement ad) {
        this.ad = ad;
    }
 
}
