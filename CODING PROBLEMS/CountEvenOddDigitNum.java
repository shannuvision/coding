import java.util.Scanner;
public class CountEvenOddDigitNum {
    public static void EvenOddDigitsOfNum(int num){
        int lastDigit;
        int evenCount=0;
        int oddCount=0;
        while(num!=0){
            lastDigit=num%10;
            if(lastDigit%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
            num=num/10;
        }
        System.out.println(evenCount+"\n"+oddCount);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        EvenOddDigitsOfNum(num);
    }
}
