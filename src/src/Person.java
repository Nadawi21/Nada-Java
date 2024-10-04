package src;

public class Person {
    private String namn;
    private String adress;
    private String personnummer;


    @Override
    public String toString() {
        return "Person{" +
                "namn='" + namn + '\'' +
                ", adress='" + adress + '\'' +
                ", personnummer='" + personnummer + '\'' +
                '}';
    }

    public Person(String namn, String adress, String personnummer) {
        this.namn = namn;
        this.adress = adress;
        this.personnummer = personnummer;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPersonnummer() {
        return personnummer;
    }

    public void setPersonnummer(String personnummer) {
        this.personnummer = personnummer;
    }
}
