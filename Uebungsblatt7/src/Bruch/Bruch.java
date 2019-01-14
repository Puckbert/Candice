package Bruch;

public class Bruch {

    private int zaehler;
    private int nenner;

    public Bruch(int zaehler, int nenner){
        this.zaehler = zaehler;
        this.nenner = nenner;
        int ggt = kuerzen(zaehler, nenner);
        System.out.println(getFormattedBruch(ggt));
    }

    public String getFormattedBruch(int ggt){
        return zaehler/ggt+ "/" +nenner/ggt;
    }

    private int kuerzen(int zaehler, int nenner){
        while (nenner != 0) {
            if (zaehler > nenner) {
                zaehler = zaehler - nenner;
            } else {
                nenner = nenner - zaehler;
            }
        }
        return zaehler;
    }
}
