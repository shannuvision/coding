import java.util.*;
public class Kthlargearr {
    public static int kthLargeELement(Integer arr[], int K){
        Arrays.sort(arr,Collections.reverseOrder());
        return arr[K-1];
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer arr[]=new Integer[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int K=sc.nextInt();
        sc.close();
        System.out.println(kthLargeELement(arr, K));
    }
    
}
