/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Vishwa
 */
public abstract class Role {
    
    public enum RoleType{
        SystemAdmin("System Admin"),
        EnterpriseAdmin("Enterprise Admin"),
        Publisher("Publisher"),
        PublisherFinance("Publisher Finance"),
        Advertiser("Advertiser"),
        AdvertiserFinance("Advertiser Finance"),
        Sales("Sales"),
        Marketer("Marketer"),
        Auction("Auction"),
        Consumer("Consumer");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem system);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
