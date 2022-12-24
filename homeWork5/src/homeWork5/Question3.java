package homeWork5;


/*
Kullanicidan uslu sayi hesabi icin iki adet integer sayi isteyin. integer donus tipli,
 iki argumanli bir uslu sayi hesaplama methodu olusturun. Argumanlardan birini taban sayisi 
 icin digerini ise ussu icin kullanin. Islemin sonucunu main method’ dan verilen komutla yazdirin.
	*/
	import java.util.Scanner;

	public class Question3 {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Lütfen taban sayısını girin: ");
	    int base = sc.nextInt();
	    System.out.println("Lütfen üs sayısını girin: ");
	    int exponent = sc.nextInt();
	    int result = 1;
	    for (int i = 0; i < exponent; i++) {
	      result *= base;
	    }
	    System.out.println(base + "^" + exponent + " = " + result);
	  }
	}


