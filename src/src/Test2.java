package src;

public class Test2 {
    public static void main(String[] args) {
        String a = " Erik Andersson 860314-2714 ";

        a = a.trim();
        int i = a.lastIndexOf(' ' ) + 5;
        int i2 = a.indexOf(4);
        int j = a.indexOf('0');
        int j2 = a.indexOf(3);
        String b = a.substring(i, i2);
        String b2 = a.substring(j, j2);
                System.out.println (i + i2 + "/" + j + j2 );



    }
}
