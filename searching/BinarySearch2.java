import java.util.*;
import java.io.*;
public class test{
    public static int search(int[] arr,int x){
        int N = arr.length;
        int k = 0;
        for(int b=N/2;b>=1;b/=2){
              while (k+b < N && arr[k+b] <= x) k += b;
        }
        if(arr[k] == x) return k;
        return -1;
    }
    public static void main(String[] args) throws Exception{
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println(search(arr,20));
        
       
    }
}
