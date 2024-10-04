import java.util.*;
public class SumOfDiv {
    public static int SumOfFactors(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return sum;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        System.out.println( SumOfFactors(num));
    }
    
}
