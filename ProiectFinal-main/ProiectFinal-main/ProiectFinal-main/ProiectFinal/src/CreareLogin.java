import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CreareLogin extends JFrame implements ActionListener
{

    //declarare campuri

    JButton b1;
    JPanel newPanel;
    JLabel userLabel, passLabel;
    final JTextField  textField1, textField2;
    CreareLogin()
    {

       //creare si setare elemente grafice

        userLabel = new JLabel();
        userLabel.setText("Username");

        textField1 = new JTextField(15);

        passLabel = new JLabel();
        passLabel.setText("Password");


        textField2 = new JPasswordField(15);


        b1 = new JButton("SUBMIT");


        //adaugare elemente grafice in panou

        newPanel = new JPanel(new GridLayout(3, 1));
        newPanel.add(userLabel);
        newPanel.add(textField1);
        newPanel.add(passLabel);
        newPanel.add(textField2);
        newPanel.add(b1);
        newPanel.setBackground(Color.red);

        add(newPanel, BorderLayout.CENTER);

        b1.addActionListener(this);
        setTitle("MPerformance - LOGIN");
    }

    //implementarea functiei actionPerformed din interfata ActionListener

    public void actionPerformed(ActionEvent ae)
    {
        String userValue = textField1.getText();
        String passValue = textField2.getText();


        //verificare parola si username

        if (userValue.equals("MPerformance") && passValue.equals("cars")) {

            Atelier at = new Atelier();

            at.setVisible(true);

        }
        else{

            System.out.println("Please enter valid username and password");
        }
    }
}