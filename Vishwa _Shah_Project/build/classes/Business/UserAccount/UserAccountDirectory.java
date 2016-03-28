/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Vishwa
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory()
    {
        userAccountList = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
//    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
//        UserAccount userAccount = new UserAccount();
//        userAccount.setUsername(username);
//        userAccount.setPassword(password);
//        userAccount.setEmployee(employee);
//        userAccount.setRole(role);
//        userAccountList.add(userAccount);
//        return userAccount;
//    }
    
    public boolean checkifUsernameUnique(String Username)
    {
        for(UserAccount ua : userAccountList)
        {
            if(ua.getUsername().equals(Username))
            {
                return false;
            }
        }
        return true;
    }
    
}
