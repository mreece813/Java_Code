public class Employee 
{
  private String name;
  private String number; 
  private String hireDate;
  private String str;
  public Employee(String name, String number, String hireDate) throws InvalidEmployeeNumber
  {
    str = number.replaceAll("\\D+","");
    int i = Integer.parseInt(str);
    char num = number.charAt(0);
    if (i > 9999 || i < 0 || num == '-')
    {
        throw new InvalidEmployeeNumber();
    }
    this.name = new String(name);
    this.number = new String(number);
    this.hireDate = new String(hireDate);
  }
  public String getName()
  {
    return name;
  }
  public void setName(String name) 
  {
    this.name = name;
  }
  public String getNumber() 
  {
    return number;
  }
  public void setNumber(String number) 
  {
    this.number = number;
  }
  public String getHireDate() 
  {
    return hireDate;
  }
  public void setHireDate(String hireDate) 
  {
    this.hireDate = hireDate;
  }
  public String toString() 
  {
    String str = "Employee Name: " + name +
                 "\nEmployee Number: " + number +
                 "\nEmployee Hire Date: " + hireDate;
    return str;
  }
}
