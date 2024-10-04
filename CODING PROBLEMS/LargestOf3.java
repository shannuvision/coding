import java.util.Scanner;
public class LargestOf3 {
    public static int Largestnum(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }else if(b>c){
            return b;
        }else{
            return c;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        System.out.println(Largestnum(a, b, c));

    }
}
