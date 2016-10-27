public class Konto {

    String numerKonta;
    String wlasciciel;
    int saldo;


    public Konto(String numerKonta, String wlasciciel, int saldo) {
        this.numerKonta = numerKonta;
        this.wlasciciel = wlasciciel;
        this.saldo = saldo;
    }
    public Konto(String numerKonta, String wlasciciel) {
        this.numerKonta = numerKonta;
        this.wlasciciel = wlasciciel;
        this.saldo = 0;  ////<----Ten parametr ustawia saldo na zero.
    }
    public void wplata(int kwota ) {
        saldo = saldo+kwota;
    }
    public void przelew(int kwotap){
        saldo = saldo+kwotap;
    }

}


