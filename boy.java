package string;
import java.lang.reflect.Method;

class Stu {
    public void display() {
        System.out.println("Hello");
    }
}

public class boy  {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("string.Stu");
            Object obj = cls.getDeclaredConstructor().newInstance();
            Method method = cls.getMethod("display");
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

