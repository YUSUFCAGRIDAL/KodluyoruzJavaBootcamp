package hafta_01;

import java.util.Scanner;

/*
Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
 */
public class Pratik_04_Taksimetre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Km giriniz");
        int km = scan.nextInt();
        double tutar = (km*2.20) + 10;

        if(tutar<20){
            System.out.println("Ödenecek tutar 20 TL dir");
        }else {
            System.out.println( "Ödenecek tutar "+tutar+" TL dir");
        }



    }
}
