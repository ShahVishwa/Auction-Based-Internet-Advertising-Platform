/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business.EcoSystem;
import Business.Employee.PublisherFinance;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.PublisherFinance.PublisherFinanceWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Vishwa
 */
public class PublisherFinanceRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        PublisherFinance pf = (PublisherFinance)account.getEmployee();
        return new PublisherFinanceWorkAreaJPanel(userProcessContainer,account,organization,enterprise,pf);
    }
    
    
}
