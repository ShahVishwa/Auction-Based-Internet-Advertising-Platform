/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;


/**
 *
 * @author Vishwa
 */
public class Auction extends Employee{
//    
//    private Marketer buyer;
//    private Publisher seller;
    private int winningAmount;
    private Marketer winningMarketer;

//    public Marketer getBuyer() {
//        return buyer;
//    }
//
//    public void setBuyer(Marketer buyer) {
//        this.buyer = buyer;
//    }
//
//    public Publisher getSeller() {
//        return seller;
//    }
//
//    public void setSeller(Publisher seller) {
//        this.seller = seller;
//    }

    public int getWinningAmount() {
        return winningAmount;
    }

    public void setWinningAmount(int winningAmount) {
        this.winningAmount = winningAmount;
    }

    public Marketer getWinningMarketer() {
        return winningMarketer;
    }

    public void setWinningMarketer(Marketer winningMarketer) {
        this.winningMarketer = winningMarketer;
    }

    
    
    
    
    
    
}
