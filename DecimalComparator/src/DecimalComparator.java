public class DecimalComparator {

    public static void main(String[] args) {

        System.out.println( areEqualByThreeDecimalPlaces(-3.172, -3.1726) );
        System.out.println( areEqualByThreeDecimalPlaces(3.175, 3.176) );

    }

    public static boolean areEqualByThreeDecimalPlaces(double numbOne, double numbTwo){

        boolean areEqual = false;
        int rulesDecimalPlace = 3;

        String textNumbOne = Double.toString(Math.abs(numbOne));
        int lengthNumbOne = textNumbOne.length();
        int intPlaceOne = textNumbOne.indexOf('.');
        int decimalPlacesOne = lengthNumbOne - intPlaceOne - 1;

        String textNumbTwo = Double.toString(Math.abs(numbTwo));
        int lengthNumbTwo = textNumbTwo.length();
        int intPlaceTwo = textNumbTwo.indexOf('.');
        int decimalPlacesTwo = lengthNumbTwo - intPlaceTwo - 1;

        if(decimalPlacesOne < rulesDecimalPlace || decimalPlacesTwo < rulesDecimalPlace ){
            int valueDecimalOne = Integer.parseInt( textNumbOne.substring(intPlaceOne+1, lengthNumbOne ) );
            int valueDecimalTwo = Integer.parseInt( textNumbTwo.substring(intPlaceTwo+1, lengthNumbTwo ) );

            if( valueDecimalOne % 1.1 == valueDecimalOne ){
                decimalPlacesOne = 4;
            }

            if( valueDecimalTwo % 1.1 == valueDecimalTwo ){
                decimalPlacesTwo = 4;
            }

        }


        if( decimalPlacesOne >= rulesDecimalPlace || decimalPlacesTwo >= rulesDecimalPlace ){

            boolean checkEqual = ( (int)(numbOne * Math.pow(10, rulesDecimalPlace)) == (int)(numbTwo * Math.pow(10, rulesDecimalPlace) ) )? true : false;
            if( checkEqual ){
                areEqual = true;
            }
        }

        return areEqual;
    }

}
