/*
 * Michael Reece
 * 177000762
 */

public class Onetime extends Appointment
{
    private int checkM;
    private int checkD;
    private int checkY;
    private String reason;
    public Onetime(int month, int day, int year, String reason)
    {
        checkM = month;
        checkD = day;
        checkY = year;
        setAppointment(reason);
        setType("Onetime is ");
    }
    public boolean occursOn(int month, int day, int year)
    {
        if(checkM == month && checkD == day && checkY == year)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
