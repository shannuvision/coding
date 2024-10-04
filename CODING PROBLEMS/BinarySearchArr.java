import java.util.*;
public class BinarySearchArr {
    public static Boolean TargetElement(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target==arr[mid]){
                return true;
            }
            if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int target=sc.nextInt();
        sc.close();
        System.out.println(TargetElement(arr,target));
    }
}
