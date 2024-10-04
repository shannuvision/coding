import java.util.*;
public class LargeNuminArray{
    public static void LargeNum(int arr[]){
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        System.out.println(max);
        System.out.println(index);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        LargeNum(arr);
    }
}