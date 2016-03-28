/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Auction;


import Business.Business.EcoSystem;
import Business.Employee.Auction;
import Business.Employee.Marketer;
import Business.Enterprise.AdvertiserEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AuctionOrganization;
import Business.Organization.MarketingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AdExchangeWorkRequest;
import Business.WorkQueue.AdSpaceRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.Marketing.AdExchangeWorkRequestJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Vishwa
 */
 public class PublisherWorkRequestJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization auctionOrganization;
    private Auction a;
    private EcoSystem system;

    /**
     * Creates new form PublisherWorkRequest
     */
    public PublisherWorkRequestJPanel(JPanel userProcessContainer,UserAccount account, Organization org,Auction a,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.auctionOrganization = (AuctionOrganization)org;
        this.a = a;
        this.system = system;
        receivingWorkRequest();
    }
    
    private void receivingWorkRequest()
    {
        for(WorkRequest request : auctionOrganization.getWorkQueue().getWorkRequestList())
        {
            if(request instanceof AdExchangeWorkRequest)
            {
                AdExchangeWorkRequest awr = (AdExchangeWorkRequest)request;
                awr.getSender();
                awr.getConsumer();
                awr.getPage();
                awr.getReceiver();
                
//                Notification n = new Notification();
//                n.setConsumer(awr.getConsumer());
//                n.setPage(awr.getPage());
//                n.setSender(account);
                
//                for(Network network : system.getNetworklist())
//                {
//                    for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriselist())
//                    {
//                        if(enterprise instanceof AdExchangeEnterprise)
//                        {
//                            for(Organization org : enterprise.getOrganizationDirectory().getOrganizationlist())
//                            {
//                                if(org instanceof MarketingOrganization)
//                                {
//                                    for(UserAccount ua : org.getUserAccountDirectory().getUserAccountList())
//                                    {
//                                        n.setReceiver(ua);
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
                
   
                AdSpaceRequest asr = new AdSpaceRequest();
                asr.setSender(account);
                asr.setConsumer(awr.getConsumer());
                asr.setPage(awr.getPage());
           
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
                        for(UserAccount ua : org.getUserAccountDirectory().getUserAccountList()){
                            awr.setReceiver(ua);
                            org.getWorkQueue().getWorkRequestList().add(awr);
                            account.getWorkQueue().getWorkRequestList().add(awr);
                            Marketer m = (Marketer)ua.getEmployee();
                            AdExchangeWorkRequestJPanel aewrjp = new AdExchangeWorkRequestJPanel(userProcessContainer, m, org, ua, system,enterprise);
                            userProcessContainer.add("AdExchangeWorkRequestJPanel",aewrjp);
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

        senderJTextField = new javax.swing.JTextField();
        receiverJTextField = new javax.swing.JTextField();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(senderJTextField)
                    .addComponent(receiverJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(senderJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(receiverJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField receiverJTextField;
    private javax.swing.JTextField senderJTextField;
    // End of variables declaration//GEN-END:variables
}
