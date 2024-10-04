import java.util.*;
public class CountChStr{
    public static int countthech(char arr[], char character){
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==character){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char arr[]=str.toCharArray();
        
        char character=sc.next().charAt(0);
        sc.close();
        System.out.println(countthech(arr, character));
    }
}
