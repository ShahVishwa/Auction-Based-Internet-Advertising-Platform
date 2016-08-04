/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Business;

import Business.Employee.SystemAdmin;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Vishwa
 */
public class ConfigureABusiness {
    
    public static EcoSystem configure()
    {
        EcoSystem system = EcoSystem.getInstance();
        
        SystemAdmin systemAdmin = new SystemAdmin();
        systemAdmin.setName("Raunak Agrawal");
        
        UserAccount ua = new UserAccount();
        ua.setUsername("sysadmin");
        ua.setPassword("sysadmin");
        ua.setEmployee(systemAdmin);
        ua.setRole(new SystemAdminRole());
        //create a network
        //create an enterprise
        //create some organization
        
        system.getEmployeeDirectory().getEmployeelist().add(systemAdmin);
        system.getUserAccountDirectory().getUserAccountList().add(ua);
        
        return system;
    }
    
}
