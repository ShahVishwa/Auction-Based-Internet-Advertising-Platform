/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ad;

/**
 *
 * @author Vishwa
 */
public class Product {
       
    private String name;
    private int avail;
    private int price;
    private int modelNumber;
    private static int count = 0;
    private boolean advertisement;
    private Advertisement ad;
    
    public Product()
    {
        count++;
        modelNumber = count;
        ad = new Advertisement();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public boolean isAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(boolean advertisement) {
        this.advertisement = advertisement;
    }

    public Advertisement getAd() {
        return ad;
    }

    public void setAd(Advertisement ad) {
        this.ad = ad;
    }

    
 
    @Override
    public String toString() {
        return name;
    }
    
    
    
}
