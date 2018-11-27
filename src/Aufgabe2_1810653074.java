import javax.swing.*;

public class Aufgabe2_1810653074 {
    public static void main(String[] args) {

        // eingabefeld fom Typ int für 2 Variablen


        int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("bitte geben sie eine Zahl ein!"));
        int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("bitte geben sie noch eine Zahl ein!"));

        if (zahl1 == zahl2) {

            System.out.println("Deine zahlen stimmen überein!");

            // Prfüt ob der Wert kleiner oder größer als der andere Wert ist

        } else if (zahl1 < zahl2) {

            for (int i = zahl1; i <= zahl2; i++) {

                //Ausgabe der benötigten Schritte

                System.out.println("esbenötigte " + i + " Schritte");
            }
        } else {

            for (int i = zahl2; i <= zahl1; i++) {

                //Ausgabe der benötigten Schritte

                System.out.println("Es benötigte " + i + " Schritte");
            }
        }
    }
}
