/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Ad.Product;
import Business.UserPotential.UserPotential;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Vishwa
 */
public class Consumer extends Employee{
    
    private int age;
    private Date birthDate;
    private String location; 
    private String interests;
    private UserPotential up;
    private ArrayList<Product> consumerProductList;
    private int ads;
    private int noOfAds;
    private static int count1 = 0;
    
    
    public Consumer()
    {
        up = new UserPotential();
        consumerProductList = new ArrayList<>();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public  void setDOB(Date dob)
    {
        birthDate = dob;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Product> getConsumerProductList() {
        return consumerProductList;
    }

    public void setConsumerProductList(ArrayList<Product> consumerProductList) {
        this.consumerProductList = consumerProductList;
    }
 
    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public UserPotential getUp() {
        return up;
    }

    public void setUp(UserPotential up) {
        this.up = up;
    }
    
    public Product addConsumerBoughtProduct(Product p)
    {
        consumerProductList.add(p);
        return p;
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
