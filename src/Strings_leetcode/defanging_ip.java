package Strings_leetcode;
import java.util.*;
public class defanging_ip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String address = sc.nextLine();
        Solution sol = new Solution();
        String ans = sol.defangIPaddr(address);
        System.out.println(ans);
    }
}
class Solution {
    public String defangIPaddr(String address) {
           String s = "[.]";
           StringBuilder ans = new StringBuilder("");
           for(int i = 0 ; i<address.length() ; i++){
               char ch = address.charAt(i);
               if(ch!='.'){
                   ans.append(ch);
               }else{
                   ans.append(s);
               }
           }
           String ans2 = ans.toString();
           return ans2;
    }
}
