package hafta_02;

import java.util.Arrays;

/*
Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.

Senaryo
Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
Tekrar Sayıları
10 sayısı 3 kere tekrar edildi.
20 sayısı 4 kere tekrar edildi.
5 sayısı 1 kere tekrar edildi.
 */
public class Odev_07_ArrayCount {
    public static void main(String[] args) {
        /*int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        for(int j = 0 ; j < list.length ; j++){
            int count = 0;
            boolean isCount = false;

            for (int k = j-1 ; k >= 0 ; --k){
                if(list[k]==list[j]){
                    isCount = true;
                    break;
                }
            }

            if(!isCount){
                for(int i = 0 ; i < list.length ; i++){
                    if (list[j] == list[i]) count++;
                }
            }


            if(count >= 1)System.out.println("Number of repeats of "+list[j]+" :"+count);
        }*/ //başka bir çözüm bu

        // Dizi tanımlama
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] frequency = new int[dizi.length];
        Arrays.fill(frequency, -1);// frequency dizisindeki tüm elemanları -1 değeriyle doldurur.

        // Elemanların frekanslarını hesapla
        for (int i = 0; i < dizi.length; i++) {

            int counter = 1;

            for (int j = i + 1; j < dizi.length; j++) {

                if (dizi[i] == dizi[j]) {
                    frequency[j] = 0;
                    counter++;

                }
            }
            if (frequency[i] != 0) {

                frequency[i] = counter;

            }

        }
        System.out.println("Dizideki elemanların frekansları:");
        for (int i = 0; i < frequency.length; i++) {

            if (frequency[i] != 0) {

                System.out.println(dizi[i] + " sayısı " + frequency[i] + " kere tekrar edildi.");

            }
        }



    }
}
