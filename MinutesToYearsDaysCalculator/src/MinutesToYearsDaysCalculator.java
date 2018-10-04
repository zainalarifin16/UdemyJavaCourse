public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static final String ERROR_MSG = "Invalid Value";

    public static void printYearsAndDays(long minutes){

        if(minutes < 0){
            System.out.println(ERROR_MSG);
        }else{
            long hours = minutes / 60;
            int days = (int) hours / 24;
            int remainingDays = (int) days % 365;
            int years = (int) days / 365;

            System.out.println(minutes+" min = "+years+" y and "+remainingDays+" d");
        }

    }

}
