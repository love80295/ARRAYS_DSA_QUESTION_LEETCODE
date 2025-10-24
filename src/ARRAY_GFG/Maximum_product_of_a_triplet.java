package ARRAY_GFG;

import java.util.Arrays;

public class Maximum_product_of_a_triplet {
    public static void main(String[] args) {
        int[]arr = {10, 3, 5, 6, 20};
        Arrays.sort(arr);
        int mul = arr[arr.length-1];
        int index = -1;
        int slar = -1;
        for(int i = arr.length-2 ; i>=0 ; i--){
            if(arr[i]!=arr[arr.length-1]){
                index = i;
                slar = arr[i];
                break;
            }
        }
        for(int i = index-1 ; i>=0 ; i--){
            if(arr[i]!=slar){
                mul = mul*slar*arr[i];
                System.out.println(mul);
                break;
            }
        }



    }
}
