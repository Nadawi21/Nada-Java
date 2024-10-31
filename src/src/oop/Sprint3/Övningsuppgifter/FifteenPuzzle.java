package src.oop.Sprint3.Övningsuppgifter;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FifteenPuzzle extends JFrame {

    public FifteenPuzzle() {
        
//Skapar panel och knappar
    JPanel jp = new JPanel();

    JButton jb = new JButton ("1");
    JButton jb2 = new JButton ("2");
    JButton jb3 = new JButton ("3");
    JButton jb4 = new JButton ("4");
    JButton jb5 = new JButton ("5");
    JButton jb6 = new JButton ("6");
    JButton jb7 = new JButton ("7");
    JButton jb8 = new JButton ("8");
    JButton jb9 = new JButton ("9");
    JButton jb10 = new JButton ("10");
    JButton jb11 = new JButton ("11");
    JButton jb12 = new JButton ("12");
    JButton jb13 = new JButton ("13");
    JButton jb14 = new JButton ("14");
    JButton jb15 = new JButton ("15");
    JButton jb16 = new JButton (" ");

//lägger till panelen och knapparna
    
        this.add(jp);

    jp.add(jb);
    jp.add(jb2);
    jp.add(jb3);
    jp.add(jb4);
    jp.add(jb5);
    jp.add(jb6);
    jp.add(jb7);
    jp.add(jb8);
    jp.add(jb9);
    jp.add(jb10);
    jp.add(jb11);
    jp.add(jb12);
    jp.add(jb13);
    jp.add(jb14);
    jp.add(jb15);
    jp.add(jb16);
    
//Lägger till layout
        jp.setLayout(new GridLayout(4,4));

        setSize(200, 200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

//Skapar arraylist och lägger in alla knappar
        
        
 ArrayList<JButton> buttonArrayList = new ArrayList<>();

   buttonArrayList.add(jb);
   buttonArrayList.add(jb3);
   buttonArrayList.add(jb4);
   buttonArrayList.add(jb5);
   buttonArrayList.add(jb6);
   buttonArrayList.add(jb7);
   buttonArrayList.add(jb8);
   buttonArrayList.add(jb9);
   buttonArrayList.add(jb10);
   buttonArrayList.add(jb11);
   buttonArrayList.add(jb12);
   buttonArrayList.add(jb13);
   buttonArrayList.add(jb14);
   buttonArrayList.add(jb15);
   buttonArrayList.add(jb16);
        
}
    public static void main(String[] args){
        FifteenPuzzle inl = new FifteenPuzzle();
    }
}
