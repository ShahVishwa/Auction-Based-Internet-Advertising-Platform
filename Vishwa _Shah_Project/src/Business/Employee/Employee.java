/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;


/**
 *
 * @author Vishwa
 */
public abstract class Employee {
    
    private String name;
    private int employeeID;
    private static int count = 0;
    
    public Employee()
    {
        count++;
        employeeID = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }
   
    
    @Override
    public String toString()
    {
        return name;
    }
    
    
}
