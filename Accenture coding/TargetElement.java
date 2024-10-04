import java.util.*;
public class TargetElement{
    public static Boolean FindTarget(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(FindTarget(arr,target));
    }
}
