package homeWork5;

import java.util.Scanner;
/*
Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane 
olduklarini ekranda yazdirin.(while dongusu ile)

*/

public class Question6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Lütfen bir sayı girin: ");
    int number = sc.nextInt();
    int divisor = 1;
    int count = 0;
    while (divisor <= number) {
      if (number % divisor == 0) {
        System.out.println(divisor);
        count++;
      }
      divisor++;
    }
    System.out.println("Tam bölenlerin toplam sayısı: " + count);
  }
}
