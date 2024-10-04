import java.util.*;
public class Anagram {
    public static Boolean isAnagram(char arr1[],char arr2[]){
        if(arr1.length!=arr2.length){
            return false;
        }
        
        if(Arrays.equals(arr1,arr2)){
            return true;
        }else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        sc.close();
        char arr1[]=A.toLowerCase().toCharArray();
        char arr2[]=B.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(isAnagram(arr1, arr2));
    }
    
}
