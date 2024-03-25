package controllers;

import businessLayer.BaseProduct;
import businessLayer.CompositeProduct;
import businessLayer.DeliveryService;
import businessLayer.MenuItem;
import dataLayer.Serializator;
import presentationLayer.AdministratorView;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class AdministratorController {

    private AdministratorView administratorView;
    HashSet<MenuItem> meniu;
    private DeliveryService deliveryService=new DeliveryService();
    public JFrame myFrame = new JFrame();
    private JTable table=new JTable();
    private Serializator serializator=new Serializator();

    public AdministratorController(AdministratorView administratorView) throws IOException, ClassNotFoundException {


        this.administratorView=administratorView;
        meniu=deliveryService.baseProductObjects();


        this.administratorView.addAddListener(e -> {

            BaseProduct baseProduct=citireDate();

            try {
                meniu=serializator.deserializareMeniu("Meniu.txt");
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

            HashSet<MenuItem> products;
            products=meniu.stream()
                    .filter(produs->produs.getTitle().equals(baseProduct.getTitle()))
                    .collect(Collectors.toCollection(HashSet::new));

            meniu.removeAll(products);
            meniu.add(baseProduct);
            serializator.serializareMeniu("Meniu.txt", meniu);
            //System.out.println(meniu.size());


        });


        this.administratorView.addDeleteListener(e -> {

            BaseProduct baseProduct=new BaseProduct(administratorView.getTitleTextField(), 0,0,0,0,0,0);

            try {
                meniu=serializator.deserializareMeniu("Meniu.txt");
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }


            HashSet<MenuItem> products;
            products=meniu.stream()
                    .filter(produs->produs.getTitle().equals(baseProduct.getTitle()))
                    .collect(Collectors.toCollection(HashSet::new));

            meniu.removeAll(products);
            //System.out.println(meniu.size());
            serializator.serializareMeniu("Meniu.txt", meniu);

        });

        this.administratorView.addEitListener(e -> {

            BaseProduct baseProduct=citireDate();

            try {
                meniu=serializator.deserializareMeniu("Meniu.txt");
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

            HashSet<MenuItem> produse;
            produse =meniu.stream()
                    .filter(produs->produs.getTitle().equals(baseProduct.getTitle()))
                    .collect(Collectors.toCollection(HashSet::new));

            meniu.removeAll(produse);
            meniu.add(baseProduct);
           // System.out.println(meniu.size());
            serializator.serializareMeniu("Meniu.txt", meniu);

        });

        this.administratorView.addGenerateListener(e -> {


        });

        this.administratorView.addViewListener(e -> {

            try {
                meniu= serializator.deserializareMeniu("Meniu.txt");
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

            Object[][] produse=meniu.stream()
                    .map(MenuItem::getProducts)
                    .toArray(Object[][]::new);

            buildTable(produse,"MENIU");

        });


        this.administratorView.addComposedListener(e -> {


            String newProductTitle= administratorView.getNewProductTextField();
            CompositeProduct compositeProduct = new CompositeProduct(null,0,0,0,0,0,0);

            Float ratings=0.0f;
            Float calories=0.0f;
            Float proteins=0.0f;
            Float fats=0.0f;
            Float sodium=0.0f;
            Float price=0.0f;

            int[] indiciProduseSelectate = table.getSelectedRows();

            for(int i=0; i<indiciProduseSelectate.length; i++){

                ratings=ratings+Float.parseFloat(table.getModel().getValueAt(indiciProduseSelectate[i], 1).toString());
                calories=calories+Float.parseFloat(table.getValueAt(indiciProduseSelectate[i], 2).toString());
                proteins=proteins +Float.parseFloat(table.getValueAt(indiciProduseSelectate[i], 3).toString());
                fats=fats+Float.parseFloat(table.getValueAt(indiciProduseSelectate[i], 4).toString());
                sodium=sodium+Float.parseFloat(table.getValueAt(indiciProduseSelectate[i], 5).toString());
                price=price+Float.parseFloat(table.getValueAt(indiciProduseSelectate[i], 6).toString());
            }

            compositeProduct.setTitle(newProductTitle);
            compositeProduct.setCalories(calories);
            compositeProduct.setProteins(proteins);
            compositeProduct.setRatings(ratings);
            compositeProduct.setFats(fats);
            compositeProduct.setSodium(sodium);
            compositeProduct.setPrice(price);

            meniu.add(compositeProduct);

            Object[][] produse=meniu.stream()
                    .map(MenuItem::getProducts)
                    .toArray(Object[][]::new);

            buildTable(produse,"MENIU");

        });

    }


    public BaseProduct citireDate(){

        String title= administratorView.getTitleTextField();
        String ratings=administratorView.getRatingTextField();
        String calories=administratorView.getCaloriesTextField();
        String proteins= administratorView.getProteinTextField();
        String fats= administratorView.getFatTextField();
        String sodium= administratorView.getSodiumTextField();
        String price= administratorView.getPriceTextField();

        BaseProduct baseProduct= new BaseProduct(null,0,0,0,0,0,0);

        baseProduct.setCalories(Float.parseFloat(calories));
        baseProduct.setFats(Float.parseFloat(fats));
        baseProduct.setPrice(Float.parseFloat(price));
        baseProduct.setRatings(Float.parseFloat(ratings));
        baseProduct.setSodium(Float.parseFloat(sodium));
        baseProduct.setProteins(Float.parseFloat(proteins));
        baseProduct.setTitle(title);

        return baseProduct;
    }

    public void buildTable(Object[][] produse, String title){

        String[] columnNames={"Title", "Rating", "Calories", "Protein", "Fat", "Sodium", "Price"};

        //JTable table;
        JPanel fereastra = new JPanel();
        table = new JTable(produse,columnNames);
        JScrollPane jsp = new JScrollPane(table);
        myFrame.getContentPane().add(jsp);

        fereastra.setLayout(new BorderLayout());
        fereastra.add(jsp);
        myFrame.setContentPane(fereastra);
        myFrame.setTitle(title);
        myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        myFrame.setSize(1500, 600);
        myFrame.setVisible(true);

    }

}
