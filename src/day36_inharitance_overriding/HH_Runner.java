package day36_inharitance_overriding;

public class HH_Runner {

	public static void main(String[] args) {
		HH_Cat c1 = new HH_Cat();   // parametresiz cat classýndan bir c1 objesi oluþturdum HH_Cat data type
		//  Ayný isimli variable lar obje.call edilirken önce objenin kendi variable ýndan call edilir
		// yoksa veya sonra parentinden getirilir.
		
		
		
		System.out.println(c1.a);	// 7 animal clasýndan
		System.out.println(c1.c);   // 9 kendi (cat) classýndan
		System.out.println(c1.d);	// 5 kendi (cat) classýndan
		System.out.println(c1.m);	// 4 mammal clasýndan 
		
		// variable lar geldi.
		
		c1.mM();	//animalmammal	 ====> animal clasýndan
		c1.mA();	//mammal		 ====> mammal clasýndan
		c1.mC();	//cat			 ====> cat clasýndan
		
		// method call edilirken ayný isimli methodlarýn alýnacaðýný constructor karar verir.
		// childden parente doðru hiyerarþi yapýlýr. babadan dedeye ilk kimde bulursa onu alýr.
		
		HH_Mammal c2 = new HH_Cat("s"); // c2 objesinin kendi classý mamaldýr. variable a bakarken parent a bakarýz. child class a bakmayýz.
		System.out.println(c2.a); // 7 ==> animal class
		System.out.println(c2.c); // 7 ==> animal class
		//System.out.println(c2.d);  // variable call edilirken data type ýna bakýlýr. mammal data typeý cat in parent idir.
		System.out.println(c2.m); // 4 ==> mammal clasýndan
		
		c2.mA(); //mammal  mammal cons--> call
        c2.mC(); //cat  cat cons-->call
        c2.mM(); // animal mammal  animal cons-->call
        
    
        HH_Mammal m1=new HH_Mammal();
        HH_Animal c3=new HH_Cat();
        //m1 ve c3 obj uzerinden veriable ve method call???
		
		
		
	}
}
