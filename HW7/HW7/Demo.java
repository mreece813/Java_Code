import java.util.Random;
import java.util.Arrays;
public class Demo
{
    static int counter = 0;
    public static void main(String[] args)
    {
       Random rand = new Random(); 
       int[] arr = new int[10];
       for (int i = 0; i < arr.length; i++) 
       {
           arr[i] = rand.nextInt(100);
       }
       System.out.println("The array is: " + Arrays.toString(arr));
       selectionSort select = new selectionSort();
       select.sort(arr);
       mergeSort mergeSort = new mergeSort();
       mergeSort.sort(arr);
       System.out.println("The merge sort array is: " + Arrays.toString(arr));
       System.out.println("The counter is: " + counter);
    }
}
