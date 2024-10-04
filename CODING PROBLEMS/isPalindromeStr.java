import java.util.Scanner;

public class isPalindromeStr {
    public static Boolean PalindromeOrNotStr(String A){
        StringBuilder sb=new StringBuilder();
        sb.append(A);
        String rev=sb.reverse().toString();
        if(rev.equals(A)){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        sc.close();
        System.out.println(PalindromeOrNotStr(A));
    }
}
