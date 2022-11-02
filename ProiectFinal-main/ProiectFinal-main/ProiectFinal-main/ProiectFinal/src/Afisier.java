import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Afisier extends Atelier{

    // declarare campuri

    private JPanel panel;
    private JLabel afis;


    Afisier(){

        // initializarea panoului si adaugarea lui

        JPanel panel = new JPanel();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(1920, 1080);
        setTitle("MPerformance - Afisier");
        panel.setBackground(Color.red);
        add(panel);
        JLabel afis = new JLabel();
        add(afis);

        // afisarea masinilor din vector

        getcars();
    }
}
