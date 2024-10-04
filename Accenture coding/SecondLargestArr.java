import java.util.*;
public class SecondLargestArr {
    public static void SecLargestOfArray(Integer arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[0]!=arr[i]){
                System.out.println(arr[i]);
                break;
            }
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer arr[]=new Integer[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr,Collections.reverseOrder());
        SecLargestOfArray(arr);
    }
    
}
