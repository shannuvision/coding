import java.util.*;
public class MaxSubarraySum{
    public static int MaxSum(int arr[]){
        int sum=0;
        //kadane's algorithm
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(MaxSum(arr));
    }
}