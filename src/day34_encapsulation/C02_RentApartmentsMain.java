package day34_encapsulation;

import java.util.Scanner;

public class C02_RentApartmentsMain {
	/* 
    Burada iki adet class vardýr. 
    Biri Main diðeri ise rentApartments rentApartments'ýn içinde;
    Bu variable'larý private olarak oluþturun;
    String name
    int roomCount
    boolean balconyOrNo
    Bütün variable'lar için getter ve setter oluþturunuz.
    4 farklý Apartment(apartman dairesi) vardýr. 0, 1, 2, 3 rooms(odalý)
    -----------------------------------------------------------------
    Bir method oluþturun;
    Eðer room sayýsý 0 ise,
    rent(kira) 1400
    Eðer oda sayýsý 1 ise,
    rent  1700
    Eðer oda sayýsý 2 ise,
    rent 2200
    Eðer oda sayýsý 3 ise,
    rent 2700
    rent'i return'leyin.
    ----------------------------------------------------------------
    Bir method oluþturun.
    Eðer balconyOrNo  true ise,
    rent'e 200 dollar ekleyin.
    Main class'ýn içinde;
    userName rent is amountOfRent
    */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
        System.out.print("adinizi giriniz : ");
        String name =scan.nextLine();
        
        System.out.print("dairenizde talep ettiginiz oda sayisini giriniz :  ");      
        int odaSayisi =scan.nextInt();
        
        System.out.print("balkon tercihinizi  giriniz (true/false) : ");      
        boolean balcony =scan.nextBoolean();
        
        C01_RentApatments kiraci =new C01_RentApatments();
        
        kiraci.setName(name);
        kiraci.setBalconyOrNo(balcony);
        kiraci.setRoomCount(odaSayisi);
        
        
        
        int toplamKira=kiraci.balkonSor(balcony)+kiraci.kiraHesapla(odaSayisi);
        
        System.out.println(kiraci.getName()+" bey  kira ucretiniz :"+toplamKira);
		

	}

}
