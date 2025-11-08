package Strings;
import java.util.*;
public class substr {
    public static void main(String[] args) {
//        String str = "abcde";
//        System.out.println(str.substring(0,str.length())); // here 0 is included and 4 is excluded
//        System.out.println(str.substring(1)); // means it will print from index 1 to the end
        // question

//        String s = "physics";
//        for(int i = 2 ; i<4 ; i++){
//            System.out.print(s.substring(i));
//        }

        // question
        String str = "abcd";
        for(int i = 0 ; i<=str.length() ; i++){
            for(int j = i+1 ; j<=str.length() ; j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }

}
