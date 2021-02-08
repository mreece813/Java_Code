public class ProductionWorker extends Employee 
{
  private int shift;
  private double hourlyPayRate;
  public ProductionWorker(String name, String number, String hireDate, int shift, double payRate) throws InvalidShift,InvalidEmployeeNumber, InvalidPayRate 
  {
    super(name, number, hireDate);
    this.shift = shift;
    this.hourlyPayRate = payRate;
    if (this.shift >2)
    {
        throw new InvalidShift();
    }
    if (this.hourlyPayRate < 0)
    {
        throw new InvalidPayRate();
    }
  }
  public int getShift() 
  {
    return shift;
  }
  public void setShift(int newShift) 
  {
    this.shift = newShift;
  }
  public double getPayRate() 
  {
    return hourlyPayRate;
  }
  public void setPayRate(double newPayRate) 
  {
    this.hourlyPayRate = newPayRate;
  }
  public String toString() 
  {
    String str = super.toString();
    str += "\nEmployee Shift: " + shift +
           "\nEmployee Hourly Pay Rate: " + hourlyPayRate;
    return str;
  }
}