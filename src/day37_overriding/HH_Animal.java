package day37_overriding;
public class HH_Animal {
    
    public void beslenme() {
        
        System.out.println("tum hayvanlar beslenir..");
        
    }
    protected void tatli() {
        System.out.println("trilece");
    }
    protected String icecek() {
        System.out.println("nigde gazozu");
        return "ohhh";
    }
    
    public Integer topla(){
        return 34+6;
        
    }
    public HH_Animal fatih() {
        
        return new HH_Animal();
    }
    }
