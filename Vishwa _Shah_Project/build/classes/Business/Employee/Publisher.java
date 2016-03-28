/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

//import Business.Publisher.AdSpaceInventory;
import Business.Consumer.ProbabilityOfClicks;
import Business.Publisher.AdSpaceInventory;
import Business.Publisher.PageCatalog;

/**
 *
 * @author Vishwa
 */
public class Publisher extends Employee{
    
    private PageCatalog pageCatalog;
    private AdSpaceInventory adSpaceInventory;
//    private UserPotential userPotential;
    private Consumer consumer;
    private ProbabilityOfClicks poc;
    
    public Publisher()
    {
        pageCatalog = new PageCatalog();
        adSpaceInventory = new AdSpaceInventory();
    }

    public PageCatalog getPageCatalog() {
        return pageCatalog;
    }

    public void setPageCatalog(PageCatalog pageCatalog) {
        this.pageCatalog = pageCatalog;
    }

    public AdSpaceInventory getAdSpaceInventory() {
        return adSpaceInventory;
    }

    public void setAdSpaceInventory(AdSpaceInventory adSpaceInventory) {
        this.adSpaceInventory = adSpaceInventory;
    }
    
    public Consumer getConsumer()
    {
        return consumer;      
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public ProbabilityOfClicks getPoc() {
        return poc;
    }

//    public UserPotential getUserPotential() {
//        return userPotential;
//    }
//
//    public void setUserPotential(UserPotential userPotential) {
//        this.userPotential = userPotential;
//    }
//
    public void setPoc(ProbabilityOfClicks poc) {
        this.poc = poc;
    }

    public void checkifUserisAPotentialUser() {
    }
}
