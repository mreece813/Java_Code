public class ShiftSupervisor extends Employee 
{
  private double Salary;
  private double Bonus;
  public ShiftSupervisor(String name, String number, String hireDate, double salary, double bonus) throws InvalidEmployeeNumber, InvalidPayRate 
  {
    super(name, number, hireDate);
    this.Salary = salary;
    this.Bonus = bonus;
    if (this.Salary < 0)
    {
        throw new InvalidPayRate();
    }
  }
  public double getAnnualSalary() {
    return Salary;
  }
  public void setAnnualSalary(double newSalary) 
  {
    this.Salary = newSalary;
  }
  public double getAnnualBonus() 
  {
    return Bonus;
  }
  public void setAnnualBonus(double newBonus) 
  {
    this.Bonus = newBonus;
  }
  public String toString() 
  {
    String str = super.toString();
    str += "\nEmployee Annual Salary: " + Salary +
           "\nEmployee Annual Bonus: " + Bonus;
    return str;
  }
}