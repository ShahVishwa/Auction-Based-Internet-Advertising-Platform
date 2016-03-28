/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author Vishwa
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeelist;
    
    public EmployeeDirectory()
    {
        employeelist = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployeelist() {
        return employeelist;
    }
    
}
