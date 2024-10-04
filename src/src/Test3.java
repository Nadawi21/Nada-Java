package src;

public class Test3 {
    public static void main(String[] args) {

        int tim;
        int min;
        int sek;
        int tid = 7300;

        int tidItimmar = tid/3600;
        int tidMin = (tid-(3600*tidItimmar))/60;
        int sec = tid-(3600*tidItimmar)-(tidMin*60);
        System.out.println(tidItimmar  +":"+ tidMin+":"+ sec);



      }
}
