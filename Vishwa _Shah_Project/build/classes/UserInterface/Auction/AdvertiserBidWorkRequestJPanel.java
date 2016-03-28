/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Auction;

import Business.Business.EcoSystem;
import Business.Employee.Auction;
import Business.Employee.Employee;
import Business.Employee.Marketer;
import Business.Employee.Publisher;
import Business.Enterprise.AdvertiserEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PublisherEnterprise;
import Business.Network.Network;
import Business.Organization.AuctionOrganization;
import Business.Organization.MarketingOrganization;
import Business.Organization.Organization;
import Business.Organization.WebsiteOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BidRequest;
import Business.WorkQueue.WinningAdvertiserRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.Publisher.WinningMarketerWorkRequestJPanel;
import java.awt.CardLayout;
import java.util.TreeSet;
import javax.swing.JPanel;

/**
 *
 * @author Vishwa
 */
public class AdvertiserBidWorkRequestJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization auctionOrganization;
    private Auction a;
    private EcoSystem system;

    /**
     * Creates new form AdvertiserBidWorkRequestJPanel
     */
    public AdvertiserBidWorkRequestJPanel(JPanel userProcessContainer, UserAccount account,Organization organization,Auction a,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.auctionOrganization = (AuctionOrganization)organization;
        this.a = a;
        this.system = system;
        receivingRequest();
    }
    
    private void receivingRequest()
    {
        for(WorkRequest request : auctionOrganization.getWorkQueue().getWorkRequestList())
        {
            if(request instanceof BidRequest)
            {
                BidRequest br = (BidRequest)request;
                br.getSender();
                br.getReceiver();
                br.getBidAmount();
                br.getAdName();
                
                TreeSet<Float> tset = new TreeSet<>();
                tset.add(br.getBidAmount());
                Object highestBid = tset.last();
                
                for(Network network : system.getNetworklist())
                {
                    for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriselist())
                    {
                        if(enterprise instanceof AdvertiserEnterprise)
                        {
                            for(Organization org : enterprise.getOrganizationDirectory().getOrganizationlist())
                            {
                                if(org instanceof MarketingOrganization)
                                {
                                    for(Employee employee : org.getEmployeeDirectory().getEmployeelist())
                                    {
                                        Marketer m = (Marketer)employee;
                                        if(m.getAdPriceRules().getAdPrice() == highestBid)
                                        {
                                            a.setWinningMarketer(m);
                                            WinningAdvertiserRequest war = new WinningAdvertiserRequest();
                                            war.setSender(account);
                                            war.setMarketer(m);
                                            
                                                                                        {
                                            if(enterprise instanceof PublisherEnterprise)
                                            {
                                                for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationlist())
                                                {
                                                    if(organization instanceof WebsiteOrganization)
                                                    {
                                                        for(UserAccount ua : organization.getUserAccountDirectory().getUserAccountList())
                                                        {
                                                            war.setReceiver(ua);
                                                            organization.getWorkQueue().getWorkRequestList().add(war);
                                                            account.getWorkQueue().getWorkRequestList().add(war);
                                                            Publisher p = (Publisher)ua.getEmployee();
                                                            WinningMarketerWorkRequestJPanel wmwrjp = new WinningMarketerWorkRequestJPanel(userProcessContainer, account, organization, p, system, enterprise);
                                                            userProcessContainer.add("WinningMarketerWorkRequestJPanel",wmwrjp);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
