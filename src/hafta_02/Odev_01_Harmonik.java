package hafta_02;

import java.util.Scanner;

public class Odev_01_Harmonik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();

        double[] numbers = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            numbers[i] = input.nextDouble();
        }

        double harmonicSum = 0.0;
        for (int i = 0; i < n; i++) {
            harmonicSum += 1.0 / numbers[i];
        }

        double harmonicMean = n / harmonicSum;

        System.out.println("Harmonik Ortalama: " + harmonicMean);

        input.close();
    }
}
