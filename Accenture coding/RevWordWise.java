import java.util.*;
public class RevWordWise{
    public static void ReversStr(String A){
        String str[]=A.split(" ");
        String B="";
        
        for(String i:str){
           StringBuilder words=new StringBuilder(i);
           words.reverse();
           B= B + words.toString()+" ";
        }
        System.out.println(B);
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String A=sc.nextLine();
    sc.close();
    ReversStr(A);
}
}