/*
 * Michael Reece
 * 177000762
 */

public class Daily extends Appointment
{
    private int check;
    private String reasons;
    public Daily(int month, int day, int year, String reason)
    {
        check = day;
        setAppointment(reason);
        setType("Daily is ");
    }
    public boolean occursOn(int month, int day, int year)
    {
        if (check == day)
        { 
            return true;
        }
        else
        {
            return false;
        }
    }
}
