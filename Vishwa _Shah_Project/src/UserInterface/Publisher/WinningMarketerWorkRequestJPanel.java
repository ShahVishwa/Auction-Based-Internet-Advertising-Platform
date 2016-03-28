/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Publisher;

import Business.Business.EcoSystem;
import Business.Employee.Consumer;
import Business.Employee.Employee;
import Business.Employee.Publisher;
import Business.Employee.PublisherFinance;
import Business.Enterprise.ConsumerEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PublisherEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PublisherFinanceOrganization;
import Business.Organization.WebsiteOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DisplayAdRequest;
import Business.WorkQueue.GenerateBillWorkRequest;
import Business.WorkQueue.PublisherWorkRequest;
import Business.WorkQueue.WinningAdvertiserRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.Consumer.OutputJPanel;
import UserInterface.PublisherFinance.GenerateBillWorkRequestJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Vishwa
 */
public class WinningMarketerWorkRequestJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization websiteOrganization;
    private Publisher p;
    private EcoSystem system;
    private Enterprise enterprise;

    /**
     * Creates new form WinningMarketerWorkRequestJPanel
     */
    public WinningMarketerWorkRequestJPanel(JPanel userProcessContainer,UserAccount account,Organization organization,Publisher p,EcoSystem system,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.websiteOrganization = (WebsiteOrganization)organization;
        this.p = p;
        this.system = system;
        this.enterprise = enterprise;
        receivingRequest();
        
    }
    
    private void receivingRequest()
    {
        for(WorkRequest request : websiteOrganization.getWorkQueue().getWorkRequestList())
        {
            if(request instanceof WinningAdvertiserRequest)
            {
                WinningAdvertiserRequest war = (WinningAdvertiserRequest)request;
                war.getSender();
                war.getReceiver();
                war.getMarketer();
                war.getNoOfThousandImpressions();
                war.getConsumer();
                war.getPage();
                war.getAd();
                
                GenerateBillWorkRequest gbwr = new GenerateBillWorkRequest();
                gbwr.setSender(account);
                gbwr.setNoOfThousandImpressions(war.getNoOfThousandImpressions());
                gbwr.setMarketer(war.getMarketer());
                gbwr.setConsumer(war.getConsumer());
                gbwr.setPage(war.getPage());
                gbwr.setAd(war.getAd());
                gbwr.setBid(true);
                
                for(Organization org : enterprise.getOrganizationDirectory().getOrganizationlist())
                {
                    if(org instanceof PublisherFinanceOrganization)
                        {
                            for(Employee employee : org.getEmployeeDirectory().getEmployeelist())
                            {
                                PublisherFinance pf = (PublisherFinance)employee;
                                pf.getOrder().setMarketer(war.getMarketer());
                                for(UserAccount ua : org.getUserAccountDirectory().getUserAccountList())
                                {
                                    gbwr.setReceiver(ua);
                                }
                                org.getWorkQueue().getWorkRequestList().add(gbwr);
                                account.getWorkQueue().getWorkRequestList().add(gbwr);
                                GenerateBillWorkRequestJPanel gbwrjp = new GenerateBillWorkRequestJPanel(userProcessContainer,account,org,pf,system,enterprise);
                                userProcessContainer.add("GenerateBillMarketerWorkRequestJPanel",gbwrjp);
                                ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
                            }
                        }
                }
                
                DisplayAdRequest dar = new DisplayAdRequest();
                dar.setSender(account);
                dar.setPage(war.getPage());
                dar.setAd(war.getAd());
                dar.setBid(true);
                
                for(Network network : system.getNetworklist())
                {
                    for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriselist())
                    {
                        if(enterprise instanceof ConsumerEnterprise)
                        {
                            for(Organization org : enterprise.getOrganizationDirectory().getOrganizationlist())
                            {
                                for(UserAccount account : org.getUserAccountDirectory().getUserAccountList())
                                {
                                    for(WorkRequest wr : org.getWorkQueue().getWorkRequestList())
                                    {
                                        for(Employee e : org.getEmployeeDirectory().getEmployeelist())
                                        {
                                            Consumer c = (Consumer)e;
                                            if(wr instanceof PublisherWorkRequest)
                                            {
                                                PublisherWorkRequest pwr = (PublisherWorkRequest)request;
                                                if(pwr.isRequest() == true)
                                                {
                                                    if(c == pwr.getConsumer()){
                                                        dar.setReceiver(account);
                                                        org.getWorkQueue().getWorkRequestList().add(dar);
                                                        account.getWorkQueue().getWorkRequestList().add(dar);
                                                        OutputJPanel ojp = new OutputJPanel(userProcessContainer,org);
                                                        userProcessContainer.add("OutputJPanel",ojp);
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
