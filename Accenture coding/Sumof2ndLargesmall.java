import java.util.*;
public class Sumof2ndLargesmall {
    public static int OddEvenlargesmall(int arr[],int n){
        Arrays.sort(arr);
        return arr[3]+arr[n-4];
    }
    not working---
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        n=arr.length;
        System.out.println(OddEvenlargesmall(arr, n));

    }
}
