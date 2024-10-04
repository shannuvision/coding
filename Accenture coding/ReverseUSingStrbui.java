import java.util.*;
public class ReverseUSingStrbui {
    public static void StrReverse(String A){
        StringBuilder rverse=new StringBuilder();
        rverse.append(A);
        rverse.reverse();
        System.out.println(rverse);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        sc.close();
        StrReverse(A);
    }
    
}
