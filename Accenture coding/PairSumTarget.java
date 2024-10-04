import java.util.*;
public class PairSumTarget {
    public static void PairSum(int arr[],int target){
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            sum=arr[i]+arr[i+1];
            if(sum==target){
                System.out.println(arr[i]+" "+arr[i+1]);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target =sc.nextInt();
        sc.close();
        PairSum(arr, target);
    }
    
}
