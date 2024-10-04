import java.util.*;
public class PalindromStr {
    public static Boolean isPalindrome(String A){
        int n=A.length();
        for(int i=0;i<A.length()/2;i++){
            if(A.charAt(i)!=A.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        sc.close();
        System.out.println(isPalindrome(A));
    }
    
}
