package src;

public class Bil {
    private int registreringsnummer;
    private String fabrikat;
    private int årsmodell;
    private double tjänstevikt;
    private double motoreffekt;

    public void setRegistreringsnummer(int registreringsnummer) {
        this.registreringsnummer = registreringsnummer;
    }

    public void setFabrikat(String fabrikat) {
        this.fabrikat = fabrikat;
    }

    public void setÅrsmodell(int årsmodell) {
        this.årsmodell = årsmodell;
    }

    public void setTjänstevikt(double tjänstevikt) {
        this.tjänstevikt = tjänstevikt;
    }

    public void setMotoreffekt(double motoreffekt) {
        this.motoreffekt = motoreffekt;
    }

    public int getRegistreringsnummer() {
        return registreringsnummer;
    }

    public String getFabrikat() {
        return fabrikat;
    }

    public int getÅrsmodell() {
        return årsmodell;
    }

    public double getTjänstevikt() {
        return tjänstevikt;
    }

    public double getMotoreffekt() {
        return motoreffekt;
    }

    public Bil(){

    }

    public static void okok(){

    }


    public Bil(int registreringsnummer, String fabrikat, int årsmodell, double tjänstevikt, double motoreffekt) {
        this.registreringsnummer = registreringsnummer;
        this.fabrikat = fabrikat;
        this.årsmodell = årsmodell;
        this.tjänstevikt = tjänstevikt;
        this.motoreffekt = motoreffekt;
    }

    public int addShit(){
        return registreringsnummer+årsmodell;
    }
}
