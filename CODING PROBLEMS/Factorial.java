import java.util.Scanner;
public class Factorial {
    public static int FactorialOfNum(int num){
        if(num==0 || num==1){
            return 1;
        }
        int factorial=1;
        for(int i=1;i<=num;i++){
            factorial=factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        System.out.println(FactorialOfNum(num));
    }
    
}
