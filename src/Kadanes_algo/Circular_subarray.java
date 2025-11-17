package Kadanes_algo;
import java.util.*;
public class Circular_subarray {
    public static void main(String[] args) {
        int[]arr = {5,-3 , 5};
         int ans = kadane(arr);
        System.out.println(ans);
    }
    static int kadane(int[]arr){
        int max = arr[0];
        int min = arr[0];
        int sumMax = 0;
        int sumMin = 0;
        int total = 0;
        for(int i = 0 ; i<arr.length ; i++){
            total = total+arr[i];
            sumMax = sumMax + arr[i];
            max = Math.max(max , sumMax);
            if(sumMax<0){
                sumMax = 0;
            }

            sumMin = Math.min(sumMin + arr[i] , arr[i]);
            min = Math.min(min,sumMin);
        }
        if(max<0) return max;
        int circular = total - min;
        return Math.max(circular , max);
    }
}
