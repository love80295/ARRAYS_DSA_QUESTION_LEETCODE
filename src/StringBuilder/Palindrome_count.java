package StringBuilder;
import java.util.*;
public class Palindrome_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int total = pal(s);
        System.out.println(total);
    }
    static int pal(String s){
        int count = 0;
        for(int i = 0 ; i<s.length() ; i++){
            for(int j = i+1 ; j<=s.length() ; j++){
                if(check(s.substring(i,j))) count++;
            }
        }
        return count;
    }
    static boolean check(String s){

        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
