/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MarketerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Vishwa
 */
public class MarketingOrganization extends Organization{

    public MarketingOrganization() {
        super(Organization.Type.Marketer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList<>();
       roles.add(new MarketerRole());
       return roles;
    }
    
}
