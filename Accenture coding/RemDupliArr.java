// import java.util.*;
// public class RemDupliArr {
//     public static int RemovingDupli(int arr[],int n){
//         int j = 0;

//         for (int i = 1; i < arr.length; i++) {
//             // If current element is different from the last unique element
//             if (arr[i] != arr[j]) {
//                 j++;
//                 arr[j] = arr[i]; // Move the unique element to the next position
//             }
//         }

//         return j + 1;
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         sc.close();
//         Arrays.sort(arr);
//         int k=RemovingDupli(arr,n);
//         for (int i = 0; i < k; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

import java.util.*;
public class RemDupliArr{
    public static int removingDupli(int arr[]){
        int j=0;
        for(int i=1;i<arr.length;i++){
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
        sc.close();
        Arrays.sort(arr);
        int k=removingDupli(arr);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

















