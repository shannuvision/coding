import java.util.*;
public class Merge2Arrays{
    public static void UnionofArr(int arr1[],int arr2[],int arr3[],int n1,int n2,int n3){
        int i=0;
        int j=0;
        int k=0;
        while(i<n1){
            arr3[k++]=arr1[i++];
        }
        while(j<n2){
            arr3[k++]=arr2[j++];
        }
        Arrays.sort(arr3);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        int n3=n1+n2;
        int arr3[]=new int[n3];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        sc.close();
        UnionofArr(arr1, arr2, arr3, n1, n2, n3);
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}