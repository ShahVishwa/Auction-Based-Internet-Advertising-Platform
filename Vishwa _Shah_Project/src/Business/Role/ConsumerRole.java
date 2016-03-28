 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business.EcoSystem;
import Business.Employee.Consumer;
import Business.Enterprise.Enterprise;
import Business.Organization.ConsumerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Consumer.ConsumerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Vishwa
 */
public class ConsumerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        Consumer consumer = (Consumer)account.getEmployee();
        return new ConsumerWorkAreaJPanel(userProcessContainer, account, (ConsumerOrganization)organization, enterprise,consumer,system);
    }
    
    
    
}
