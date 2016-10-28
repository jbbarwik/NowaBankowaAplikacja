import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestPkoPP {

    public static void main(String[] args) throws FileNotFoundException {
        File plikZOperacjami = new File("test_pp.txt");
        Scanner scanner2 = new Scanner(plikZOperacjami);
        new Bank().zrobOperacje(scanner2);
    }

}
