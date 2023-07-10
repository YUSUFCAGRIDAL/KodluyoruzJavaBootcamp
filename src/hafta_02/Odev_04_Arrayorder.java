package hafta_02;

import java.util.Scanner;

public class Odev_04_Arrayorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dizinin boyutunu kullanıcıdan al
        System.out.print("Dizinin boyutunu girin: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Dizinin elemanlarını kullanıcıdan al
        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < size; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Diziyi küçükten büyüğe sıralama
        sortArray(array);

        // Sıralanmış diziyi ekrana yazdırma
        System.out.println("Dizinin küçükten büyüğe sıralanmış hali:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    public static void sortArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Elemanları yer değiştirme
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}

