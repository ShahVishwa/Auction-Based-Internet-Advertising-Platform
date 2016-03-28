/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Advertiser;

import Business.Ad.Product;
import Business.Employee.Advertiser;
import java.awt.CardLayout;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Vishwa
 */
public class AddProductJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Advertiser advertiser;

    /**
     * Creates new form AddProductJPanel
     */
    public AddProductJPanel(JPanel userProcessContainer,Advertiser advertiser) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.advertiser = advertiser;
        groupButton();
    }
    
    private void groupButton()
    {
        ButtonGroup bg = new ButtonGroup();
        bg.add(advertisementJRadioButton);
        bg.add(noAdvertisementJRadioButton);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        priceJTextField = new javax.swing.JTextField();
        availabilityJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        addJButton = new javax.swing.JButton();
        advertisementJRadioButton = new javax.swing.JRadioButton();
        noAdvertisementJRadioButton = new javax.swing.JRadioButton();
        addAnotherProductJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));

        jLabel1.setText("Name:");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));

        jLabel2.setText("Price:");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));

        jLabel3.setText("Availability:");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));

        nameJTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));

        priceJTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));

        availabilityJTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));

        backJButton.setText("<< Back");
        backJButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        addJButton.setText("Add");
        addJButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        advertisementJRadioButton.setText("Advertisement");
        advertisementJRadioButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        advertisementJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advertisementJRadioButtonActionPerformed(evt);
            }
        });

        noAdvertisementJRadioButton.setText("No Advertisement");
        noAdvertisementJRadioButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        noAdvertisementJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noAdvertisementJRadioButtonActionPerformed(evt);
            }
        });

        addAnotherProductJButton.setText("Add Another Product");
        addAnotherProductJButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        addAnotherProductJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAnotherProductJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addJButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(addAnotherProductJButton))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(priceJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(availabilityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(advertisementJRadioButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(noAdvertisementJRadioButton))))))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(priceJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(availabilityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(advertisementJRadioButton)
                    .addComponent(noAdvertisementJRadioButton))
                .addGap(34, 34, 34)
                .addComponent(addJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(addAnotherProductJButton)
                .addGap(93, 93, 93)
                .addComponent(backJButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        try{
        if(advertisementJRadioButton.isSelected())
        {
            String name = nameJTextField.getText();
            int price = Integer.parseInt(priceJTextField.getText());
            int avail = Integer.parseInt(availabilityJTextField.getText());
        
            Product product = (Product)advertiser.getProductCatalog().addProduct();
            product.setName(name);
            product.setPrice(price);
            product.setAvail(avail);
            product.setAdvertisement(true);
        
            nameJTextField.setEnabled(false);
            priceJTextField.setEnabled(false);
            availabilityJTextField.setEnabled(false);
        }
        else if(noAdvertisementJRadioButton.isSelected())
        {
            String name = nameJTextField.getText();
            int price = Integer.parseInt(priceJTextField.getText());
            int avail = Integer.parseInt(availabilityJTextField.getText());
            
            Product product = (Product)advertiser.getProductCatalog().addProduct();
            product.setAdvertisement(false);
            product.setName(name);
            product.setPrice(price);
            product.setAvail(avail);
            
            nameJTextField.setEnabled(false);
            priceJTextField.setEnabled(false);
            availabilityJTextField.setEnabled(false);
            
        }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Enter a Valid String");
            return;
        }
        
        
//        if(advertisementJRadioButton.isSelected())
//        {
//            product.setAdvertisement("Yes");
//        }
//        else
//        {
//            product.setAdvertisement("No");
//        }
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void noAdvertisementJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noAdvertisementJRadioButtonActionPerformed
        
    }//GEN-LAST:event_noAdvertisementJRadioButtonActionPerformed

    private void advertisementJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advertisementJRadioButtonActionPerformed
        
    }//GEN-LAST:event_advertisementJRadioButtonActionPerformed

    private void addAnotherProductJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAnotherProductJButtonActionPerformed
        nameJTextField.setEnabled(true);
        priceJTextField.setEnabled(true);
        availabilityJTextField.setEnabled(true);
        
        nameJTextField.setText("");
        priceJTextField.setText("");
        availabilityJTextField.setText("");
        groupButton();
    }//GEN-LAST:event_addAnotherProductJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAnotherProductJButton;
    private javax.swing.JButton addJButton;
    private javax.swing.JRadioButton advertisementJRadioButton;
    private javax.swing.JTextField availabilityJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JRadioButton noAdvertisementJRadioButton;
    private javax.swing.JTextField priceJTextField;
    // End of variables declaration//GEN-END:variables
}