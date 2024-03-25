package presentationLayer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ClientView extends JFrame {

    private JButton searchButton,createOrderButton,viewMenuButton;
    private JLabel lblNewLabel_1,lblNewLabel_2,lblNewLabel_3,lblNewLabel_4,lblNewLabel_5,lblNewLabel_6,lblNewLabel_7,lblNewLabel;
    private JTextField titleTextField,ratingTextField,caloriesTextField, proteinTextField, fatTextField,sodiumTextField,priceTextField;

    public ClientView(){

        this.setBounds(100, 100, 529, 560);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.getContentPane().setLayout(null);

        lblNewLabel_1 = new JLabel("TITLE");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_1.setBounds(44, 155, 46, 14);
        this.getContentPane().add(lblNewLabel_1);

        lblNewLabel_2 = new JLabel("RATING");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_2.setBounds(44, 197, 58, 14);
        this.getContentPane().add(lblNewLabel_2);

         lblNewLabel_3 = new JLabel("CALORIES");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_3.setBounds(44, 241, 63, 14);
        this.getContentPane().add(lblNewLabel_3);

        lblNewLabel_4 = new JLabel("PROTEIN");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_4.setBounds(44, 285, 63, 14);
        this.getContentPane().add(lblNewLabel_4);

        lblNewLabel_5 = new JLabel("FAT");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_5.setBounds(44, 326, 46, 14);
        this.getContentPane().add(lblNewLabel_5);

        lblNewLabel_6 = new JLabel("SODIUM");
        lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_6.setBounds(44, 371, 58, 14);
        this.getContentPane().add(lblNewLabel_6);

        lblNewLabel_7 = new JLabel("PRICE");
        lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_7.setBounds(44, 412, 46, 14);
        this.getContentPane().add(lblNewLabel_7);

        titleTextField = new JTextField();
        titleTextField.setBounds(129, 154, 100, 20);
        this.getContentPane().add(titleTextField);
        titleTextField.setColumns(10);

        ratingTextField = new JTextField();
        ratingTextField.setBounds(129, 196, 100, 20);
        this.getContentPane().add(ratingTextField);
        ratingTextField.setColumns(10);

        caloriesTextField = new JTextField();
        caloriesTextField.setBounds(129, 240, 100, 20);
        this.getContentPane().add(caloriesTextField);
        caloriesTextField.setColumns(10);

        proteinTextField = new JTextField();
        proteinTextField.setBounds(129, 284, 100, 20);
        this.getContentPane().add(proteinTextField);
        proteinTextField.setColumns(10);

        fatTextField = new JTextField();
        fatTextField.setBounds(129, 325, 100, 20);
        this.getContentPane().add(fatTextField);
        fatTextField.setColumns(10);

        sodiumTextField = new JTextField();
        sodiumTextField.setBounds(131, 370, 100, 20);
        this.getContentPane().add(sodiumTextField);
        sodiumTextField.setColumns(10);

        priceTextField = new JTextField();
        priceTextField.setBounds(128, 411, 101, 20);
        this.getContentPane().add(priceTextField);
        priceTextField.setColumns(10);

        lblNewLabel = new JLabel("CLIENT");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblNewLabel.setBounds(208, 47, 114, 28);
        this.getContentPane().add(lblNewLabel);

        searchButton = new JButton("SEARCH");
        searchButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
        searchButton.setBounds(315, 206, 140, 43);
        this.getContentPane().add(searchButton);

        createOrderButton = new JButton("CREATE ORDER");
        createOrderButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
        createOrderButton.setBounds(315, 256, 140, 43);
        this.getContentPane().add(createOrderButton);

        viewMenuButton = new JButton("VIEW MENU");
        viewMenuButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
        viewMenuButton.setBounds(315, 308, 140, 43);
        this.getContentPane().add(viewMenuButton);

        this.setVisible(true);
    }

    public String getTitleTextField() {
        return titleTextField.getText();
    }

    public String getRatingTextField() {
        return ratingTextField.getText();
    }

    public String getCaloriesTextField() {
        return caloriesTextField.getText();
    }

    public String getProteinTextField() {
        return proteinTextField.getText();
    }

    public String getFatTextField() {
        return fatTextField.getText();
    }

    public String getSodiumTextField() {
        return sodiumTextField.getText();
    }

    public String getPriceTextField() {
        return priceTextField.getText();
    }

    public void addSearchListener(ActionListener action){
        searchButton.addActionListener(action);
    }
    public void addCreateOrderListener(ActionListener action){
        createOrderButton.addActionListener(action);
    }
    public void addViewMenuListener(ActionListener action){
        viewMenuButton.addActionListener(action);
    }
}
