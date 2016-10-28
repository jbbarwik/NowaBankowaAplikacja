import javax.servlet.ServletOutputStream;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static spark.Spark.get;

public class TestPkoJB {
    public static void main(String[] args) throws IOException {
        Path plik = Paths.get("C:\\Users\\Student\\Desktop\\Nowy folder\\NowaBankowaAplikacja\\src\\main\\java\\k.txt");
        File plik2 = new File("C:\\Users\\Student\\Desktop\\Nowy folder\\NowaBankowaAplikacja\\src\\main\\java\\k.txt");
       Scanner skanerTxt = new Scanner(plik);
        new Bank().zrobOperacje(skanerTxt, System.out); ///<----- w klasie Bank pojawiła się nowa metoda  do wykonywania operacji. Stara metoda została oznaczona @Deprecated stara metoda to skanerTxt, nowa metoda to system.out






    }
}
