import java.util.*;
public class MinNoChoco {
    public static int MinimumArrnum(int arr[],int n){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int avg = (min + max) / 2;
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += Math.abs(arr[i] - avg);
        }
        return res;
    }
    wrong output---
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(MinimumArrnum(arr, n));
    }
}
