/**
Bubble sort works by iterating through adjacent pairs in an array. If any pairs do not conform to the 
ascending pattern, the pair is reversed. (such that the first element becomes the second and vice versa) 
The iterative process then restarts from the beginning. When the bubble sort iteerates through the entire array
without detecting any abnormalities, the array is fully sorted.
**/
import java.util.*;
public class BubbleSort{
  public static int[] bubbleSort(int[] arr){
    int N = arr.length;
    boolean isSorted = false;
    while(!isSorted){
        isSorted = true; 
        for(int i=0;i<N-1 && isSorted;i++){
            if(arr[i+1] < arr[i]){
                //swaps arr[i+1] and arr[i]
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                isSorted = false;
            }
            
      
        }
    }
    return arr;
  }
  public static void main(String[] args){
       int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Sorted array: " + Arrays.toString(bubbleSort(arr)));
  }
}
