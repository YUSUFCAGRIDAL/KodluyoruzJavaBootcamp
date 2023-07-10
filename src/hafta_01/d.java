package hafta_01;

public class d {

    public static void main(String[] args) {
        int number = 16;
        hesap(number);
    }

    public static void hesap(int number) {
        if (number <= 0) {
            System.out.print(number + " "); //-4
            return;
        }

        System.out.print(number + " "); //16  11  6   1
        hesap(number - 5);
        System.out.print(number + " "); // 1 6 11 16
    }
}
