import java.util.Scanner;
public class SumOfDigitsNum {
    public static int SumOfDigits(int num){
        int lastDigit;
        int sum=0;
        while(num!=0){
            lastDigit=num%10;
            sum+=lastDigit;
            num=num/10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        System.out.println(SumOfDigits(num));
    }
}
