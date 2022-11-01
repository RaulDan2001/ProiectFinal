import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CreareLogin extends JFrame implements ActionListener
{
    JButton b1;
    JPanel newPanel;
    JLabel userLabel, passLabel;
    final JTextField  textField1, textField2;
    CreareLogin()
    {

        userLabel = new JLabel();
        userLabel.setText("Username");

        textField1 = new JTextField(15);

        //create label for password
        passLabel = new JLabel();
        passLabel.setText("Password");


        textField2 = new JPasswordField(15);


        b1 = new JButton("SUBMIT");


        newPanel = new JPanel(new GridLayout(3, 1));
        newPanel.add(userLabel);
        newPanel.add(textField1);
        newPanel.add(passLabel);
        newPanel.add(textField2);
        newPanel.add(b1);


        add(newPanel, BorderLayout.CENTER);


        b1.addActionListener(this);
        setTitle("LOGIN FORM");
    }

    public void actionPerformed(ActionEvent ae)
    {
        String userValue = textField1.getText();
        String passValue = textField2.getText();


        if (userValue.equals("MPerformance") && passValue.equals("cars")) {

            Atelier at = new Atelier();

            at.setVisible(true);

        }
        else{

            System.out.println("Please enter valid username and password");
        }
    }
}