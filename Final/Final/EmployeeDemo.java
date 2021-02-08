public class EmployeeDemo {

  public static void main(String[] args) throws InvalidShift, InvalidPayRate, InvalidEmployeeNumber
  {
    Employee ee = new Employee("Johnny Johnsonson", "4765-E", "1/08/2013");
    System.out.println("\nThis is a basic employee object: ");
    System.out.println(ee);
    ProductionWorker pw1 = new ProductionWorker("Jim Bob", "695-L", "4/4/2004", 1, -2.00);
    System.out.println("\nThis is the first Production Worker object: ");
    System.out.println(pw1);
    ShiftSupervisor ss1 = new ShiftSupervisor("Lacey Noak", "241-A", "6/19/2009", 15000, 4000);
    System.out.println("\nThis is the first Shift Supervisor object: ");
    System.out.println(ss1);
    TeamLeader tl1 = new TeamLeader("Mark Lane", "973-H", "9/08/2006",1, 20.00, 1000, 75, 20);
    System.out.println("\nThis is the first Team Leader object: ");
    System.out.println(tl1);

  } 
}