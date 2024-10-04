import java.util.*;
public class CountWordsStr {
    public static int WordsInStr(String A){
        int count =1;
        int n=A.length();
        for(int i=0;i<n-1;i++){
            if(A.charAt(i)==' ' && A.charAt(i+1)!=' '){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        sc.close();
        System.out.println(WordsInStr(A));
    }
}
