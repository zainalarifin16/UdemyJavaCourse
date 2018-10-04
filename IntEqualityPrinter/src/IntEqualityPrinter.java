public class IntEqualityPrinter {

    public static void main(String[] args) {
        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);
    }

    public static void printEqual(int numbOne, int numbTwo, int numbThree){

        if(numbOne < 0 || numbTwo < 0 || numbThree < 0){
            System.out.println("Invalid Value");
        }else{

            boolean compareOne = (numbOne == numbTwo);
            boolean compareTwo = (numbTwo == numbThree);
            boolean compareThree = (numbOne == numbThree);

            if( compareOne && compareTwo && compareThree ){
                System.out.println("All numbers are equal");
            }else{
                if( !compareOne && !compareTwo && !compareThree ){
                    System.out.println("All numbers are different");
                }else{
                    System.out.println("Neither all are equal or different");
                }
            }

        }

    }

}
