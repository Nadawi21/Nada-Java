package src.oop.sprint1.inlämningsuppgift;

public abstract class Växter implements Omvårdnad{

   /*instansvariabler
   obs: inkaplsing
    */
   private double längd;
   private double vätska;
   private String namn;

   //implementera interfacen
   @Override
   public abstract double vattna();

   //getters
   public double getLängd() {
      return längd;
   }
   public double getVätska() {
      return vätska;
   }

   public String getNamn() {
      return namn;
   }

   //konstruktor
   public Växter(double längd, double vätska, String namn) {
      this.längd = längd;
      this.vätska = vätska;
      this.namn = namn;
   }
}
