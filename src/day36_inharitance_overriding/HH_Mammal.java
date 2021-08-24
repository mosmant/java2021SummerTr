package day36_inharitance_overriding;

public class HH_Mammal extends HH_Animal{ // parent child relationship 
	
	public void mA() {
		System.out.println("mammal");
	}
	public void mC() {
		System.out.println("mammal"+"cat");
	}
	
	int c=7;
	int m=4;
	
	public HH_Mammal() {
		this('A'); //parametresiz constructor kendi class'ýndaki parametreli constructor'ý call etsin.
		System.out.println("parametresiz mammal constructor.");
	}
	public HH_Mammal(char m) {
		super(34); // parenttan ***parametreli*** constructor call yaptýk.
		System.out.println("char parametreli mammal constructor.");
		
	}
	
	
	
		
}
