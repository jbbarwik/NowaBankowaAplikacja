import java.util.Scanner;

public class MainPko {

    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        ParaBankJanka pko = new ParaBankJanka(inn, System.out);
        pko.zrobOperacje();
    }

}
