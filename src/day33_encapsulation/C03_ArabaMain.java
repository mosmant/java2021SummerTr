package day33_encapsulation;
public class C03_ArabaMain {//4. step class
    
    
    public static void main(String[] args) {
        //5. step 8-9-10. satirlar
        C04_Araba volvo=new C04_Araba("xc90", "beyaz", -2400, -2020);
        C04_Araba audi=new C04_Araba("Q7", "bej", -3000, -2021);
        C04_Araba honda=new C04_Araba();//defalut parametresiz cons var iken
    
    honda.model="civic";
    honda.renk="gri";
    honda.setYil(1999);
    honda.setMotor(1400);
    System.out.println("honda yil :" +honda.getYil());
    System.out.println("honda motor : "+honda.getMotor());
    System.out.println("volvo motor : "+volvo.getMotor()); //2400
    System.out.println("audi yil : "+audi.getYil());//2021
    
    }
    
}