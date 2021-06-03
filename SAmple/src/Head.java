public class Head extends Employee{

    private final int Max_leave_can_approve=20;
    @Override
    public void applyLeave(String empname, int no_of_days_leave) {
      if( no_of_days_leave<=Max_leave_can_approve && no_of_days_leave>10)
      {
          System.out.println("Hod approved "+ no_of_days_leave+" days leave for the employee.."+empname);
      }
      else
      {
          supervisor.applyLeave(empname, no_of_days_leave);
      }
    }
    
    
}
