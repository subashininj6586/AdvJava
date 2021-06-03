/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Subha
 */
public class DeputyHead extends Employee{

    private final int Max_leave_can_approve=10;
    @Override
    public void applyLeave(String empname, int no_of_days_leave) {
      if( no_of_days_leave<=Max_leave_can_approve)
      {
          System.out.println("Deputy Hod approved "+ no_of_days_leave+" days leave for the employee.."+empname);
      }
      else
      {
          supervisor.applyLeave(empname, no_of_days_leave);
      }
    }
    
    
}
