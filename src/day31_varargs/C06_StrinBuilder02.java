package day31_varargs;

public class C06_StrinBuilder02 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder(); // bo� bir sb1(StringBuilder) create ettik.
		
		// StringBuilder a eleman ekleme;  obj.append(obj);
		
		sb1.append("faruk");
		
		System.out.println("ilk hali : "+sb1); // output : ilk hali : faruk
		
		sb1.append(" efehan");
		
		System.out.println("son hali : "+sb1); // output : son hali : faruk efehan
		
		// StringBuilder�n uzunlu�u;  obj.lenght();
		
		System.out.println("sb1 uzunluk : "+ sb1.length()); // output : sb1 uzunluk : 12
		
		// StringBuilder�n kapasitesi;  obj.capacity(); 
		//bizim yazaca��m�z bo�luk alan. 16 ile ba�l�yor bitince bir 16 daha veriyor
		
		System.out.println("sb1 kapasitesi : "+ sb1.capacity()); // sb1 kapasitesi : 16
		
		sb1.append(" g�zel insan");
		
		System.out.println("sb1 kapasitesi : "+ sb1.capacity()); // sb1 kapasitesi : 34 default alarak atad�.
		
		
		
		
	}

}
