package ARRAY_GFG;
import java.util.*;
public class Sort_zeros_ones_2 {
    public static void main(String[] args) {
        int[]arr = {0,1,0,1,1,0,1};
        sort(arr);

    }
    static void swap( int[]arr , int p1 , int p2){
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;


    }
    static void sort(int[]arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left] ==1 && arr[right]==0){
                swap(arr, left , right);
                left++;
                right--;
            } else if (arr[left]==0) {
                left++;
            }
            else if(arr[right]==1){
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
