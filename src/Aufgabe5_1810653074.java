import javax.swing.*;

public class Aufgabe5_1810653074 {
    public static void main(String[] args)
    {

        forschleife(2);
        forschleife(6);

        whileschleife(7);
        whileschleife(5);

        nutzerschleife();
    }

    public static void forschleife(int a)
    {
        //a gibt die Anzahl der durchzuführenden Schleifen an
        for (int i = 1; i <=a; i++)
        {
            System.out.println(i);
        }
    }


    public static void whileschleife(int a)
    {
        //a gibt die Anzahl der durchzuführenden Schleifen an
        int i = 1;
        while (i <= a)
        {
            if (i % 2 == 0)
            {
                System.out.println("Es müssen " +i+" Schleifen durchgeführt werden");
            }
            i++;
        }
    }
    public static void nutzerschleife()
    {
        int eingabe1 = Integer.parseInt(JOptionPane.showInputDialog("Bitt eine Zahl eingeben!"));
        int eingabe2 = Integer.parseInt(JOptionPane.showInputDialog("Bitt noch eine Zahl eingeben!"));

        /* Zähler beginnt bei 1 */

        int zaehler = 1;

        /* äußere Schleife*/

        for (int i = 0; i<eingabe1; i++)
        {
            /*innere Schleife */

            for (int j = 0; j<eingabe2; j++)
            {
                System.out.println("Das ist der " + zaehler + ". Durchlauf der inneren Schleife!");
                zaehler++;
            }
        }

    }
}
