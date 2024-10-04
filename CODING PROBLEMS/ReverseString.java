import java.util.Scanner;

public class ReverseString {
    public static String Revstr(String A){
        StringBuilder sb=new StringBuilder();
        sb.append(A);
        String rev=sb.reverse().toString();
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        sc.close();
        System.out.println(Revstr(A));
    }
}
