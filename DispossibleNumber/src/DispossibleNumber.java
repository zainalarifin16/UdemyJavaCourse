import java.util.Scanner;

public class DispossibleNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int loopCase = s.nextInt();

        int caseDivisible[][] = new int[loopCase][3];
        int printResult = 0;

        while( printResult < loopCase ){

            caseDivisible[printResult][0] = s.nextInt(); //inputA
            caseDivisible[printResult][1] = s.nextInt(); //inputB
            caseDivisible[printResult][2] = s.nextInt(); //inputK

            printResult = printResult + 1;
        }

        printResult = 0;
        while( printResult < loopCase ){

            System.out.println("Case "+(printResult+1)+": "+divisible( caseDivisible[printResult][0], caseDivisible[printResult][1], caseDivisible[printResult][2] ));
            printResult = printResult + 1;

        }
    }


    public static int divisible(int A, int B, int K){

        int i = A;
        int resultDivisible = 0;
        int runProcess = 1;
        while(runProcess == 1){

            if( i <= B ){
                if(i % K == 0){
                    resultDivisible = resultDivisible + 1;

                }

                i = i + 1;
            }else{
                runProcess = 0;
            }

        }

        return resultDivisible;

    }

}
