import java.util.Random;
public class data
{
    public static int[] randomizer(int level)
    {
        Random random = new Random();
        int randomNum1, randomNum2, sum;
        randomNum1 = random.nextInt(10);
        randomNum2 = random.nextInt(10);
        if (level == 1) 
        {
            sum = randomNum1 + randomNum2;
            while (sum >= 10) 
            {
                randomNum1 = random.nextInt(10);
                randomNum2 = random.nextInt(10);
                sum = randomNum1 + randomNum2;
            }
        } 
        else if (level == 2) 
        {
            sum = randomNum1 + randomNum2;
            if (sum == 0) 
            {
                randomNum1 = random.nextInt(10);
                randomNum2 = random.nextInt(10);
                sum = randomNum1 + randomNum2;
            }
        } 
        else 
        {
            sum = randomNum1 - randomNum2;
            while (sum < 0) 
            {
                randomNum1 = random.nextInt(10);
                randomNum2 = random.nextInt(10);
                sum = randomNum1 - randomNum2;
            }   
        }
        int[] list = new int[3];
        list[0] = randomNum1;
        list[1] = randomNum2;
        list[2] = sum;
        return list;
    }

}
