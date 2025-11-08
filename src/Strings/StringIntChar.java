package Strings;
import java.util.*;
public class StringIntChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "love ";
        str = str + "agrawal"; // here now string is pointing out the new string
        str+=10;
        System.out.println(str);
        System.out.println(str+10+23); // always calculated from left to right
    }
}
