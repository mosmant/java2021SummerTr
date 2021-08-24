package day36_inharitance_overriding;

public class HH_Animal {
	
	public void mA() {
		System.out.println("animal");
	}
	public void mM() {
		System.out.println("animal"+"mammal");
	}
	public int a=7;
	public int m;
	
	public HH_Animal() {
		System.out.println("parametresiz Animal constructor.");
	}
	public HH_Animal(int a) {
		System.out.println("int parametreli Animal constructor.");
	}
	
	
	
}
