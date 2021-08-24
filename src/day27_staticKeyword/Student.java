package day27_staticKeyword;

public class Student {

	int number;
	String name;
	static String college = "ITS";

	Student(int r, String n, String college) {

		this.number = r;
		this.name = n;
		this.college = college;
	}

	public static void main(String[] args) {

		Student s1 = new Student(111, "Karan", "MIT");
		Student s2 = new Student(222, "Aryan", "Harvard");

		System.out.println(s1.number); // output 111 instance variable atamasý yapýldý. 
		System.out.println(s2.number); // output 222 her yeni obje tanýmlandýðýnda ins. 
									   //variable ilk atanan deðere eþit olur. yeni atamasý 111'dir

		System.out.println(s1.name); // output Karan instance variable atamasý yapýldý.
		System.out.println(s2.name); // output 222 her yeni obje tanýmlandýðýnda 
									 // ins. variable ilk atanan deðere eþit olur.yeni atama sonrasý deðer Aryan'dýr
 
		System.out.println(s1.college); // output Harvard
		System.out.println(s2.college); // output Harvard
										// static variable olduðu için her yeni atanan variable son atanan deðere eþit olur 
										 
	}
}
