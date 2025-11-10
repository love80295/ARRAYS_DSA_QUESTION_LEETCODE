package Strings_leetcode;
import java.util.*;
public class Goal_Parser_Interpretation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        Solution3 sol = new Solution3();
        String result = sol.interpret(command);
        System.out.println(result);

    }
}
class Solution3 {
    public String interpret(String command) {

        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i<command.length() ; i++){
            if(command.charAt(i)=='G'){
                ans.append('G');
            } else if(command.charAt(i)=='(' && command.charAt(i+1)==')') {
                ans.append('o');
                i++;
            }else if(command.charAt(i)=='('&& command.charAt(i+1)=='a'){
                  ans.append("al");
                  i+=3;
            }
        }

        return ans.toString();
    }
}
