/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ad;

import java.util.ArrayList;

/**
 *
 * @author Vishwa
 */
public class AdInventory {
    
    private ArrayList<Advertisement> adList;
    private int ads;
    private int noOfAds;
    private static int count1 = 0;
    
    public AdInventory()
    {
        adList = new ArrayList<>();
    }

    public ArrayList<Advertisement> getAdList() {
        return adList;
    }
    
    public Advertisement createAndAddAd(String name)
    {
        Advertisement ad = new Advertisement();
        ad.setName(name);
        adList.add(ad);
        return ad;
    }
    
    public void removeAd(Advertisement ad)
    {
        adList.remove(ad);
        return;
    }
    
    

    
}
