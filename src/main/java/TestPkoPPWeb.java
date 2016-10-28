import javax.servlet.ServletOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import static spark.Spark.get;

public class TestPkoPPWeb {

    public static void main(String[] args) throws FileNotFoundException {



        // Strona dostępna pod URLem http://localhost:4567/hello?wplata=10&przelew=2
        // http://localhost:4567/hello + parametry
        get("/hello", (req, res) -> {
            String daneWejsciowe = req.queryParams("wplata") + "\n" + req.queryParams("przelew") + "\n";
            Scanner scanner2 = new Scanner(daneWejsciowe);
            ServletOutputStream outputStream = res.raw().getOutputStream();
            new Bank().zrobOperacje(scanner2, new PrintStream(outputStream));
        return null;
        });





    }

}
