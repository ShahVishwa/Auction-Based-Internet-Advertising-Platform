/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PublisherFinanceRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Vishwa
 */
public class PublisherFinanceOrganization extends Organization{

    public PublisherFinanceOrganization() {
        super(Organization.Type.PublisherFinance.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
       roles.add(new PublisherFinanceRole());
       return roles;
    }
    
}
