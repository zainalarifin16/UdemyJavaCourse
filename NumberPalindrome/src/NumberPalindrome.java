public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));



    }

    public static boolean isPalindrome(int numbPalindrome){

        boolean resultPalindrome = false;
        numbPalindrome = Math.abs(numbPalindrome);

        int lastNumber = numbPalindrome % 10;
        int reverse = 1;
        while(true){
            if( numbPalindrome % (reverse*10) == numbPalindrome ){
                break;
            }
            reverse++;
        }

        return resultPalindrome;

    }

}
