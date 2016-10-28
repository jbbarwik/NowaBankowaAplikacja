import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TestPkoJB {
    public static void main(String[] args) throws IOException {
        Path plik = Paths.get("C:\\Users\\Student\\Desktop\\Nowy folder\\NowaBankowaAplikacja\\src\\main\\java\\k.txt");
        //File plik2 = new File("C:\\Users\\Student\\Desktop\\Nowy folder\\NowaBankowaAplikacja\\src\\main\\java\\k.txt");
        Scanner skanerTxt = new Scanner(plik);
        new Bank().zrobOperacje(skanerTxt);
    }
}
