package presentationLayer;

import businessLayer.Ocupatie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class RegisterView extends JFrame {

      private JLabel lblNewLabel,userLabel, lblNewLabel_2;
      private JButton registerButton;
      private JComboBox comboBox;
      private JTextField usernameTextField,passwordTextField;

    public RegisterView() {

        this.setBounds(100, 100, 484, 591);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.getContentPane().setLayout(null);

        lblNewLabel = new JLabel("REGISTER");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblNewLabel.setBounds(189, 61, 146, 23);
        this.getContentPane().add(lblNewLabel);

        userLabel = new JLabel("USERNAME");
        userLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
        userLabel.setBounds(85, 168, 89, 14);
        this.getContentPane().add(userLabel);

        lblNewLabel_2 = new JLabel("PASSWORD");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_2.setBounds(85, 221, 89, 14);
        this.getContentPane().add(lblNewLabel_2);

        usernameTextField = new JTextField();
        usernameTextField.setBounds(184, 165, 189, 31);
        this.getContentPane().add(usernameTextField);
        usernameTextField.setColumns(10);

        passwordTextField = new JTextField();
        passwordTextField.setBounds(184, 218, 189, 31);
        this.getContentPane().add( passwordTextField);
        passwordTextField.setColumns(10);

        registerButton = new JButton("REGISTER");
        registerButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        registerButton.setBounds(160, 428, 138, 45);
        this.getContentPane().add(registerButton);

       /* comboBox = new JComboBox();
        comboBox.setBounds(126, 352, 203, 31);
        comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
        comboBox.setModel(new DefaultComboBoxModel(Ocupatie.values()));
        this.getContentPane().add(comboBox);*/

        this.setVisible(true);
    }

    public String getUsernameTextField() {
        return usernameTextField.getText();
    }

    public String getPasswordTextField() {
        return passwordTextField.getText();
    }

    public Ocupatie getComboBox() {
        return Ocupatie.valueOf(String.valueOf(comboBox.getSelectedItem()));
    }

    public void addRegisterListener(ActionListener action){
        registerButton.addActionListener(action);
    }
}