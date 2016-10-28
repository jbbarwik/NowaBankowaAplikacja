import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestpkoSJ {


        public static void main(String[] args) throws FileNotFoundException {
            File plikZOperacji = new File("test.txt");
            Scanner scanner2 = new Scanner(plikZOperacji);
            new ParaBankJanka(scanner2, System.out).zrobOperacje(); // No Comments
        }
    }


