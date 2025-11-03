package ARRAY_GFG;
import java.util.*;
public class Stock_Buy_and_Sell {
    public static void main(String[] args) {
        int sum = 0;
        int profit = 0;
        int[]arr = {7, 10, 1, 3, 6, 9, 2};
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[j]>arr[i]){
                    sum = arr[j]-arr[i];
                }
                if(sum>profit){
                    profit = sum;
                    sum = 0;

                }
            }
        }
        System.out.println(profit);

    }
}
