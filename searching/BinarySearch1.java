/**
Recursive Binary Search:

Binary Search works on sorted arrays. By choosing a midpoint and comparing it to the value we are searching for, 
we can eliminate around half of the elements in our searching space. We keep doing this until we find x.  

Binary Search Procedure:

let x be the element that we are searching for.

For each recursive round,
1. Identify the midpoint between l (lower bound) and u. (upper bound) If midpoint is not whole, the midpoint will be
   rounded down.
2. If the distance between u and l is 1: 
  a. Check if the value at index l is equal to x. If so, return index l.
  b. If not, x cannot be found in the array. Return -1 to denote this. 
3. If the distance between u and l is greater than 1 check:
  a. If x is equal to the midpoint's value, return the midpoint's index.
  b. If x is less than the midpoint's value, search the left half. This works by changing u (upper bound) to the midpoint's index - 1
     and calling the binary search function (in this case: search()).
  c. If x is greater than the midpoint's value, search the right half. This works by changing l (lower bound) to the midpoint's index + 1 
     and calling the binary search function.
**/

import java.util.*;
public class test{
    public static int search (int[] arr, int l, int u, int x){
        // N is the length of the array of elements which could be x
        int N = 1+(u-l);
        //if the length of potential items is not 1
        if(l!=u){
            int m = l + N/2;
            //if the middle element is x, return the index of the middle
            if(x == arr[m]){
                return m;
            }else if(x < arr[m]){
                //recursively search left half excluding middle
                return search(arr,l,m-1,x);
            }else if(x > arr[m]){
                //recursively search left half excluding middle
                return search(arr,m+1,u,x);
            }
        //if the length of potential items is 1, check whether the item is x. 
        }else if(x == arr[l]){
            return l;
        }
        //If we reach this, item x is not in the searched array.  
        // In this case return -1
        return -1;
    }
  public static void main(String[] args){
        int arr[] = {11,21,32,45,60,76,94};
        System.out.println(search(arr,0,arr.length-1,45));
  }
}
