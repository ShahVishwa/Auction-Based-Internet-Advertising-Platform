/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Employee.Marketer;
import Business.Publisher.Page;

/**
 *
 * @author Vishwa
 */
public class Order {
    
    private Page page;
    private Marketer marketer;
    private int orderNo;
    private static int count = 0;

    public Order()
    {
        count++;
        orderNo = count;
    }
    
    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public Marketer getMarketer() {
        return marketer;
    }

    public void setMarketer(Marketer marketer) {
        this.marketer = marketer;
    }
    
    
      
}
