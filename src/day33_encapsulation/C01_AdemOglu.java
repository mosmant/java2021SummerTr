package day33_encapsulation;
public class C01_AdemOglu {
    
    String name;
    String surName;
    private int age;//encap için veriyi private yaptik
    
    
    public static void main(String[] args) {
        
    }
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age>0) {
            this.age = age;
        } else this.age = -age;
        
    }
    
    
}