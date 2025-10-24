package ARRAY_GFG;
import java.util.*;
public class Second_Largest_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[7];
        for(int i = 0 ; i<7 ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int lar = arr[arr.length-1];
        for(int i = arr.length-2 ; i>=0 ; i--){
            if(arr[i]!=lar){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
