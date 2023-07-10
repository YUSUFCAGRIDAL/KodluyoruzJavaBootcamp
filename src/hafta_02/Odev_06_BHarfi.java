package hafta_02;

public class Odev_06_BHarfi {
    public static void main(String[] args) {
        int size = 5;
        char[][] pattern = new char[size][size];

        // Boşlukları doldurma
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                pattern[i][j] = ' ';
            }
        }

        // Yıldızları ekleme
        for (int i = 0; i < size; i++) {
            pattern[i][0] = '*';
            pattern[i][size - 1] = '*';
        }

        for (int i = 0; i < size / 2 + 1; i++) {
            pattern[i][size / 2] = '*';
            pattern[size - 1][size / 2 + i] = '*';
        }

        // Harfi ekrana yazdırma
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
    }
}
