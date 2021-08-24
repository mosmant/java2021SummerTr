package day37_overriding;
public class HH_Dog extends HH_Animal {
    
    @Override //Annotation -->mutlaka childe yazilir parent ve child metodlarında iliski kurar
    public  void beslenme() {
        System.out.println("kemik ile beslenir");
    }
    @Override
    public void tatli() {
        System.out.println("fistik sarma");
    }
    @Override
    protected String icecek() {
        System.out.println("tursu suyu");
        return "yarasin";
    }
    @Override
    public Integer  topla() {
        return 41+54;
        
    }
    @Override
    public HH_Dog fatih() {
        
        return new HH_Dog();
}}