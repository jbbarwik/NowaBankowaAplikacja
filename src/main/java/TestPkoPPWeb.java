import javax.servlet.ServletOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import static spark.Spark.get;

public class TestPkoPPWeb {

    public static void main(String[] args) throws FileNotFoundException {
        // Czytanie z pliku
        File plikZOperacjami = new File("test_pp.txt");
        Scanner scanner2 = new Scanner(plikZOperacjami);
        get("/hello", (req, res) -> {
            ServletOutputStream outputStream = res.raw().getOutputStream();
            new Bank().zrobOperacje(scanner2, new PrintStream(outputStream));
        return null;
        });





    }

}
