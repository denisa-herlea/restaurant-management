package presentationLayer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ReportsView extends JFrame {

    private JButton clientsOrdersButton,productsOrderedButton,timeIntervalButton,productsDayButton;
    private JTextField startTimeTextField,endTimeTextField,noProductsTextField,noClientsTextField,orderValueTextField,dayTextField;
    private JLabel lblNewLabel, lblNewLabel_1, lblNewLabel_2,lblNewLabel_3,lblNewLabel_4,lblNewLabel_5,lblNewLabel_6;

    public ReportsView(){

        this.setBounds(100, 100, 506, 555);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.getContentPane().setLayout(null);

        lblNewLabel = new JLabel("REPORT");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblNewLabel.setBounds(208, 57, 130, 23);
        this.getContentPane().add(lblNewLabel);

        lblNewLabel_1 = new JLabel("START TIME");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_1.setBounds(57, 116, 89, 14);
        this.getContentPane().add(lblNewLabel_1);

        lblNewLabel_2 = new JLabel("END TIME");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_2.setBounds(57, 153, 76, 14);
        this.getContentPane().add(lblNewLabel_2);

        lblNewLabel_3 = new JLabel("NO. PRODUCTS");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_3.setBounds(57, 191, 89, 14);
        this.getContentPane().add(lblNewLabel_3);

        lblNewLabel_4 = new JLabel("NO. CLIENTS");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_4.setBounds(57, 223, 89, 14);
        this.getContentPane().add(lblNewLabel_4);

        lblNewLabel_5 = new JLabel("ORDER VALUE");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_5.setBounds(57, 265, 89, 14);
        this.getContentPane().add(lblNewLabel_5);

        lblNewLabel_6 = new JLabel("DAY");
        lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_6.setBounds(57, 302, 46, 14);
        this.getContentPane().add(lblNewLabel_6);

        clientsOrdersButton = new JButton("CLIENTS ORDERS");
        clientsOrdersButton.setBounds(158, 431, 200, 23);
        this.getContentPane().add(clientsOrdersButton);

        productsOrderedButton = new JButton("PRODUCTS ORDERED");
        productsOrderedButton.setBounds(158, 397, 200, 23);
        this.getContentPane().add(productsOrderedButton);

        timeIntervalButton = new JButton("TIME INTERVAL");
        timeIntervalButton.setBounds(158, 358, 200, 23);
        this.getContentPane().add(timeIntervalButton);

        productsDayButton = new JButton("PRODUCTS ORDERED IN A DAY");
        productsDayButton.setBounds(158, 465, 200, 23);
        this.getContentPane().add(productsDayButton);

        startTimeTextField = new JTextField();
        startTimeTextField.setBounds(191, 114, 86, 20);
        this.getContentPane().add(startTimeTextField);
        startTimeTextField.setColumns(10);

        endTimeTextField = new JTextField();
        endTimeTextField.setBounds(191, 151, 86, 20);
        this.getContentPane().add(endTimeTextField);
        endTimeTextField.setColumns(10);

        noProductsTextField = new JTextField();
        noProductsTextField.setBounds(191, 189, 86, 20);
        this.getContentPane().add(noProductsTextField);
        noProductsTextField.setColumns(10);

        noClientsTextField = new JTextField();
        noClientsTextField.setBounds(191, 221, 86, 20);
        this.getContentPane().add(noClientsTextField);
        noClientsTextField.setColumns(10);

        orderValueTextField = new JTextField();
        orderValueTextField.setBounds(191, 263, 86, 20);
        this.getContentPane().add(orderValueTextField);
        orderValueTextField.setColumns(10);

        dayTextField = new JTextField();
        dayTextField.setBounds(191, 300, 86, 20);
        this.getContentPane().add(dayTextField);
        dayTextField.setColumns(10);

        this.setVisible(true);
    }

    public String getStartTimeTextField() {
        return startTimeTextField.getText();
    }

    public String getEndTimeTextField() {
        return endTimeTextField.getText();
    }

    public String getNoProductsTextField() {
        return noProductsTextField.getText();
    }

    public String getNoClientsTextField() {
        return noClientsTextField.getText();
    }

    public String getOrderValueTextField() {
        return orderValueTextField.getText();
    }

    public String getDayTextField() {
        return dayTextField.getText();
    }
    public void addClientsOrdersListener(ActionListener action){
        clientsOrdersButton.addActionListener(action);
    }
    public void addProductsOrderedListener(ActionListener action){
        productsOrderedButton.addActionListener(action);
    }
    public void addTimeIntervalListener(ActionListener action){
        timeIntervalButton.addActionListener(action);
    }
    public void addProductsDayListener(ActionListener action){
        productsDayButton.addActionListener(action);
    }

}
