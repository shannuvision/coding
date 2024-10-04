import java.util.*;
public class ReplaceCharAtoB {
    public static void AtoBAndBtoA(String A, char arr[],char a, char b){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                arr[i]=b;
            }
            else if(arr[i]==b){
                arr[i]=a;
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        char a=sc.next().charAt(0);
        char b=sc.next().charAt(0);
        sc.close();
        char arr[]=A.toCharArray();
        AtoBAndBtoA(A, arr,a, b);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
