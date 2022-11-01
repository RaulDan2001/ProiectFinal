import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


class Atelier extends JFrame
{
    private JPanel panel;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JTextField model;
    private JTextField engine;
    private JTextField sasiu;
    private JTextField distributie;
    private JTextField carselect;
    private JTextField enginenou;
    private JTextField sasiunou;
    private JTextField distributienou;
    String s;
    String s2;
    String s3;
    String s4;
    Atelier()
    {
        ArrayList<masina> cars = new ArrayList<>();
        masina m = new masina("","","","");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(1920, 1080);
        setTitle("MPerformance - ATELIER");

        panel = new JPanel();
        panel.setBackground(Color.blue);
        add(panel);


        btn1 = new JButton("Adauga masina");
        btn1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        btn1.setBackground(Color.red);
                        s = model.getText();
                        s2 = engine.getText();
                        s3 = sasiu.getText();
                        s4 = distributie.getText();
                        m.setModel(s);
                        m.setEngine(s2);
                        m.setSasiu(s3);
                        m.setDistributie(s4);
                        cars.add(m);
                    }
                }

        );

        btn2 = new JButton("Selecteaza masina");
        btn2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        btn2.setBackground(Color.red);
                        s = carselect.getText();
                        int n = Integer.parseInt(s);

                        btn3 = new JButton("Tuneaza masina");
                        panel.revalidate();
                        panel.repaint();
                        panel.add(btn3);
                        enginenou = new JTextField();
                        enginenou.setPreferredSize(new Dimension(300,30));
                        sasiunou = new JTextField();
                        sasiunou.setPreferredSize(new Dimension(300,30));
                        distributienou = new JTextField();
                        distributienou.setPreferredSize(new Dimension(300,30));
                        panel.add(enginenou);
                        panel.add(sasiunou);
                        panel.add(distributienou);
                        btn3.addActionListener(
                                new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        btn3.setBackground(Color.red);
                                        s = enginenou.getText();
                                        s2 = sasiunou.getText();
                                        s3 = distributienou.getText();
                                        cars.get(n).setEngine(s);
                                        cars.get(n).setSasiu(s2);
                                        cars.get(n).setDistributie(s3);
                                    }
                                }

                        );
                    }
                }

        );

        btn4 = new JButton("Catre afisier ->");
        btn4.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        btn4.setBackground(Color.red);
                    }
                }

        );

        model = new JTextField();
        model.setPreferredSize(new Dimension(300,30));
        engine =  new JTextField();
        engine.setPreferredSize(new Dimension(300,30));
        sasiu = new JTextField();
        sasiu.setPreferredSize(new Dimension(300,30));
        distributie = new JTextField();
        distributie.setPreferredSize(new Dimension(300,30));
        carselect = new JTextField();
        carselect.setPreferredSize(new Dimension(300,30));

        panel.add(btn4);
        panel.add(btn1);
        panel.add(model);
        panel.add(engine);
        panel.add(sasiu);
        panel.add(distributie);
        panel.add(btn2);
        panel.add(carselect);

    }
}
