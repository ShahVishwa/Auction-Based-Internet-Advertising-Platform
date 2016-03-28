/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Publisher;

/**
 *
 * @author Vishwa
 */
public class Page {
    
    private String name;
    private int pageID;
    private static int count = 0;
    private boolean space;
    private AdSpace adSpace;
    
    public Page()
    {
        count++;
        pageID = count;
        adSpace = new AdSpace();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageID() {
        return pageID;
    }

    public boolean isSpace() {
        return space;
    }

    public void setSpace(boolean space) {
        this.space = space;
    }

    public AdSpace getAdSpace() {
        return adSpace;
    }

    public void setAdSpace(AdSpace adSpace) {
        this.adSpace = adSpace;
    }
    
    @Override
    public String toString()
    {
        return name;
    }
    
}
