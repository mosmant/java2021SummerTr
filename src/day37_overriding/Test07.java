package day37_overriding;

class Super {
	public Integer getLength() {
		return new Integer(4);
	}
}

public class Test07 extends Super {
	public Integer getLength() {
		return (5);
	}

	public static void main(String[] args) {
		Super sooper = new Super();
		Test07 sub = new Test07();
		System.out.println(sooper.getLength().toString() + ", " + sub.getLength().toString());
		
		// sooper.getLength().toString() sooper objesi getLength() methodunu �a��rm��. 
		// toString methodu ise value de�er getiriyor. ==>Integer wrapper clas�nda b�yle bir�ey g�rmedik.ctrl+ mouse cursoru ile 
		// open declaration yap�ld���nda g�steriyor.
	}
}