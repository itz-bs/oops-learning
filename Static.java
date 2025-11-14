package oops;

class student1 {
	static int mark=0;
	
}

public class Static {
	public static void main(String []args) {
		student1 s1=new student1();
		s1.mark=70;
		student1 s2=new student1 ();
		s2.mark=90;
	
		System.out.println(s1.mark);
		System.out.println(s2.mark);
	}
}

	    