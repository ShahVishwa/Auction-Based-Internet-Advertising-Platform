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
public class Advertisement {
    
    private String name;
    private int adID;
    private static int count = 0;
       
    public Advertisement()
    {
        count++;
        adID = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAdID() {
        return adID;
    }   
    
    @Override
    public String toString()
    {
        return name;
    }
    
}
