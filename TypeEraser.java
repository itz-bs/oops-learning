package generic;
import java.util.*;

public class TypeEraser {
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        
        name.add("Hello");
        name.add("Welcome");

        String first = name.get(0);
        System.out.println("Name: " + first);
    }
}