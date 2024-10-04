import java.util.*;
public class RemoveDupliStr {
    public static int RemDuplicates(char arr[]){
        Arrays.sort(arr);
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        return j+1;
    }   
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        sc.close();
        char arr[]=A.toCharArray();
        int k=RemDuplicates(arr);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    } 
}

