package ARRAY_GFG;
import java.util.*;
public class Remove_duplicates {
    public static void main(String[] args) {
        int[]arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        duplicates(arr);
    }
    static void duplicates(int[]arr){
        int count = 0;
        for(int i = 0 ; i<arr.length-1 ; i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
        }
        dup(arr , count);

    }
    static void dup(int[]arr , int count){
        int[]brr = new int[arr.length-count];
        int k = 0;
        for(int i = 0 ; i<arr.length-1 ; i++){
            if(arr[i]!=arr[i+1]){
                brr[k] = arr[i];
                k++;
            }
        }
        brr[k] = arr[arr.length-1];
        System.out.println(Arrays.toString(brr));
    }
}
