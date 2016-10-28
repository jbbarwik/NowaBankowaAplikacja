import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TestPkoMZ {

	    public static void main(String[] args) throws FileNotFoundException {
// w nawiasie znajduje się plik (nazwa pliku)    	
	    	File file = new File("test_MZ.txt");
	    	
	    	Scanner nowyScanner = new Scanner(file);
      
	        new Bank().zrobOperacje(nowyScanner);
 
	        
	}
}
