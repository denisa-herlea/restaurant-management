package presentationLayer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LogInView extends JFrame {

    private JLabel lblNewLabel,lblNewLabel_1,usernameLabel,passwordLabel;
    private JButton administratorButton,clientButton,employeeButton,registerButton,loginButton;
    private JTextField usernameTextField,passwordTextField;


    public LogInView() {
        this.setBounds(100, 100, 543, 574);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);

        lblNewLabel = new JLabel("FOOD DELIVERY MANAGEMENT SYSTEM");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel.setBounds(146, 61, 278, 14);
        this.getContentPane().add(lblNewLabel);

        administratorButton = new JButton("ADMINISTRATOR");
        administratorButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
        administratorButton.setBounds(293, 332, 190, 31);
        this.getContentPane().add(administratorButton);

        clientButton = new JButton("CLIENT");
        clientButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
        clientButton.setBounds(173, 332, 110, 31);
        this.getContentPane().add(clientButton);

        employeeButton = new JButton("EMPLOYEE");
        employeeButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
        employeeButton.setBounds(27, 332, 131, 31);
        this.getContentPane().add(employeeButton);

        registerButton = new JButton("REGISTER");
        registerButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
        registerButton.setBounds(160, 462, 221, 31);
        this.getContentPane().add(registerButton);

        lblNewLabel_1 = new JLabel("LOGIN");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_1.setBounds(246, 87, 110, 14);
        this.getContentPane().add(lblNewLabel_1);

        usernameLabel = new JLabel("USERNAME");
        usernameLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        usernameLabel.setBounds(66, 190, 110, 14);
        this.getContentPane().add(usernameLabel);

        passwordLabel = new JLabel("PASSWORD");
        passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        passwordLabel.setBounds(66, 244, 105, 14);
        this.getContentPane().add(passwordLabel);

        usernameTextField = new JTextField();
        usernameTextField.setBounds(225, 185, 231, 31);
        this.getContentPane().add(usernameTextField);
        usernameTextField.setColumns(10);

        passwordTextField = new JTextField();
        passwordTextField.setBounds(225, 239, 231, 31);
        this.getContentPane().add(passwordTextField);
        passwordTextField.setColumns(10);

      /*  loginButton = new JButton("LOGIN");
        loginButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
        loginButton.setBounds(210, 386, 89, 23);
        this.getContentPane().add(loginButton);
*/
        this.setVisible(true);

    }

    public String getUsernameTextField() {
        return usernameTextField.getText();
    }

    public String getPasswordTextField() {
        return passwordTextField.getText();
    }

    public void addAdministratorListener(ActionListener action){
        administratorButton.addActionListener(action);
    }

    public void addClientListener(ActionListener action){
        clientButton.addActionListener(action);
    }

    public void addEmployeeListener(ActionListener action){
        employeeButton.addActionListener(action);
    }

    public void addRegisterListener(ActionListener action){
        registerButton.addActionListener(action);
    }

    public void addLoginListener(ActionListener action){
        loginButton.addActionListener(action);
    }
}