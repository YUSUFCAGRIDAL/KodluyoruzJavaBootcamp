package hafta_02;

import java.sql.ClientInfoStatus;
import java.util.HashMap;
import java.util.Map;

public class Pratik_04_TekrarCift {
    static boolean isFind(int[] arr, int value){
        for (int i : arr) {
            if(i == value){
                return  true;
            }
        }
        return false ;
    }


    public static void main(String[] args) {
        int[] numbers = {2, 1,1, 5, 8, 3, 6, 2, 4, 8, 9, 4, 6, 8, 2, 6};
        int [] duplicate = new int[numbers.length];
        int startIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if((i!=j)&&(numbers[i]==numbers[j])&&(numbers[i]%2==0)){
                    if(!isFind(duplicate, numbers[i])){
                        duplicate[startIndex++]= numbers[i];
                    }
                    break;
                }
            }


        }

        for (int value : duplicate) {
            if(value!=0){
                System.out.println(value);
            }
        }





    }


}
