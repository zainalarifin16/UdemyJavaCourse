public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(1024);
        printMegaBytesAndKiloBytes(1048);
        printMegaBytesAndKiloBytes(2050);
        printMegaBytesAndKiloBytes(3500);


    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes > 0){

            int calcMegaBytes = kiloBytes / 1024;

            int remainMegaBytes = kiloBytes % 1024;

            System.out.println(kiloBytes+" KB = "+calcMegaBytes+" MB and "+remainMegaBytes+" KB");

        }else{
            System.out.println("Invalid Value");
        }

    }

}
