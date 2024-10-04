import java.util.*;
public class RemovewhiteSpacesStr {
    public static String removespaces(String A){
        String newString=A.replaceAll("\\s","");
        return newString;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        sc.close();
        System.out.println(removespaces(A));
    }
}
