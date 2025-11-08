package StringBuilder;
import java.util.*;
public class Palidromic_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int flag = 1;
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                flag++;
            }
            i++;
            j--;

        }
        if(flag==1){
            System.out.println("palindrome");
        }else{
            System.out.println("not");
        }
    }
}
