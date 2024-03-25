package presentationLayer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AdministratorView extends JFrame {

    private JButton composedProductButton,generateReportButton,viewAllButton,addButton,deleteButton,editButton;
    private JTextField titleTextField, ratingTextField,caloriesTextField,proteinTextField,fatTextField,sodiumTextField,priceTextField,newProductTextField;
    private JLabel lblNewLabel,lblNewLabel_1,lblNewLabel_2, lblNewLabel_3,lblNewLabel_4,lblNewLabel_5,lblNewLabel_6,lblNewLabel_7,lblNewLabel_8;

    public AdministratorView(){

        this.setBounds(100, 100, 494, 567);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.getContentPane().setLayout(null);

        lblNewLabel = new JLabel("ADMINISTRATOR");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel.setBounds(174, 45, 169, 36);
        this.getContentPane().add(lblNewLabel);

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
        lblNewLabel_7.setBounds(44, 424, 46, 14);
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
        sodiumTextField.setBounds(129, 370, 100, 20);
        this.getContentPane().add(sodiumTextField);
        sodiumTextField.setColumns(10);

        priceTextField = new JTextField();
        priceTextField.setBounds(129, 423, 100, 20);
        this.getContentPane().add(priceTextField);
        priceTextField.setColumns(10);

        lblNewLabel_8 = new JLabel("NEW PRODUCT");
        lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_8.setBounds(251, 155, 100, 14);
        this.getContentPane().add(lblNewLabel_8);

        newProductTextField = new JTextField();
        newProductTextField.setBounds(364, 154, 86, 20);
        this.getContentPane().add(newProductTextField);
        newProductTextField.setColumns(10);

        composedProductButton = new JButton("COMPOSED PRODUCT");
        composedProductButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
        composedProductButton.setBounds(270, 194, 169, 23);
        this.getContentPane().add(composedProductButton);

        generateReportButton = new JButton("GENERATE REPORT");
        generateReportButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
        generateReportButton.setBounds(270, 238, 169, 23);
        this.getContentPane().add(generateReportButton);

        viewAllButton = new JButton("VIEW ALL");
        viewAllButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
        viewAllButton.setBounds(270, 282, 169, 23);
        this.getContentPane().add(viewAllButton);

        addButton = new JButton("ADD");
        addButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
        addButton.setBounds(270, 323, 169, 23);
        this.getContentPane().add(addButton);

        deleteButton = new JButton("DELETE");
        deleteButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
        deleteButton.setBounds(270, 368, 169, 23);
        this.getContentPane().add(deleteButton);

        editButton = new JButton("EDIT");
        editButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
        editButton.setBounds(270, 421, 169, 23);
        this.getContentPane().add(editButton);

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

    public String getNewProductTextField() {
        return newProductTextField.getText();
    }

    public void addAddListener(ActionListener action){
        addButton.addActionListener(action);
    }
    public void addEitListener(ActionListener action){
       editButton.addActionListener(action);
    }
    public void addDeleteListener(ActionListener action){
        deleteButton.addActionListener(action);
    }
    public void addComposedListener(ActionListener action){
        composedProductButton.addActionListener(action);
    }
    public void addGenerateListener(ActionListener action){
       generateReportButton.addActionListener(action);
    }
    public void addViewListener(ActionListener action){
       viewAllButton.addActionListener(action);
    }
}
