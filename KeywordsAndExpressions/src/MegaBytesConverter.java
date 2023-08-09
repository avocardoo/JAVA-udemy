public class MegaBytesConverter{
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int remKiloBytes = kiloBytes % 1024;
            int megaBytes = kiloBytes / 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remKiloBytes + " KB" );
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }
}