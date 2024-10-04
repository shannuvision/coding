import java.util.Scanner;
public class isPalindromeNum {
    public static Boolean PalindromeOrNot(int num){
        int orig=num;
        int lastDigit;
        int rev=0;
        while(num!=0){
            lastDigit=num%10;
            rev=rev*10+lastDigit;
            num=num/10;
        }
        if(orig==rev){
            return true;
        }else{
            return false;
        }
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        System.out.println(PalindromeOrNot(num));
    }
}
