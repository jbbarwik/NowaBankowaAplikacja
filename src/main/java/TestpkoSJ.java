import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestpkoSJ {


        public static void main(String[] args) throws FileNotFoundException {
            File plikZOperacji = new File("test.txt");
            Scanner scanner2 = new Scanner(plikZOperacji);
            new Bank().zrobOperacje(scanner2); // No Comments
        }
    }


