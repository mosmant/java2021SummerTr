package day33_encapsulation;
public class C02_InsanMain {
    public static void main(String[] args) {
        
    
    
    C01_AdemOglu insan1= new C01_AdemOglu(); //ademoglundan insan1 obj creat ettim
    //insan1.age=-47; age private olg için erişim engeli var hata verdi.
    insan1.name="onur";
    insan1.surName="enes";
    insan1.setAge(-34);
    System.out.println(insan1.name);//onur
    System.out.println(insan1.surName);//enes
    System.out.println(insan1.getAge());//34
    
    
    
    }
}