package SchweinKartoffelSzenario;

public class Schwein {
    private String name;
    private int gewicht;
    private int saettigungsgrad;

    public Schwein(String name, int gewicht, int saettigungsgrad){
        this.name = name;
        this.gewicht = gewicht;
        this.saettigungsgrad = saettigungsgrad;
    }

    public void bewegen() {
        if (this.saettigungsgrad < 4 && this.gewicht < 10) {
            System.out.println("Ich bin zu schlapp!");
        } else if (this.saettigungsgrad > 4) {
            this.saettigungsgrad -= 4;
        } else if (this.saettigungsgrad < 4) {
            this.gewicht--;
        } else {
            this.saettigungsgrad -=4;
        }
    }

    public void fressen(Kartoffel kartoffel){
        System.out.println(this.name + " hat was gegessen!");
        int naehrwert = kartoffel.pfluecken();

        if (naehrwert <= 0){
            System.out.println("Schade! Wieder nix zu fressen");
        } else {
            this.saettigungsgrad += naehrwert;
            if(this.saettigungsgrad >= 100){
                gewicht+=(this.saettigungsgrad -100)/2;
                this.saettigungsgrad = 100;
            }
        }

    }

    public void grunzen(){
        System.out.println("Hallo, ich bin "+this.name);
        System.out.println("Mein Gewicht ist: "+this.gewicht);
        System.out.println("Mein Sättigungsgrad ist: "+this.saettigungsgrad);
    }
}
