package KontoSim;

public class Konto {
    private double kontostand;

    public Konto(double kontostand){
        this.kontostand = kontostand;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void einzahlen(double einzahlung) {
        this.kontostand += einzahlung;
    }

    public double auszahlen(double auszahlung){
        if (this.kontostand < auszahlung){
            System.out.println("Ihr Kontostand ist zu niedrig!");
            return 0;
        } else {
            this.kontostand -= auszahlung;
            return auszahlung;
        }

    }
}
