import java.util.*;
public class AdamsCoin {
    public static void CoinsToCharity(int i){
        int coins=i*i;
        System.out.println(coins);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        sc.close();
        CoinsToCharity(i);
    }
}
