import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Recursion
{
    static int randNums(int[] a, int i, int arrSize)
    {
        Random num = new Random();
        if (i == arrSize)
        {
            return 0;
        }
        a[i] = num.nextInt(100);
        i++;
        return (randNums(a, i, arrSize));
    }
    static int findSum(int[] a, int index) 
    { 
        if (index == 0)
        {
            return a[index]; 
        }
        return a[index] + findSum(a, index - 1); 
    }
    
    public static void main(String[] args) 
    {
        int i = 0;
        Scanner arr = new Scanner(System.in);
        System.out.println("Enter a number for the size of your array: ");
        int arrSize = arr.nextInt();
        int a[] = new int[arrSize];
        randNums(a,i,arrSize);
        System.out.println("The array is: " + Arrays.toString(a));
        System.out.println("The sum is: " + findSum(a, a.length - 1)); 
    } 
}
