package hafta_02;

import java.util.Arrays;

public class Odev_04_EnYakin {
    public static void main(String[] args) {
        int[] numbers = {15, 12, 788, 1, -1, -778, 2, 0};
        int targetNumber = 5;

        Arrays.sort(numbers); // Diziyi küçükten büyüğe sırala

        int smallerNumber = Integer.MIN_VALUE;
        int largerNumber = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < targetNumber) {
                smallerNumber = numbers[i];
            } else if (numbers[i] > targetNumber) {
                largerNumber = numbers[i];
                break; // En yakın büyük sayıyı bulduktan sonra döngüyü sonlandır
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + smallerNumber);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + largerNumber);




    }
}
