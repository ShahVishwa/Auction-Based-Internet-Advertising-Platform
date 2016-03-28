/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business.EcoSystem;
import Business.Employee.Advertiser;
import Business.Enterprise.Enterprise;
import Business.Organization.AdvertisingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Advertiser.AdvertiserWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Vishwa
 */
public class AdvertiserRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        Advertiser advertiser = (Advertiser)account.getEmployee();
        return new AdvertiserWorkAreaJPanel(userProcessContainer, account,(AdvertisingOrganization)organization,enterprise,advertiser,business);
    }
    
}
