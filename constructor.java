package oops;
class student{
	int id=0 ;
	String name=" " ;
	student(int Id, String n){
		id=Id;
		name= n;
	}	
	student(student s1){
		id=s1.id;
		name= s1.name;
	}
	void display() {
		System.out.println("ID: "+id);
		System.out.println("NAME: "+name);
	}
}
// Copy Constructor
public class constructor {
	public static void main(String[]args) {
		student s1= new student(101,"bs");
		student s2= new student(s1);
		s1.display();
		s2.display();
	}

}
