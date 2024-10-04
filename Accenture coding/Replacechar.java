import java.util.*;
public class Replacechar{
    public static void Replcingch(char arr[], int n,char ch1,char ch2){
        for(int i=0;i<n;i++){
            if(arr[i]==ch1){
                arr[i]=ch2;
            }
            else if(arr[i]==ch2){
                arr[i]=ch1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        char ch1=sc.next().charAt(0);
        char ch2=sc.next().charAt(0);
        sc.close();
        int n=A.length();
        char arr[]=A.toCharArray();
        Replcingch(arr, n, ch1, ch2);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}