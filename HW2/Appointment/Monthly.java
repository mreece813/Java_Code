/*
 * Michael Reece
 * 177000762
 */

public class Monthly extends Appointment
{
    private int check;
    private String reasons;
    public Monthly(int month, int day, int year, String reason)
    {
        check = month;
        setAppointment(reason);
        setType("Monthly is ");
    }
    public boolean occursOn(int month, int day, int year)
    {
        if (check == month)
        { 
            return true;
        }
        else
        {
            return false;
        }
    }

}
