/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Publisher;


import Business.Business.EcoSystem;
import Business.Employee.Auction;
import Business.Employee.Employee;
import Business.Employee.Publisher;
import Business.Enterprise.AdExchangeEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AuctionOrganization;
import Business.Organization.Organization;
import Business.Organization.WebsiteOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AdExchangeWorkRequest;
import Business.WorkQueue.PublisherWorkRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.Auction.PublisherWorkRequestJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Vishwa
 */
public class ConsumerClickWorkRequestJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization websiteOrganization;
    private Publisher p;
    private EcoSystem system;

    /**
     * Creates new form ConsumerClickWorkRequest
     */
    public ConsumerClickWorkRequestJPanel(JPanel userProcessContainer,UserAccount account,Organization organization,Publisher p,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.websiteOrganization = (WebsiteOrganization)organization;
        this.p = p;
        this.system = system;
        receivingWorkRequest();       
    }
    
    private void receivingWorkRequest()
    {
        for(WorkRequest request : websiteOrganization.getWorkQueue().getWorkRequestList())
        {
            if(request instanceof PublisherWorkRequest){
               PublisherWorkRequest pwr = (PublisherWorkRequest)request;
//               pwr.getSender();
//               pwr.getConsumer();
//               pwr.getReceiver();
//               pwr.getPage();
               
               
               AdExchangeWorkRequest awr = new AdExchangeWorkRequest();
               awr.setSender(account);
               awr.setConsumer(pwr.getConsumer());
               awr.setPage(pwr.getPage());
        for(Network network : system.getNetworklist())
        {
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriselist())
            {
                if(enterprise instanceof AdExchangeEnterprise)
                {
                    for(Organization org : enterprise.getOrganizationDirectory().getOrganizationlist())
                    {
                        if(org instanceof AuctionOrganization)
                        {
                        for(UserAccount ua : org.getUserAccountDirectory().getUserAccountList()){
                            awr.setReceiver(ua);
                            org.getWorkQueue().getWorkRequestList().add(awr);
                            account.getWorkQueue().getWorkRequestList().add(awr);
                            sendRequestToAuction();
                            }
                        }
                        
                    }
                }
            }
        }
                       
            }            
        }
    }
    
    private void sendRequestToAuction()
    {
        for(Network network : system.getNetworklist())
        {
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriselist())
            {
                if(enterprise instanceof AdExchangeEnterprise)
                {
                    for(Organization org : enterprise.getOrganizationDirectory().getOrganizationlist())
                    {
                        if(org instanceof AuctionOrganization)
                        {
                            for(Employee e : org.getEmployeeDirectory().getEmployeelist())
                            {
                                for(UserAccount ua : org.getUserAccountDirectory().getUserAccountList())
                                {
                                   Auction a = (Auction)e;
                                   Auction auction = (Auction)ua.getEmployee();
                                   if(a == auction)
                                   {
                                   PublisherWorkRequestJPanel pwrjp = new PublisherWorkRequestJPanel(userProcessContainer, ua, org, a, system);
                                   userProcessContainer.add("PublisherWorkRequestJPanel",pwrjp);
                                   ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer); 
                                   }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
