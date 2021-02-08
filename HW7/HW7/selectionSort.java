import java.util.Arrays;
public class selectionSort
{
    public static void sort(int[] arr)
    { 
        int n = arr.length; 
        int counter = 0;
        for (int i = 0; i < n-1; i++) 
        {             
            int min_idx = i; 
            for (int j = i+1; j < n; j++)
            {
                if (arr[j] < arr[min_idx])
                {
                    min_idx = j;
                    counter++;
                }
            }
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        }
        System.out.println("The selection sort is: " + Arrays.toString(arr));
        System.out.println("The counter is: " + counter);
    }
}
