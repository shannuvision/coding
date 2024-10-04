import java.util.*;
public class DivisiByBoth{
    public static int  Divisible35(int n,int m){
        int sum=0;
        for(int i=m;i<=n;i++){
            if(i%3==0 && i%5==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        sc.close();
        System.out.println(Divisible35(n, m));
    }
}