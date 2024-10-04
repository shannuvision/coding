import java.util.*;
public class FindRoots {
    public static void FindingRoots(int a,int b,int c){
        int discriminant=b*b-4*a*c;
        if(discriminant==0){
            System.out.println((-b/(2*a))+" "+(-b/(2*a)) );
        }else if(discriminant>0){
            System.out.println(((-b +Math.sqrt(discriminant))/(2*a))+" "+((-b-Math.sqrt(discriminant)))/(2*a));
        }else{
            double real= -b/(2*a);
            double imag= (Math.sqrt(-discriminant))/(2*a);
            System.out.println(real+"+"+imag+"i"+" "+real+"-"+imag+"i");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        FindingRoots(a, b, c);

    }
}
