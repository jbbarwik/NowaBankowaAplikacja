import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestPkoDZ_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("testPkoDZ.txt"));
        new ParaBankJanka(scanner, System.out).zrobOperacje();
//        System.out odpowiada za to, że wywołujemy na PrintStreamie nasz komunikat (w klasie Bank)
//        Tu widzimy naszą aplikację Webową: http://localhost:4567/hello - tak jak nadaliśmy Stringa w Spark.get
    }
}
