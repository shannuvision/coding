import java.util.*;
public class PrimeNum{
    public static Boolean isPrime(int Num){
        if(Num==0 || Num==1){
            return false;
        }
        for(int i=2;i<Math.sqrt(Num);i++){
            if(Num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int Num=sc.nextInt();
        sc.close();
        System.out.println(isPrime(Num));
    }
}