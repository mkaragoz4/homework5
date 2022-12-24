package homeWork5;

/*
Kullanicidan toplamak icin sayi isteyin ve sayilarin toplami 500’e ulasincaya kadar sayi 
istemeye devam edin. Toplam 500’e ulastiginda veya gectiginde sayilarin toplami ve kac sayi
 girildigini yazdirin.(do while dongusu ile)
*/

import java.util.Scanner;

public class Question8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int count = 0;
    int number;
    do {
      System.out.println("Lütfen bir sayı girin: ");
      number = sc.nextInt();
      sum += number;
      count++;
    } while (sum < 500);
    System.out.println("Toplam " + count + " sayı girdiniz ve girdiğiniz sayıların toplamı: " + sum);
  }
}



