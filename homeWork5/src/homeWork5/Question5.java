package homeWork5;
/*
Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis 
degeri dahil aradalarindaki tum cift tamsayilari while loop kullanarak ekrana yazdiriniz.
*/

import java.util.Scanner;

public class Question5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Lütfen başlangıç değerini girin: ");
    int start = sc.nextInt();
    System.out.println("Lütfen bitiş değerini girin: ");
    int end = sc.nextInt();
    int number = start;
    while (number <= end) {
      if (number % 2 == 0) {
        System.out.println(number);
      }
      number++;
    }
  }
}



