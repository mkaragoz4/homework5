package homeWork5;

/*
Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini soyleyin. 
Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve girdigi pozitif sayilarin toplaminin 
kac oldugunu yazdirin.(do while dongusu ile)
*/


import java.util.Scanner;

public class Question7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int count = 0;
    int number;
    do {
      System.out.println("Lütfen pozitif bir sayı girin (0 giriniz islemi bitirin): ");
      number = sc.nextInt();
      if (number > 0) {
        sum += number;
        count++;
      }
    } while (number != 0);
    System.out.println("Toplam " + count + " pozitif sayı girdiniz ve girdiğiniz pozitif sayıların toplamı: " + sum);
  }
}



