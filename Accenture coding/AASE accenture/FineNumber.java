import java.util.*;
public class FineNumber {
    public static int LArgestOf2Diff(int arr1[],int arr2[],int n,int m){
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       int max_1=arr1[n-1];
       int max_2=arr2[m-1];
        return Math.abs(max_2-max_1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int arr2[]=new int[m];
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(LArgestOf2Diff(arr1, arr2, n, m));
    }
    
}
