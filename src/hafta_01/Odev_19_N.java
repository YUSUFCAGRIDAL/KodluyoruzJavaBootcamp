package hafta_01;

import java.util.Scanner;

/*
Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

Senaryo
Kaç tane sayı gireceksiniz: 4
1. Sayıyı giriniz: 16
2. Sayıyı giriniz: -22
3. Sayıyı giriniz: -15
4. Sayıyı giriniz: 100
En büyük sayı: 100
En küçük sayı: -22
 */
public class Odev_19_N {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç sayı gireceksiniz");
        int n = scan.nextInt();
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.println(i+". Sayıyı giriniz: ");
            int sayi = scan.nextInt();

            if(sayi>max){
                max=sayi;
            }
            if(sayi<min){
                min=sayi;
            }
        }
        System.out.println("En büyük sayı: "+max);
        System.out.println("En küçük sayı: "+min);


        scan.close();
    }
}
