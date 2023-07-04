package hafta_01;

import java.util.Scanner;

/*
Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
 */
public class Pratik_05_Daire {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;

        Scanner scan = new Scanner(System.in);
        r= scan.nextInt();
        double alan = pi*r*r;
        double cevre =2*pi*r;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);


        scan.close();



    }


}
