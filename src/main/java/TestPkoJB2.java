import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestPkoJB2 {

    public static void main(String[] args) throws FileNotFoundException {
       //Scanner scanner = new Scanner("2000\n5\n"); //<---czyta  dane z nawiasów  linię string ("2000\n5\n");
        File plikzOperacjami = new File("C:\\Users\\Student\\Desktop\\Nowy folder\\NowaBankowaAplikacja\\src\\main\\java\\k.txt"); //<-- czyta z pliku z podanej ścieżki. ścieżka musi być  stringiem.
        Scanner plik = new Scanner(plikzOperacjami); //<--^^^
        new Bank(plik, System.out).zrobOperacje();
       // new Bank().zrobOperacje(scanner);

    }

}
