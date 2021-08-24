package day49_Maps;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

import java.util.HashMap;
import java.util.Map;

public class Map04_VeriTabani {

	public static void main(String[] args) {
		
		String dosyaYolu= "C:\\Users\\USER\\Desktop\\CODING\\java\\VeriTabani.csv";
		
		Map<String,String> veriMap = veriTabaniAl(dosyaYolu);
		System.out.println(veriMap);
		
	}

	@SuppressWarnings("resource")
	public static Map<String, String> veriTabaniAl(String dosyaYolu)  {
		
		Map<String,String> eklenecekMap =new HashMap<>();
		
			try {
				BufferedReader br=new BufferedReader(new FileReader(dosyaYolu));
				String satir=br.readLine();
				
				
				while(satir != null) {
					
					String keyValueArr[]=satir.split(";"); // hoca bu soruda "," kulland� zannedersem 
														   // versiyon de�i�ince ay�rma i�lemi ";" olarak de�i�ti
					eklenecekMap.put(keyValueArr[0], keyValueArr[1]);

					satir=br.readLine();
				}				
			} catch ( IOException e) {
				
				e.printStackTrace(); // detayli hata raporu verir
			}
		
		return eklenecekMap;
	}
// GE�M�� OLSUN JAVA B�TT�. �LERLEYEN ZAMANLARDA BU SORUYA BAKARSAN BUGUNLER�N NE KADAR ZORLU VE SIKINTILI GE�T���N� UNUTMA.
// UNUTMA BUNUN ���N �OK �ALI�TIN BUNU BIRAKMA. YOKSA 3 5 KURU�A K�LE G�B� �ALI�TI�IN B�R LAPTOP YAPTIRAMADI�IN G�NLER AKLINA GELS�N.
// HER�EYDEN �CE �NSAN G�B� YA�A...
	}