import java.util.*;
public class RemoveDupliArr{
    public static int removedupli(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        return j+1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        sc.close();
        int k=removedupli(arr);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}