import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestParaBankJB {

    public static void main(String[] args) throws FileNotFoundException {
        File plikZOperacjami = new File("C:\\Users\\Student\\Desktop\\Nowy folder\\NowaBankowaAplikacja\\src\\main\\java\\pk.txt");
        Scanner scanner2 = new Scanner(plikZOperacjami);
        new Bank().zrobOperacje(scanner2);
    }
}