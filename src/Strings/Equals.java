package Strings;
import java.util.*;
public class Equals {
    public static void main(String[] args) {
        String s = "hello";
        String str = "hello";
        String str1 = new String("hello");
        System.out.println(s==str); // == only checks address , hence gives true
        System.out.println(s==str1); // hence gives false as addresses are different
        System.out.println(s.equals(str1)); // it checks the full string

    }
}
