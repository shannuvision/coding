import java.util.*;
public class ReverseNum{
    public static int ReversingNum(int N){
        int last;
        int reverse=0;
        while(N>0){
            last=N%10;
            reverse=reverse*10+last;
            N=N/10;
        }
        return reverse;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        sc.close();
        System.out.println(ReversingNum(N));
    }
}