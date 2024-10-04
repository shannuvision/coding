import java.util.Scanner;
public class MissingNumArr {
    public static int ArrNumMissed(int arr[],int n){
        int Sum=(n+1)*(n+2)/2;
        int totalSum=0;
        for(int i=0;i<n;i++){
            totalSum+=arr[i];
        }
        return Sum-totalSum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(ArrNumMissed(arr,n));
    }
    
}
