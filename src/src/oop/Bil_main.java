package src.oop;

public class Bil_main {
    public static void main (String [] args){
        Person p1 = new Person("Sara", "Fina Svenséns gata", 35);
        Person p2 = new Person("Manar", "Carin Bååts gata ", 35);
        Person p3 = new Person("Milad", "Karin Sjöbergs gata", 40);
        Person p4 = new Person("Farah", "Liden 4", 37);
        Person p5 = new Person("Nada", "Karlslundsgatan 22",27);

        Bil b1 = new Bil("RWH713", 2018, "Toyota");
        Bil b2 = new Bil("DHF746", 2020, "Volvo");
        Bil b3 = new Bil("FJI998", 2011, "Mercedes");
        Bil b4 = new Bil("ASV455", 2024, "Audi");
        Bil b5 = new Bil("VDH999", 2016,"BMW" );

        Bilagare ba1 = new Bilagare("Manar", "Carin Bååts gata ", 35, b1);
        Bilagare ba2 = new Bilagare("Sara", "Fina Svenséns gata", 35,b2);
        Bilagare ba3 = new Bilagare("Milad", "Karin Sjöbergs gata", 40);
        Bilagare ba4 = new Bilagare("Farah", "Liden 4", 37,b4);
        Bilagare ba5 = new Bilagare("Nada", "Karlslundsgatan 22",27);

        ba5.kopBil(b5);
        ba2.saljBil();

        System.out.println(ba1.getBil().toString() + ba2.getBil());
    }

}
