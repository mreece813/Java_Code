public class Ship implements Comparable<Ship>
{
    private String name;
    private String year;
  
    public Ship()
    {
        this.name = "";
        this.year = "";
    }

  public Ship(String name, String year) 
  {
      this.name = name;
      this.year = year;
  }
    
  public String getName() 
  {
      return name;
  }

  public void setName(String name) 
  {
      this.name = name;
  }

  public String getYear() 
  {
      return year;
  }
    
  public int getYearInt() 
  {
      return Integer.parseInt(year);
  }

  public void setYear(String year) 
  {
      this.year = year;
  }
  
  public String toString()
  {
      return("Ship Name: " + this.name + " Year: " + this.year);
  }
    
  public int compareTo(Ship other)
  {       
      int otherYear = other.getYearInt();
      if(this.getYearInt() < otherYear)
      {
          return -1;
      }
      else if(this.getYearInt() == otherYear)
      {
          return 0;
      }
      else
      {
          return 1;
      }
  }        
}