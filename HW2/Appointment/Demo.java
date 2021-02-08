/*
 * Michael Reece
 * 177000762
 */

import java.util.Scanner;
public class Demo
{
    public static void main(String[] args)
    {
        Appointment[] appointments = new Appointment [4];
        appointments[0] = new Daily(2, 10, 2018, "Check Up");
        appointments[1] = new Monthly(2, 15, 2018, "Cleaning");
        appointments[2] = new Onetime(5, 5, 2018, "Root Canal");
        appointments[3] = new Onetime(2, 15, 2018, "Tooth Ache");
        
        System.out.println("Enter a date(month, day, year) to list" + " appointment");
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();
        for(int i = 0; i< appointments.length; i++)
        {
            if (appointments[i].occursOn(month,day,year))
            {
                System.out.println(appointments[i].toString());
            }
        }
    }
}
