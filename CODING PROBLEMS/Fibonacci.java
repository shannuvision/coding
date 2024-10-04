import java.util.Scanner;
public class Fibonacci {
    public static void PrintFibonacci(int N){
        int first=0;
        int second=1;
        System.out.print(first+" "+second+" ");
        for(int i=2;i<N;i++){
            int third=first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        sc.close();
        PrintFibonacci(N);
    }

}
