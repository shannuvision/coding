import java.util.*;
public class RevWordsStr {
    public static String WOrdsAfterreverse(String A){
        String[] words=A.split(" ");
        String rev="";
        for(String i:words){
            StringBuilder sb=new StringBuilder(i);
            sb.reverse();
            rev=rev+sb.toString()+" ";
        }
        return rev;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        sc.close();
        System.out.println(WOrdsAfterreverse(A));
    }
}
