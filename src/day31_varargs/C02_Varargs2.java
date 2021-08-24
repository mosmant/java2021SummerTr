package day31_varargs;

public class C02_Varargs2 {

	public static void main(String[] args) {
		// Varargs kullanarak verilen Stringleri birlestiren concat isimli bir method olusturunuz
		
		concat("m","e","r","v","e");

	}

	private static void concat(String ... string) {  // burada metod oluþtrudum parantezlerin içi çok fazla oldu.
											// vararags yaparak azalttým 
		String s = "";
		
		for (String each : string) {
			s = s.concat(each);
			
		}
		System.out.println(s);
	}

}
