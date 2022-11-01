import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;
import java.util.*;

interface Garage {
    public static final String adresa = "Plopilor 25";
    public static final String nume = "M Performance";
}


class Main
{

    public static void main(String arg[])
    {

        ArrayList<masina> cars = new ArrayList<>();

        try
        {

            CreareLogin form = new CreareLogin();
            form.setSize(300,100);
            form.setVisible(true);
            form.setBackground(Color.red);
            form.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        }
        catch(Exception e)
        {

            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}

