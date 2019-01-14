package SchweinKartoffelSzenario;

public class Main {
    public static void main(String[] args){
        Schwein schwein = new Schwein("Fritz", 10, 10);

        Kartoffel k1 = new Kartoffel(10);
        Kartoffel k2 = new Kartoffel(20);

        schwein.grunzen();
        schwein.fressen(k1);
        schwein.grunzen();
        schwein.bewegen();
        schwein.grunzen();
        schwein.fressen(k2);
        schwein.grunzen();
        schwein.bewegen();
        schwein.grunzen();
    }
}
