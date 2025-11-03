package ARRAY_GFG;
import java.util.*;
public class Adding_one_to_number {
    public static void main(String[] args) {
        int[]arr = {1,2,4};
        int sum = 0;
        for(int i = 0 ; i<arr.length ; i++){
            sum = sum*10 + arr[i];
        }
        System.out.println(sum+1);
    }
}
