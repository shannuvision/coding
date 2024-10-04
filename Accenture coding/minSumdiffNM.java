import java.util.*;
public class minSumdiffNM {
    public static int MinDiff(int n,int m){
        int notSum=0;
        int Sum=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                Sum=Sum+i;
            }else {
                notSum=notSum+i;
            }

        }
        System.out.println(notSum);
        System.out.println(Sum);
        return (notSum-Sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.close();
        System.out.println(MinDiff(n, m));
    }
    
}
