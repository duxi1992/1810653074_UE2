import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class Aufgabe3_1810653074
{
    public static void main (String [] args){
        int alter;
        double alter;

      String eingabe;
      eingabe = JOptionPane.showInputDialog("Eingabe");


        double eingabe;
        eingabe = Double.parseDouble("1");
        System.out.println(eingabe);

        int eingabe;
        eingabe = Integer.parseInt(JOptionPane.showInputDialog("bitte geben sie eine Zahl ein!"));
        System.out.println(eingabe);

        boolean eingabe;
        eingabe = Boolean.parseBoolean(JOptionPane.showInputDialog("bitte einen boolischen Wert eingeben"));
        System.out.println(eingabe);

        long eingabe;
        eingabe = Long.parseLong(JOptionPane.showInputDialog("Bitte geben sie einen long wert ein"));
        System.out.println(eingabe);

        char eingabe;
        eingabe = (char)Integer.parseInt(JOptionPane.showInputDialog("bitte geben sie eine Zahl ein!"));
        System.out.println(eingabe);

        byte eingabe;
        eingabe = Byte.parseByte(JOptionPane.showInputDialog("Bitte geben sie einen byte Wert ein"));
        System.out.println(eingabe);

        short eingabe;
        eingabe = Short.parseShort(JOptionPane.showInputDialog("Bitte geben sie einen short Wert ein"));
        System.out.println(eingabe);

        float eingabe;
        eingabe = Float.parseFloat(JOptionPane.showInputDialog("bitte geben sie einen float wert ein"));
        System.out.println(eingabe);

        String.valueOf(alter);
        System.out.println(alter);
    }



}
/* fehlerhafte Ausgabe erfolgt wenn mann die Werte vermischt.
 * das Sytem schlägt Änderungen für die Machbarkeit vor */