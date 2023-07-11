package hafta_02;

public class Palindromik {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));


    }

    static boolean isPalindrome(String str){
        String palindrome = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            palindrome += str.charAt(i)+"";
        }
        if(palindrome.equals(str)){
            return true;
        }
        return false;

    }
}
