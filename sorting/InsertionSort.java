import java.util.*;
public class InsertionSort{
    public static int[] sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            int j;
            for(j=i-1;j>=0 && key<arr[j];j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = key;
        }
        return arr;
    
  }
  public static void main(String[] args){
        int arr[] = { 12, 11, 13, 5};
        System.out.println("Sorted array: "+Arrays.toString(sort(arr)));
  }
}
