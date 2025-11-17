package ARRAY_GFG;
import java.util.*;
public class Leaders_in_array {
    public static void main(String[] args) {
        int[]arr = {16 , 17 , 4,3,5,2};
        ArrayList<Integer> list = new ArrayList<>();
        int currLeader = arr[arr.length-1];
        list.add(currLeader);
        for(int i = arr.length-2 ; i>=0 ; i--){
            if(arr[i]>currLeader){
                currLeader = arr[i];
                list.add(arr[i]);
            }
        }
        Collections.reverse(list);
        System.out.print(list);
    }
}
