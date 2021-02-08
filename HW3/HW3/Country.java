public class Country implements Measurable
{
    private String name;
    private double area;
    public Country(String Name, double Area)
    {
            name = Name;
            area = Area;
    }
    public String getName()
    {
        return name;
    }
    public double getArea()
    {
        return area;
    }

    public double getMeasure()
    {
        return area;
    }
}