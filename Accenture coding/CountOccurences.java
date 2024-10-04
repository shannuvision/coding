import java.util.*;
public class CountOccurences {
    public static int Countingoccur(int arr[],int num){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==num){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(Countingoccur(arr, num));
    }

    
}
