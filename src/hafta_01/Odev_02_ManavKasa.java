package hafta_01;
/*
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı;

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL
 */


import java.util.Scanner;

public class Odev_02_ManavKasa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? :");
        int armutKg = scan.nextInt();
        System.out.println("Elma Kaç Kilo ? :");
        int elmaKg = scan.nextInt();
        System.out.println("Domates Kaç Kilo ? :");
        int domatesKg = scan.nextInt();
        System.out.println("Muz Kaç Kilo ? :");
        int muzKg = scan.nextInt();
        System.out.println("Patlıcan Kaç Kilo ? :");
        int patlıcanKg = scan.nextInt();
        System.out.println("Toplam Tutar :"+(armutKg*2.14+elmaKg*3.67+domatesKg*1.11+muzKg*0.95+patlıcanKg*5.00));



        scan.close();


    }
}
