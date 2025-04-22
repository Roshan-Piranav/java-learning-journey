
 
import java.util.ArrayList;

public class subset {

    public static void main(String[] args) {
        String p = "";
        String up = "abc";
        subset a = new subset();
        a.sub(p, up);

        System.out.println(a.s);
    }

    ArrayList<String> s = new ArrayList<>();

    void sub(String p, String up) {
        if (up.isEmpty()) {
            s.add(p);
            return;

        }
        sub(p + up.charAt(0), up.substring(1));
        sub(p, up.substring(1));

    }

}

class a {
    int a;
    int c;
    char aa;

}
