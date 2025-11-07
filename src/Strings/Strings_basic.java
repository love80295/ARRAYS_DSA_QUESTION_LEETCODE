package Strings;
import java.util.*;
public class Strings_basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = "love agrawal"; // string declaration
//        System.out.println(str);
//        String s = sc.nextLine();  // taking input in a string
//        System.out.println(s);
        String str = "love agrawal";
        String str2 = "A";
        System.out.println(str.length()); // gives the length of a string;
        char ch = str.charAt(5);  // gives the character at the given index;
        System.out.println(ch);
        int index = str.indexOf('a');
        System.out.println(index); // gives the index of a character of 1st occurance;
        System.out.println(str.compareTo(str2)); // compaeres two string if str1 is equal to str2 gives zero if str1>str2 gives +ve number else -ve number
        System.out.println(str.contains("o")); // gives true if that substring is present in main string
        System.out.println(str.startsWith("ov")); // check if the main string with a given substring or not
        System.out.println(str.endsWith("al")); // check if the main string ends with the given substring or not
        System.out.println(str.toLowerCase()); // convert string to lowercase
        System.out.println(str.toUpperCase()); // convert string to uppercase
        System.out.println(str.concat(str2)); // concatinate string1 to string2
    }
}
