import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestPkoPP {

    public static void main(String[] args) throws FileNotFoundException {
        File plikZOperacjami = new File("test_pp.txt");
        Scanner scanner2 = new Scanner(plikZOperacjami);
        PrintStream printStream = new PrintStream(new File("wynik_test_pp.txt"));
        new Bank().zrobOperacje(scanner2, printStream);
    }

}
