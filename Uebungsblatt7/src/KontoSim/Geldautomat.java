package KontoSim;

import java.util.Scanner;

public class Geldautomat {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Konto konto = new Konto(20000);
        boolean exit = true;
        int auswahl;

        while(exit){
            System.out.println("Willkommen!");
            System.out.println("1. Kontostand anzeigen");
            System.out.println("2. Einzahlen");
            System.out.println("3. Auszahlen");
            System.out.println("Auswahl: ");
            auswahl = sc.nextInt();

            switch (auswahl){
                case 1: System.out.print(String.format("%.2f",konto.getKontostand())+" EUR\n");
                        break;
                case 2: System.out.println("Geben Sie ein was eingezahlt werden soll: ");
                        double einzahlung = sc.nextDouble();
                        konto.einzahlen(einzahlung);
                        break;
                case 3: System.out.println("Geben Sie ein was ausgezahlt werden soll: ");
                        double auszahlung = sc.nextDouble();
                        konto.auszahlen(auszahlung);
                        break;
                case 4: exit = false;
                        break;
            }
        }


    }
}
