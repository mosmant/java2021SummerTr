package day27_staticKeyword;

public class Squares {

	public static long square(int x) {

		long y = x * (long) x;

		x = 1;

		return y;

	}

	public static void main(String[] args) {

		int value = 9;
		long result = square(value);
		System.out.println(value);

	}

	// A -1
	// B 9
	// C 81
	// D Compile error on line 9
	// E Compile error on Different line
	
	// output : 9 dur. burada soruda syso(value) dedi�i i�in cevap value de�erini yazd�r�r. di�er methodlar �al���r.
	// syso(result) olsayd� sonuc square(value)methodunda return y oldu�u i�in long y = 9*9 =81 'dir.
	
}
