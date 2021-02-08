/*
 * Michael Reece
 * 177000762
 */

public class Appointment
{
    private String type;
    private String appoint;

     public Appointment()
    {
        type = " ";
        appoint = " ";
    }

     public void setType(String description)
    {
        type = description;
    }
    
     public void setAppointment(String reason)
    {
        appoint = reason;
    }
    
    public String toString()
    {
        return "Appointment: " + type + appoint;
    }
    public boolean occursOn(int month,int day,int year)
    {
        return true;
    }
}
