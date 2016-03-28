/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Marketer;

/**
 *
 * @author Vishwa
 */
public class WinningAdvertiserRequest extends WorkRequest{
    
    private Marketer marketer;

    public Marketer getMarketer() {
        return marketer;
    }

    public void setMarketer(Marketer marketer) {
        this.marketer = marketer;
    }
    
    
    
}
