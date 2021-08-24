package day36_inharitance_overriding;

public class HH_Cat extends HH_Mammal{
	
	public void mC() {
		System.out.println("cat");
	}
	int c=9; // parenti ile ayný variable 
	int d=5;
	
	public HH_Cat() {
		System.out.println("parametresiz cat constructor.");
	}
	public HH_Cat(String s) {
		this();
		System.out.println(super.c);
		System.out.println("parametreli cat constructor.");	
	}
	
	
	

		
}
	
		