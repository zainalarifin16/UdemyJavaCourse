public class PlayingCat {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,10));
        System.out.println(isCatPlaying(true,35));

    }

    public static boolean isCatPlaying(boolean summer, int temperature){

        boolean resultCatPlaying = false;

        if(summer){
            if(temperature >= 25 && temperature <= 45){
                resultCatPlaying = true;
            }
        }else{
            if(temperature >= 25 && temperature <= 35){
                resultCatPlaying = true;
            }
        }

        return resultCatPlaying;

    }

}
