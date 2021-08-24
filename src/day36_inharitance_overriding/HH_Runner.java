package day36_inharitance_overriding;

public class HH_Runner {

	public static void main(String[] args) {
		HH_Cat c1 = new HH_Cat();   // parametresiz cat class�ndan bir c1 objesi olu�turdum HH_Cat data type
		//  Ayn� isimli variable lar obje.call edilirken �nce objenin kendi variable �ndan call edilir
		// yoksa veya sonra parentinden getirilir.
		
		
		
		System.out.println(c1.a);	// 7 animal clas�ndan
		System.out.println(c1.c);   // 9 kendi (cat) class�ndan
		System.out.println(c1.d);	// 5 kendi (cat) class�ndan
		System.out.println(c1.m);	// 4 mammal clas�ndan 
		
		// variable lar geldi.
		
		c1.mM();	//animalmammal	 ====> animal clas�ndan
		c1.mA();	//mammal		 ====> mammal clas�ndan
		c1.mC();	//cat			 ====> cat clas�ndan
		
		// method call edilirken ayn� isimli methodlar�n al�naca��n� constructor karar verir.
		// childden parente do�ru hiyerar�i yap�l�r. babadan dedeye ilk kimde bulursa onu al�r.
		
		HH_Mammal c2 = new HH_Cat("s"); // c2 objesinin kendi class� mamald�r. variable a bakarken parent a bakar�z. child class a bakmay�z.
		System.out.println(c2.a); // 7 ==> animal class
		System.out.println(c2.c); // 7 ==> animal class
		//System.out.println(c2.d);  // variable call edilirken data type �na bak�l�r. mammal data type� cat in parent idir.
		System.out.println(c2.m); // 4 ==> mammal clas�ndan
		
		c2.mA(); //mammal  mammal cons--> call
        c2.mC(); //cat  cat cons-->call
        c2.mM(); // animal mammal  animal cons-->call
        
    
        HH_Mammal m1=new HH_Mammal();
        HH_Animal c3=new HH_Cat();
        //m1 ve c3 obj uzerinden veriable ve method call???
		
		
		
	}
}
