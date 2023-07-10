package hafta_02;

import java.util.Scanner;

public class Pratik_03_Tasks {

    public static void main(String[] args) {

        //Matris boyutunu sizin belirlediğiniz matris değerlerini ise kullanıcının girdiği bir algoritma yazınız.

        int matrix [][] = new int[3][4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter "+matrix.length+" rows and "+matrix[0].length+" columns: ");

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        input.close();

        //stediğiniz boyutta matris oluşturarak matris değerlerine 0-99 arası random sayılar üreterek matrise atama yapınız.
        int[][] matrix1 = new int[3][4];
        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1[row].length; column++) {
                matrix1[row][column] = (int) (Math.random() * 100);
            }
        }

    }
}
