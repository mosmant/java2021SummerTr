package day31_varargs;

public class C04_Varargs04 {

	public static void main(String[] args) {
		int arr[]= {1,3,5,7,9};
		
		System.out.println(arrTopla(arr));
		System.out.println(varargsTopla(1,3,5,7,9));
		System.out.println(varargsTopla(arr)); // burada varargs�n array parametreli toplam�...
	// varargs array gibi davrand��� i�in herhangibir arrayi parametre olarak alabilir.
	}
	// Varargs elemanlar�n� toplayan method
	private static int varargsTopla(int... i) {
		int topla=0;
		for (int each : i) {
			topla +=each;
		}
		return topla;
	}
	// Array elementlerini toplayan method
	private static int arrTopla(int[] arr) {
		int toplam = 0;
		for (int each : arr) {
			toplam +=each;			
		}
	return toplam ;	
	}
	
	

}
