package Thread;

public class A extends Thread{
	public void run() {
		for (int i =0;i<=6;i++) {
		System.out.println("number=" +i);
	}
	}

public class B extends Thread{
	public void run() {
		for (int i =2;i<=12;i++) {
			System.out.println("BS-"+i);
		}
	}
}
public static void main(String[]args) {
	A a = new A();
	A.B b=a.new B();
	a.start();
	b.start();
}
}