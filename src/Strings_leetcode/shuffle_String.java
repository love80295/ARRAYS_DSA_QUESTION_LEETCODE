package Strings_leetcode;
import java.util.*;
public class shuffle_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    }
}
class Solution2{
    public String restoreString(String s, int[] indices) {
          char[]ans = new char[s.length()];
          for(int i = 0 ; i<s.length() ; i++){
              ans[indices[i]] = s.charAt(i);
          }
          String ans1 = new String(ans);
          return ans1;
    }
}
