package homeWork5;

import java.util.Scanner;

public class Question4 {
	/*
	 * Kullanıcıdan aldıgınız 5 basamaklı sayının rakamlarının toplamını yazdıran
	 * programi for döngüsü ile yazınız.
	 */
	
	public static void main(String[]args) {
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bes basamakli sayi giriniz");
		int sayı=scan.nextInt();
		
		int rakamlartoplamı=0;  // Rakamların toplamını tutacağımız değişken
		
		for (int i=0; i<5; i++) {
			int basamak=sayı%10;  
			sayı /=10;   
			rakamlartoplamı += basamak;  
		}
		
		System.out.println("Rakamların toplamı=" + rakamlartoplamı+ "dir");
		
	}
	
	
	
	
	
	
	

}
