/**
Selection sort works by sorting an array in ascending order. It iterates through an entire array. 
For the ith iteration, the ith place is swapped with the smallest number, excluding numbers before i. (which are already sorted) 
**/
import java.util.*;
public class SelectionSort{
  public static int[] sort(int[] arr){
    int N = arr.length;
    for(int i=0;i<N-1;i++){
        int minIndex = i;
        for(int j=i+1;j<N;j++){
            if(arr[j] < arr[minIndex]) minIndex = j;
        }
        int min = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = min;
    }
    return arr;

  }
  public static void main(String[] args){
       int arr[] = {64,25,12,22,11};
       System.out.println("Sorted array: " + Arrays.toString(sort(arr)));
  }
}
