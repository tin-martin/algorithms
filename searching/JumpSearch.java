/**
The array must be in ascendinng order for jump search to work. Iterate through array in blocks of m length. Let x be the searched element. 
If the highest number of a given block is less than x, keep iterating. Otherwise, perform a linear search on the given block. A linear search
is just iterating through the block and comparing each value to x. 
**/
import java.util.*;
public class JumpSearch{
  public static int search(int x, int[] arr){
    //m is the size of jump
    int m = (int)Math.floor(Math.sqrt(arr.length));
    for(int i=0;i<arr.length;i+=m){
        // if x is less than upper limit of jump
        if(x < arr[i+m]){
            //linear search
            for(int j=i;j<=i+m;j++){
                //if value is found
                if (x == arr[j]){
                    return j;
                }
            }
        }
    }
    //if value is not found
    return -1;
  }
  public static void main(String[] args){
        int arr[] = {0,5,15,32,56,79,99};
        int x = 56;
        System.out.println(x + " is at index " + search(x,arr));
  }
}
