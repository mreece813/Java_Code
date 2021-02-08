public class TeamLeader extends ProductionWorker 
{
  private double monthlyBonus;
  private double requiredTrainingHours;
  private double completedTrainingHours;
  public TeamLeader(String name, String number, String hireDate, int shift, double payRate, double monthlyBonus, double rth, double cth) throws InvalidEmployeeNumber, InvalidShift, InvalidPayRate
  {
    super(name, number, hireDate, shift, payRate);
    this.monthlyBonus = monthlyBonus;
    this.requiredTrainingHours = rth;
    this.completedTrainingHours = cth;
  }
  public double getMonthlyBonus() 
  {
    return monthlyBonus;
  }
  public void setMonthlyBonus(double bonus) 
  {
    this.monthlyBonus = bonus;
  }
  public double getRequiredTrainingHours() 
  {
    return requiredTrainingHours;
  }
  public void setRequiredTrainingHours(double hours) 
  {
    this.requiredTrainingHours = hours;
  }
  public double getCompletedTrainingHours() 
  {
    return completedTrainingHours;
  }
  public void setCompletedTrainingHours(double hours) 
  {
    this.completedTrainingHours = hours;
  }
  public String toString() 
  {
    String str = super.toString();
    str += "\nEmployee Monthly Bonus: " + monthlyBonus +
           "\nEmployee Required Training Hours: " + requiredTrainingHours +
           "\nEmployee Completed Training Hours: " + completedTrainingHours;
    return str;
  }
}