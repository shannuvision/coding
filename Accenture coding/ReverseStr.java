import java.util.*;
public class ReverseStr {
    public static String Reversing(String A){
        char ch;
        String reversed="";

        for(int i=0;i<A.length();i++){
            ch=A.charAt(i);
            reversed=ch+reversed;

        }
        return reversed;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        sc.close();
        System.out.println(Reversing(A));
    }
    
}
