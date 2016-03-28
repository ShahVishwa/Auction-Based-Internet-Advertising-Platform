/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Marketing;

import Business.Ad.Product;
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
                asr.getSender();
                asr.getReceiver();
                asr.getConsumer();
                asr.getPage();
                
                
//                senderJTextField.setText(String.valueOf(asr.getConsumer().getName()));
//                receiverJTextField.setText(String.valueOf(asr.getPage().getName()));
                
                if(marketer.getAdPriceRules().getMinAge() < asr.getConsumer().getAge()  && asr.getConsumer().getAge()< marketer.getAdPriceRules().getMaxAge())
                {
                    asr.setAdPrice(marketer.getAdPriceRules().getAdPrice().getAgePrice());
                }
                else if(marketer.getAdPriceRules().getMinPageHitRate()< asr.getConsumer().getUp().getPageHitRate())
                {
                    asr.setAdPrice(marketer.getAdPriceRules().getAdPrice().getPageHitRatePrice());
                }
                else if(marketer.getAdPriceRules().getInterest() == asr.getConsumer().getInterests())
                {
                    asr.setAdPrice(marketer.getAdPriceRules().getAdPrice().getConsumerInterestPrice());
                }
                else if(marketer.getAdPriceRules().getMinAdSpaceHeight()<asr.getPage().getAdSpace().getHeight() && marketer.getAdPriceRules().getMinAdSpaceBreadth()<asr.getPage().getAdSpace().getBreadth())
                {
                    asr.setAdPrice(marketer.getAdPriceRules().getAdPrice().getAdSpaceDimensionPrice());
                }
                for(Product p : asr.getConsumer().getConsumerProductList())
                {
                    for(Product product : marketer.getAdPriceRules().getProductCatalog().getProductList())
                    {
                        if(p == product)
                        {
                            asr.setAdPrice(marketer.getAdPriceRules().getAdPrice().getProductPrice());
                        }
                    }
                }
                if(asr.getAdPrice() < asr.getPage().getAdSpace().getReservePrice())
                {
                    marketer.setBid(false);
                }
//                else
//                {
//                    marketer.setBid(false);
//                }
                
                
                
//                senderJTextField.setText(String.valueOf(asr.getAdPrice()));
                
                if(marketer.isBid() == true)
                {
                    
                    BidRequest br = new BidRequest();
                    br.setSender(account);
                    br.setBidAmount(asr.getAdPrice());
                    br.setAdName(gettingAd());
                
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
    
    private String gettingAd()
    {
        for(Organization o : enterprise.getOrganizationDirectory().getOrganizationlist())
        {
            if(o instanceof AdvertisingOrganization)
            {
                for(Employee e : o.getEmployeeDirectory().getEmployeelist())
                {
                    Advertiser advertiser = (Advertiser)e;
                    String name = advertiser.getAd().getName();
                    return name;
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

        senderJTextField = new javax.swing.JTextField();
        receiverJTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));

        senderJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senderJTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(senderJTextField)
                    .addComponent(receiverJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(senderJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(receiverJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void senderJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senderJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senderJTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField receiverJTextField;
    private javax.swing.JTextField senderJTextField;
    // End of variables declaration//GEN-END:variables
}
