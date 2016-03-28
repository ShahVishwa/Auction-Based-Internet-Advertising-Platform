/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Publisher;

import Business.Business.EcoSystem;
import Business.Employee.Publisher;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.WebsiteOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.Auction.AuctionJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Vishwa
 */
public class WebsiteWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization websiteOrganization;
    private Enterprise enterprise;
    private Publisher publisher;
    private EcoSystem system;

    /**
     * Creates new form PublisherWorkAreaJPanel
     */
    public WebsiteWorkAreaJPanel(JPanel userProcessContainer,UserAccount account, Organization organization,Enterprise enterprise,Publisher publisher,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.websiteOrganization = (WebsiteOrganization)organization;
        this.enterprise = enterprise;
        this.publisher = publisher;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        publisherWorkAreaJLabel = new javax.swing.JLabel();
        managePageJButton = new javax.swing.JButton();
        viewAdInventoryJButton = new javax.swing.JButton();
        manageSpaceJButton = new javax.swing.JButton();
        viewBiddingJButton = new javax.swing.JButton();
        workRequestJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));

        publisherWorkAreaJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        publisherWorkAreaJLabel.setText("Publisher Work Area");
        publisherWorkAreaJLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));

        managePageJButton.setText("Manage Page");
        managePageJButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        managePageJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePageJButtonActionPerformed(evt);
            }
        });

        viewAdInventoryJButton.setText("View Ad Inventory");
        viewAdInventoryJButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        viewAdInventoryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAdInventoryJButtonActionPerformed(evt);
            }
        });

        manageSpaceJButton.setText("Manage Space");
        manageSpaceJButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        manageSpaceJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageSpaceJButtonActionPerformed(evt);
            }
        });

        viewBiddingJButton.setText("View Bidding");
        viewBiddingJButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        viewBiddingJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBiddingJButtonActionPerformed(evt);
            }
        });

        workRequestJButton.setText("Consumer WorkRequest");
        workRequestJButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        workRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workRequestJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(managePageJButton)
                            .addComponent(viewAdInventoryJButton)
                            .addComponent(manageSpaceJButton)
                            .addComponent(viewBiddingJButton)
                            .addComponent(workRequestJButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(publisherWorkAreaJLabel)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(publisherWorkAreaJLabel)
                .addGap(34, 34, 34)
                .addComponent(managePageJButton)
                .addGap(18, 18, 18)
                .addComponent(manageSpaceJButton)
                .addGap(18, 18, 18)
                .addComponent(viewAdInventoryJButton)
                .addGap(18, 18, 18)
                .addComponent(viewBiddingJButton)
                .addGap(18, 18, 18)
                .addComponent(workRequestJButton)
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void managePageJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePageJButtonActionPerformed
        ManagePageJPanel mpjp = new ManagePageJPanel(userProcessContainer,publisher);
        userProcessContainer.add("ManagePageJPanel",mpjp);
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_managePageJButtonActionPerformed

    private void viewAdInventoryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAdInventoryJButtonActionPerformed
        ViewAdSpaceInventoryJPanel vasijp = new ViewAdSpaceInventoryJPanel(userProcessContainer, publisher);
        userProcessContainer.add("ViewAdSpaceInventoryJPanel",vasijp);
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_viewAdInventoryJButtonActionPerformed

    private void manageSpaceJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageSpaceJButtonActionPerformed
        ManageSpaceJPanel msjp = new ManageSpaceJPanel(userProcessContainer,publisher);
        userProcessContainer.add("ManageSpaceJPanel",msjp);
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_manageSpaceJButtonActionPerformed

    private void viewBiddingJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBiddingJButtonActionPerformed
        AuctionJPanel awajp = new AuctionJPanel(userProcessContainer);
        userProcessContainer.add("AuctionWorkAreaJPanel",awajp);
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_viewBiddingJButtonActionPerformed

    private void workRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workRequestJButtonActionPerformed
        ConsumerClickWorkRequestJPanel ccwrjp = new ConsumerClickWorkRequestJPanel(userProcessContainer,account, websiteOrganization,publisher,system);
        userProcessContainer.add("ConsumerClickWorkRequestJPanel",ccwrjp);
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_workRequestJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton managePageJButton;
    private javax.swing.JButton manageSpaceJButton;
    private javax.swing.JLabel publisherWorkAreaJLabel;
    private javax.swing.JButton viewAdInventoryJButton;
    private javax.swing.JButton viewBiddingJButton;
    private javax.swing.JButton workRequestJButton;
    // End of variables declaration//GEN-END:variables
}
