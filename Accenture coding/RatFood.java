import java.util.*;
public class RatFood{
    public static int HousesSuffi(int arr[],int unit,int r) {
        int foodNeed=r*unit;
        int sum=0;
        int count=0;
        if (arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            count++;
            if(sum>=foodNeed){
                break;
            }
        }
        if (sum<foodNeed){
            return 0;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int unit=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(HousesSuffi(arr, unit, r));
    }
}