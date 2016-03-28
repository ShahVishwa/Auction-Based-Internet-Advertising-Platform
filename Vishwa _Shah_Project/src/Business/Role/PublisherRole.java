/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business.EcoSystem;
import Business.Employee.Publisher;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.WebsiteOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.Publisher.WebsiteWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Vishwa
 */
public class PublisherRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        Publisher publisher = (Publisher)account.getEmployee();
        return new WebsiteWorkAreaJPanel(userProcessContainer, account, (WebsiteOrganization)organization,enterprise,publisher,business);
    }
    
}
