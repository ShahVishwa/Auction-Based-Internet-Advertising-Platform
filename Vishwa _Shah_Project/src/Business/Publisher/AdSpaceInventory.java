/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Publisher;

import java.util.ArrayList;

/**
 *
 * @author Vishwa
 */
public class AdSpaceInventory {
    
    private ArrayList<AdSpace> adSpaceList;

    public AdSpaceInventory()
    {
        adSpaceList = new ArrayList<>();
    }

    public ArrayList<AdSpace> getAdSpaceList() {
        return adSpaceList;
    }

    public void setAdSpaceList(ArrayList<AdSpace> adSpaceList) {
        this.adSpaceList = adSpaceList;
    }
    
    public AdSpace addAdSpace()
    {
        AdSpace adSpace = new AdSpace();
        adSpaceList.add(adSpace);
        return adSpace;
    }
    
    public void removeAdSpace()
    {
        AdSpace adSpace = new AdSpace();
        adSpaceList.remove(adSpace);
        return;
    }
    
    
    
}
