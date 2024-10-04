import java.util.Scanner;

public class ReverseNumber {
    public static int revNum(int num){
        int lastdigit;
        int rev=0;
        while(num!=0){
            lastdigit=num%10;
            rev=rev*10+lastdigit;
            num=num/10;
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        System.out.println(revNum(num));
    }
}
