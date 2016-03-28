/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Vishwa
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networklist;
    
    public static EcoSystem getInstance()
    {
        if( business == null)
        {
            business = new EcoSystem();
        }
        return business;
    }
    
    public EcoSystem()
    {
        super(null);
        networklist = new ArrayList<>();
    }
    
    public Network createAndAddNetwork()
    {
        Network network = new Network();
        networklist.add(network);
        return network;
    }

    public ArrayList<Network> getNetworklist() {
        return networklist;
    }

    public void setNetworklist(ArrayList<Network> networklist) {
        this.networklist = networklist;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> rolelist = new ArrayList<>();
        rolelist.add(new SystemAdminRole());
        return rolelist;
    }
    
    public boolean checkifUsernameisUnique(String username)
    {
        if(this.getUserAccountDirectory().checkifUsernameUnique(username))
        {
            return false;
        }
        return true;
    }
    
    
    
}
