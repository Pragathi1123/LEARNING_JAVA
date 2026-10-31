package DAY3.SESSION2;
import java.util.Scanner;
public class StringSpoil2 {
    public static reverse(String name) {
        char[] arr=name.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right]
            arr[right]=temp;
            left++;
            right--;
        }
        return new String[arr];
        
    
     
    }
}
