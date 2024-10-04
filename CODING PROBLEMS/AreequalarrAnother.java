import java.util.*;
public class AreequalarrAnother {
    public static Boolean AreEqual(int arr1[],int arr2[]){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(AreEqual(arr1, arr2));
        
    }
}
