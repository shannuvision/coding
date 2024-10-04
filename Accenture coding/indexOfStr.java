import java.util.*;
public class indexOfStr {
    public static int IndexStr(String A,String B){
        int index=A.indexOf(B);
        return index;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        sc.close();
        System.out.println(IndexStr(A, B));
    }    
}
