package hafta_02;

import java.util.Scanner;

public class LetterCapitalize {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(LetterCapitalize(s.nextLine()));
    }
    public static String LetterCapitalize(String str) {
        // code goes here
        String result=Character.toUpperCase(str.charAt(0))+"";


        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==' '){
                result+=" "+Character.toUpperCase(str.charAt(++i));
            }

            result+=str.charAt(i)+"";
        }

        return result;
    }
}
