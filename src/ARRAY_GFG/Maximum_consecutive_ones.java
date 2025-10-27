package ARRAY_GFG;
import java.util.*;
public class Maximum_consecutive_ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        int count = 1;
        int sub_count = 0;
        for(int i = 0 ; i<arr.length-1 ; i++){
            if(arr[i]==arr[i+1]){
                 sub_count++;
            }
            if(sub_count>count){
                count = sub_count;
            }
        }
        if(sub_count==0){
            System.out.println(0);
        }else{
            System.out.println(count);
        }

    }
}
