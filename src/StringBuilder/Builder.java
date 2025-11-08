package StringBuilder;
import java.util.*;
public class Builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        str.setCharAt(0 , 'm'); // set the character at 0;
        System.out.println(str);
        str.append(" now we go "); // can append string,character,integer , float at the original string
        System.out.println(str);
        str.insert(0,'h'); // insert the character at the index;
        System.out.println(str);
        str.deleteCharAt(1); // delete the character at the given index;
        System.out.println(str);
        str.reverse(); // simply reverse the string
        System.out.println(str);
        str.delete(0,2); // delete the subsrtring;
        System.out.println(str);

    }
}
