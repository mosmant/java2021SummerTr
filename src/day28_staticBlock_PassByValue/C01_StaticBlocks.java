package day28_staticBlock_PassByValue;

public class C01_StaticBlocks {
	
	static int sayi =10;
	
	static {  // static block her�eyden �nce �al���r. MA�N METHODDAN B�LE �NCE �ALI�IR.
		System.out.println("1. static block �al��t�");
		sayi=20;
	}
	static {  //static block LAR YUKARIDAN A�A�I DO�RU �ALI�IR.
		System.out.println("1,5. static block �al��t�");
		sayi=25;
	}
	static {  // static block LAR YUKARIDAN A�A�I DO�RU �ALI�IR.
		System.out.println("2. static block �al��t�");
		sayi=30;
	}
	public static void main(String[] args) {
		
		System.out.println("main methodun ilk sat�r�nda sayi : "+ sayi);  // output 10,20,25,30,1000

	}
	static {  // static block LAR YUKARIDAN A�A�I DO�RU �ALI�IR.
		System.out.println("main methodun alt�ndaki static block �al��t�");
		sayi=1000;
	}

}
