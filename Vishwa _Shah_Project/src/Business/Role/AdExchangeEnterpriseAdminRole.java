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
import UserInterface.AdExchangeEnterpriseAdminRole.AdExchangeEnterpriseAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Vishwa
 */
public class AdExchangeEnterpriseAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
       return new AdExchangeEnterpriseAdminWorkAreaJPanel(userProcessContainer,enterprise);
    }
    
}
