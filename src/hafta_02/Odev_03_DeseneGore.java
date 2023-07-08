package hafta_02;

import java.util.Scanner;

/*
Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

Senaryolar
N Sayısı : 16
Çıktısı : 16 11 6 1 -4 1 6 11 16

 */
public class Odev_03_DeseneGore {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int n = scan.nextInt();

        recursiveMetot(n);
    }

    public static void recursiveMetot(int n) {
        System.out.print(n + " ");
        if (n <= 0) {
            return;
        } else {
            recursiveMetot(n - 5);
        }
        System.out.print(n + " ");
    }


}

