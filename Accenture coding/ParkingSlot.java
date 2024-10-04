import java.util.*;
public class ParkingSlot {
    public static int EmptySlotToPark(char arr[],int n){
        int count=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]=='S'&& arr[i+1]=='S'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char arr[]=str.toCharArray();
        int n=arr.length;
        sc.close();
        System.out.println(EmptySlotToPark(arr, n));
    }


    
}
