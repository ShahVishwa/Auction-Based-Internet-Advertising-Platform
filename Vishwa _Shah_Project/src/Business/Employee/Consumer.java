/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.UserPotential.UserPotential;
import java.util.Date;

/**
 *
 * @author Vishwa
 */
public class Consumer extends Employee{
    
    private int age;
    private String location; 
    private UserPotential up;
    private int ads;
    private int noOfAds;
    private static int count1 = 0;
    
    
    public Consumer()
    {
        up = new UserPotential();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public UserPotential getUp() {
        return up;
    }

    public void setUp(UserPotential up) {
        this.up = up;
    }
    
    public int getAds() {
        count1++;
        this.ads = count1;
        return ads;
    }

    public void setAds(int ads) {
        this.ads = ads;
    }

    public int getNoOfAds() {
        this.noOfAds = this.ads;
        return noOfAds;
    }

    public void setNoOfAds(int noOfAds) {
        this.noOfAds = noOfAds;
    }

}
