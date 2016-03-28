/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PublisherFinanceRole;
import Business.Role.PublisherRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Vishwa
 */
public class WebsiteOrganization extends Organization{

    public WebsiteOrganization() {
        super(Organization.Type.Website.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList<>();
       roles.add(new PublisherRole());
       return roles;
    }
    
}
