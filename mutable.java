package string;

public class mutable {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");
        System.out.println(sb);

        sb.insert(4, " Language");
        System.out.println(sb);

        sb.delete(4, 13);
        System.out.println(sb);

        sb.replace(5, 16, "Code");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        int len = sb.length();
        System.out.println(len);

        char ch = sb.charAt(2);
        System.out.println(ch);

        sb.setCharAt(0, 'j');
        System.out.println(sb);
    }
}

