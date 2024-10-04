import java.util.Scanner;
public class CountDigitofNum {
    public static int countDigits(int num){
        int count=0;
        while(num!=0){
            count++;
            num=num/10;          
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        System.out.println(countDigits(num));
    }
}
