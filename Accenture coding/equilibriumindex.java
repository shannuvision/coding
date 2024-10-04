import java.util.*;
public class equilibriumindex {
    public static int IndexOfEquill(int arr[],int n){
        int leftSum=0;
        int totalSum=0;
        // for total sum loop
        for(int i=0;i<n;i++){
            totalSum+=arr[i];
        }
        for(int i=0;i<n;i++){
            totalSum=totalSum-arr[i];
            if(leftSum==totalSum){
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(IndexOfEquill(arr, n));
    }
}
