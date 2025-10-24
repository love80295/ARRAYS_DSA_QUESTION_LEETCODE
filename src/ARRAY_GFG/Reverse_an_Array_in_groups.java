package ARRAY_GFG;

import java.util.Arrays;

public class Reverse_an_Array_in_groups {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8};
        int k = 3;
        se(arr , k);
        System.out.println(Arrays.toString(arr));
    }
    static void se(int[]arr , int k){
        int start = -1 , end = -1;
        for(int i = 0 ; i<arr.length ; i = i+k){
            start = i;
            if(i+k<arr.length){
                end = i+k-1;
            }else{
                end = arr.length-1;
            }
            reverse(arr , start , end);
        }


    }

    static void reverse(int[]arr , int start , int end){
        while(start<end){
            int temp = arr[start];
            arr[start] =  arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}
