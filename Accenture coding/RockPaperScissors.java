import java.util.*;
public class RockPaperScissors{
    public static String Game(String A){
        if (A.equals("rock")){
            return "paper";
        }else if(A.equals("scissors")){
            return "rock";
        }else{
            return "scissors";
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        System.out.println(Game(A));
    }
}