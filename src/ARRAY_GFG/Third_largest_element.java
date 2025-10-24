package ARRAY_GFG;
import java.util.*;
public class Third_largest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int lar = arr[arr.length-1];
        int slar = -1;
        int index = -1;
        for(int i = arr.length-2 ; i>=0 ; i--){
            if(arr[i]!=lar){
                slar = arr[i];
                index = i;
                break;
            }
        }
        for(int i = index-1 ; i>=0 ; i--){
            if(arr[i]!=slar){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
