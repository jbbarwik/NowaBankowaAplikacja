import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestPkoDZ_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("testPkoDZ.txt"));
        new Bank().zrobOperacje(scanner);
    }
}
