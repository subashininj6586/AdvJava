/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Subha
 */
public class Vice_Chancellor extends Employee{
    
    private final int Max_leave_can_approve=30;
    @Override
    public void applyLeave(String empname, int no_of_days_leave) {
      if( no_of_days_leave<=Max_leave_can_approve)
      {
          System.out.println("VC approved "+ no_of_days_leave+" days leave for the employee.."+empname);
      }
      else
      {
          System.out.println("Leave got cancelled.. Meet VC directly");
      }
    }
}
