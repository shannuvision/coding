
import java.util.*;
public class OperatChoic {
    public static void OperationChoices(double a, double b, int choice){
        switch(choice){
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4: double val=a/b;
                    System.out.printf("%.4f",val);
            break;
            default: System.out.println("invalid choice");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        int choice=sc.nextInt();
        sc.close();
        OperationChoices(a, b, choice);


    }
}
