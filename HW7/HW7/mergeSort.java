public class mergeSort extends Demo
{
   public void sort(int[] arr)
   {
      if (arr.length <= 1) 
      { 
          return; 
      }
      int[] first = new int[arr.length / 2];
      int[] second = new int[arr.length - first.length];
      for (int i = 0; i < first.length; i++) 
      { 
         first[i] = arr[i];
      }
      for (int i = 0; i < second.length; i++) 
      { 
         second[i] = arr[first.length + i];
      }
      sort(first);
      sort(second);
      merge(first, second, arr);
   }   
   public static void merge(int[] first, int[] second, int[] arr)
   {  
      int First = 0; 
      int Second = 0; 
      int j = 0;
      while (First < first.length && Second < second.length)
      {  
         if (first[First] < second[Second])
         {  
            arr[j] = first[First];
            First++;
         }
         else
         {  
            arr[j] = second[Second];
            Second++;
         }
         j++;
      }
      while (First < first.length) 
      { 
         arr[j] = first[First]; 
         First++; 
         j++;
      }
      while (Second < second.length) 
      { 
         arr[j] = second[Second]; 
         Second++; 
         j++;
      }
      counter = counter + j;
   }
}
