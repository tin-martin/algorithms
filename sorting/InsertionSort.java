/**
This is how insertion sorting works:
For all elements from arr[1] to arr[n] (n = length of array - 1):
    Let the current element, the key, be arr[i]
    
    1. In descending order, iterate through elements between arr[0] inclusive and arr[i] exclusive. Move elements larger than key to the next element. 
    If the element is smaller than the key, change the next element to the key value and go to the next iteration.
**/
import java.util.*;
public class InsertionSort{
    public static int[] sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j;
            for(j=i-1;j>=0 && key<arr[j];j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = key;
        }
        return arr;
    exit()
  }
  public static void main(String[] args){
        int arr[] = { 12, 11, 13, 5};
        System.out.println("Sorted array: "+Arrays.toString(sort(arr)));
  }
}
