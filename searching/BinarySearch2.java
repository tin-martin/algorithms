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
