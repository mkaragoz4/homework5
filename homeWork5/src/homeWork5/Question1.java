package homeWork5;

import java.util.Scanner;

public class Question1 {
	
	public static void main (String[]args) {
		
		/*
		 * Kullanicidan e mail hesabini girmesini isteyiniz. Bu e mail’ i
		 * olusturacaginiz method' a arguman olarak gonderip asagidaki kurallara gore e
		 * mail kontrolu yapiniz. -@ isareti icermiyorsa “gecersiz email” yazdirin
		 * -@gmail icermiyorsa “lutfen gmail adresinizi girin” yazdirin -@gmail.com ile
		 * bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz” yazdirin.
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen mailinizi giriniz:");
		String mail=scan.nextLine();
		
		if (!mail.contains("@")){
			System.out.println("geçersiz email");
		}
			else if (!mail.contains("@gmail"))
				System.out.println("lütfen gmail adresinizi girin");
			
			else if (!mail.contains("@gmail.com")){
				System.out.println("Yazımda bir sorun var maili kontrol ediniz");
			}
			else {
				System.out.println("başarılı");
			}
		
	}

}
