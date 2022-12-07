
/**
 *
 * @author martintin
 */
import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int mod = (int) 1e9+7;
    
    static void mergeSort(int[] arr, int L, int R){
        int mid = (L+R)/2;
        if(Math.abs(L-R) >= 1){
            System.out.println(L);
            System.out.println(R);
            System.out.println("---");       
                mergeSort(arr,L,mid);
                mergeSort(arr,mid+1,R);
            merge(arr,L,R);
        }
       
    }
    
    static void merge(int[] arr, int L, int R){
        int mid = (L+R)/2;
        int[] leftArr = new int[mid-L+1];
        int[] rightArr = new int[R-mid];
        for(int i=0;i<mid-L+1;i++){
            leftArr[i] = arr[L+i];
        }
        for(int i=0;i<R-mid;i++){
            rightArr[i] = arr[mid+1+i];
        }
        int i,j,k;
        i = j = k = 0;
        while(k <= R-L){
            if(i < mid-L+1){
              if(j >= R-mid){
                   arr[k+L] = leftArr[i];
                    i++;
              }else if(leftArr[i] <= rightArr[j]){
                   arr[k+L] = leftArr[i];
                    i++;
                }else{
                   
                arr[k+L] = rightArr[j];
                j++;
                 }
            }else{
                arr[k+L] = rightArr[j];
                j++;
            }
           
            k++;
        }
    }
    public static void main(String[] args) throws IOException{
        int[] arr = {11,3,5,7,8,2,6};
        mergeSort(arr,0,arr.length-1);
        System.out.println("----------------------------");
        System.out.println(Arrays.toString(arr));
    }

    
    static String next () throws IOException {
            while (st == null || !st.hasMoreTokens())
                    st = new StringTokenizer(br.readLine().trim());
            return st.nextToken();
    }
    static long readLong () throws IOException {
            return Long.parseLong(next());
    }
    static int readInt () throws IOException {
            return Integer.parseInt(next());
    }
    static double readDouble () throws IOException {
            return Double.parseDouble(next());
    }
    static char readCharacter () throws IOException {
            return next().charAt(0);
    }
    static String readLine () throws IOException {
            return br.readLine().trim();
    }
    static int readLongLineInt() throws IOException{
        int x = 0, c;
        while((c = br.read()) != ' ' && c != '\n')
            x = x * 10 + (c - '0');
        return x;
    }
    static long pow (long x, long exp){
        if (exp==0) return 1;
        long t = pow(x, exp/2);
        t = t*t %mod;
        if (exp%2 == 0) return t;
        return t*x%mod;
    }
    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
