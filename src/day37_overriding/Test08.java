package day37_overriding;

public class Test08 {

	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		y.m2(); 
		x.m1(); 
		y.m1(); 
		x=y;		// burada art�k x y gibi davran�yor m1 methodu overriden oluyor.
		x.m1(); 	//	m1, Y class
	}}

	class X{
		public void m1() {
			System.out.println("m1, X class");
		}
	}
	class Y extends X{
		public void m1() {
			System.out.println("m1, Y class");
		}
		public void m2() {
			System.out.println("m2, Y class");
		}}