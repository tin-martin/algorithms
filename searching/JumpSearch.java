/**

Jump search works on a sorted array. 

In jump search, the algorithm jumps through the array at a particular increment. 

For example, with the increment of 2, the jump search would look at values at indexes of 2,4,6,8, etc.
Importantly, the jump search searches from left to right.

Iterating through these values, if the value is smaller than x, (the value we are searching for)
we know that x can be found between the selected index and the (selected index - jump increment + 1) inclusive.

We can perform a linear search to find x.
**/

import java.util.*;
public class JumpSearch{
    public static int search (int[] arr, int x){
        int step = (int)Math.floor(Math.sqrt(arr.length)); 
        int j = step-1;   
        while(x > arr[j]){
            if(j >= arr.length-1) return -1;
            j += step;
        }
        for(int i=j-step+1;i<j;i++){
            if (x == arr[i]){
                return i;
            }
        }
        return -1;
    }
  public static void main(String[] args){
        int arr[] = {11,21,32,45,60,76,94};
        System.out.println(search(arr,60));
  }
}
