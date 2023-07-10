package hafta_02;

public class MaxMin {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int min = list[0];
        int max = list[0];

        for (int each : list) {
            if(each<min){
                min=each;
            }
            if(each>max){
                max=each;
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
