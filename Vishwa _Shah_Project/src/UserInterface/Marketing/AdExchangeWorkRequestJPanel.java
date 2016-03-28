/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Marketing;

import Business.Ad.Advertisement;
import Business.Business.EcoSystem;
import Business.Employee.Advertiser;
import Business.Employee.Auction;
import Business.Employee.Employee;
import Business.Employee.Marketer;
import Business.Enterprise.AdExchangeEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AdvertisingOrganization;
import Business.Organization.AuctionOrganization;
import Business.Organization.MarketingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AdSpaceRequest;
import Business.WorkQueue.BidRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.Auction.AdvertiserBidWorkRequestJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Vishwa
 */
public class AdExchangeWorkRequestJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Marketer marketer;
    private Organization marketingOrganization;
    private UserAccount account;
    private EcoSystem system;
    private Enterprise enterprise;


    /**
     * Creates new form AdExchangeWorkRequestJPanel
     */
    public AdExchangeWorkRequestJPanel(JPanel userProcessContainer,Marketer marketer,Organization organization,UserAccount account,EcoSystem system,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.marketer = marketer;
        this.marketingOrganization = (MarketingOrganization)organization;
        this.account = account;
        this.system = system;
        this.enterprise = enterprise;
        receivingAdExchangeWorkRequest();
    }
    
    private void receivingAdExchangeWorkRequest()
    {
        for(WorkRequest request : marketingOrganization.getWorkQueue().getWorkRequestList())
        {
            if(request instanceof AdSpaceRequest)
            {
                
                AdSpaceRequest asr = (AdSpaceRequest)request;
                marketer.setBid(true);
                
                if(marketer.getAdPriceRules().getMinPageHitRate() < asr.getConsumer().getUp().getPageHitRate())
                {
                    asr.setAdPrice(marketer.getAdPriceRules().getAdPrice().getAgePrice());
                }
                else if(asr.getAdPrice() < asr.getPage().getAdSpace().getReservePrice())
                {
                    marketer.setBid(false);
                }
                marketer.setNoOfThousaneImpressions(4);
                
                if(marketer.isBid() == true)
                {  
                    BidRequest br = new BidRequest();
                    br.setSender(account);
                    br.setBidAmount(asr.getAdPrice());
                    br.setAd(gettingAd());
                    br.setNoOfThousandImpressions(marketer.getNoOfThousaneImpressions());
                    br.setConsumer(asr.getConsumer());
                    br.setPage(asr.getPage());
                    br.setBid(true);
                
                for(Network network : system.getNetworklist())
                {
                    for(Enterprise ent : network.getEnterpriseDirectory().getEnterpriselist())
                    {
                        if(ent instanceof AdExchangeEnterprise)
                        {
                    for(Organization org : ent.getOrganizationDirectory().getOrganizationlist())
                    {
                        if(org instanceof AuctionOrganization)
                        {
                        for(UserAccount ua : org.getUserAccountDirectory().getUserAccountList()){
                            br.setReceiver(ua);
                            org.getWorkQueue().getWorkRequestList().add(br);
                            account.getWorkQueue().getWorkRequestList().add(br);
                            Auction a = (Auction)ua.getEmployee();
                            AdvertiserBidWorkRequestJPanel pwrjp = new AdvertiserBidWorkRequestJPanel(userProcessContainer, ua, org, a, system);
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
        }
    
    private Advertisement gettingAd()
    {
        for(Organization o : enterprise.getOrganizationDirectory().getOrganizationlist())
        {
            if(o instanceof AdvertisingOrganization)
            {
                for(Employee e : o.getEmployeeDirectory().getEmployeelist())
                {
                    Advertiser advertiser = (Advertiser)e;
                    Advertisement ad = advertiser.getAd();
                    return ad;
                }
            }
        }return null;   
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
