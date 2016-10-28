import java.util.Scanner;

public class MainPko {

    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        Bank pko = new Bank();
        pko.zrobOperacje(inn);
    }

}
