import java.util.*;
public class LenSubWoRep {
    public static int LenOfSubStr(char arr[],int n){
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        int n=A.length();
        sc.close();
        char arr[]=A.toCharArray();
        System.out.println(LenOfSubStr(arr, n));
    }
    
}
