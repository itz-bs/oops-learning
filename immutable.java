package string;

public class immutable {
	    public static void main(String[] args) {
	        String s = " Hello Java ";

	        System.out.println(s.concat("World"));

	        String b = s.toUpperCase();
	        System.out.println(b);

	        String c = s.toLowerCase();
	        System.out.println(c);

	        String d = s.replace("Java", "World");
	        System.out.println(d);

	        int e = s.indexOf("Java");
	        System.out.println(e);

	        boolean f = s.startsWith(" Hello");
	        System.out.println(f);

	        String g = s.substring(1, 6);
	        System.out.println(g);
	    }
	}


