import java.util.*;
public class Swapping2Numbers{
    public static void Swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        Swap(a,b);
    }
}