import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

class MasiniWindow
{
    private JPanel panel;
    private JButton btnaddcar;
    private JButton btnnewcar;

    private JButton btnrace;
    private JLabel lbladdcar;

    private JLabel lbladdcar1;

    private JLabel lbladdcar2;

    private JLabel lblnewcar;

    private JLabel lblwinner;

    private JLabel lblerror;

    private JLabel lblnotengough;
    private JTextField txtaddcar;

    private JTextField txtaddcar1;

    private JTextField txtaddcar2;

    static final String btntext = "Adaugati masina";

    static final String btntext1 = "Afisare cea mai noua masina";

    static final String btntext2 = "Simulare cursa";
    int min = 1800;

    int gracers = -1;
    String newmodel;

    public static void main(String[] args)
    {

        ArrayList<Masini> arr = new ArrayList<Masini>();

        JFrame frame = new JFrame("Aplicatie Masini");



        MasiniWindow main = new MasiniWindow();
        main.panel = new JPanel();
        main.panel.setBackground(Color.ORANGE);
        main.panel.setSize(300,300);


        frame.setContentPane(main.panel);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1920, 1080);

        StringBuffer txtadaugsuccess = new StringBuffer("Masina adaugata cu succes");

        main.btnaddcar = new JButton(btntext);
        main.btnaddcar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        main.btnaddcar.setBackground(Color.LIGHT_GRAY);
                        String mtext = main.txtaddcar.getText();
                        String ptext = main.txtaddcar1.getText();
                        String ytext = main.txtaddcar2.getText();
                        if (mtext.length() > 0 && ptext.length() > 0 && ytext.length() > 0) {
                            if (ytext.length() != 0)
                            {
                                int yint = Integer.parseInt(ytext);
                                arr.add(new Masini(mtext, ptext, yint));
                                if (yint > main.min) main.newmodel = mtext;
                            }
                            main.gracers++;
                            System.out.println(txtadaugsuccess);
                        }else{
                            main.lblerror = new JLabel();
                            main.panel.add(main.lblerror);
                            main.lblerror.setText("Datele introduse nu sunt valide");
                        }
                    }
                }
        );

        main.btnnewcar = new JButton(btntext1);
        main.btnnewcar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        main.lblnewcar.setText("Cea mai noua masina este " +main.newmodel);
                    }
                }
        );

        main.btnrace = new JButton(btntext2);
        main.btnrace.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (main.gracers < 1)
                        {
                            main.lblerror.setText("Nu sunt destule masini introduse");
                        }else{
                            Random rand = new Random();
                            int winner = rand.nextInt(main.gracers);
                            main.lblwinner.setText("Castigatorul este: "+ arr.get(winner).getModel());
                    }
                    }
                }
        );

        main.panel.add(main.btnaddcar);
        main.panel.add(main.btnnewcar);
        main.panel.add(main.btnrace);

        main.lbladdcar = new JLabel();
        main.panel.add(main.lbladdcar);
        main.lbladdcar.setText("Introduceti modelul :");
        main.txtaddcar = new JTextField();
        main.txtaddcar.setPreferredSize(new Dimension(150, 30));
        main.panel.add(main.txtaddcar);
        main.lblnotengough = new JLabel();
        main.panel.add(main.lblnotengough);

        main.lbladdcar1 = new JLabel();
        main.panel.add(main.lbladdcar1);
        main.lbladdcar1.setText("Introduceti placuta de matriculare :");
        main.txtaddcar1 = new JTextField();
        main.txtaddcar1.setPreferredSize(new Dimension(150, 30));
        main.panel.add(main.txtaddcar1);

        main.lbladdcar2 = new JLabel();
        main.panel.add(main.lbladdcar2);
        main.lbladdcar2.setText("Introduceti anul fabricatiei :");
        main.txtaddcar2 = new JTextField();
        main.txtaddcar2.setPreferredSize(new Dimension(150, 30));
        main.panel.add(main.txtaddcar2);

        main.lblnewcar = new JLabel();
        main.panel.add(main.lblnewcar);

        main.lblwinner = new JLabel();
        main.panel.add(main.lblwinner);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}