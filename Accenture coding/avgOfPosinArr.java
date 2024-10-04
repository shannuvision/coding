import java.util.*;
public class avgOfPosinArr {
    public static double AverageofPos(int arr[]){
        double sum=0;
        double count=0;
        for(int i=0;i<arr.length;i++ ){
            if(arr[i]>0){
                sum+=arr[i];
                count++;
            }
        }
        return sum/count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(AverageofPos(arr));
    }
    
}
