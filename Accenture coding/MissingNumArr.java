import java.util.*;
public class MissingNumArr {
    public static int MissedNum(int arr[],int n){
        int sum=0;
        int intSum=(n+1)*(n+2)/2;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return intSum-sum;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(MissedNum(arr,n));
    }
}
