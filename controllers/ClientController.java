package controllers;

import businessLayer.DeliveryService;
import businessLayer.MenuItem;
import dataLayer.Serializator;
import presentationLayer.ClientView;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.HashSet;
import java.util.stream.Collectors;

public class ClientController {

    private ClientView clientView;
    public JFrame myFrame = new JFrame();
    DeliveryService deliveryService=new DeliveryService();
    Serializator serializator=new Serializator();


    public ClientController(ClientView clientView) throws IOException, ClassNotFoundException {

        this.clientView=clientView;

        this.clientView.addCreateOrderListener(e -> {



        });
        this.clientView.addSearchListener(e -> {


            String title= clientView.getTitleTextField();
            String ratings= clientView.getRatingTextField();
            String calories= clientView.getCaloriesTextField();
            String proteins= clientView.getProteinTextField();
            String fats= clientView.getFatTextField();
            String sodium= clientView.getSodiumTextField();
            String price= clientView.getPriceTextField();

            if(!title.isEmpty()){


                HashSet<MenuItem> meniu=new HashSet<>();

                try {
                    meniu= serializator.deserializareMeniu("Meniu.txt");
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }

                HashSet<MenuItem> productsTitle;
                productsTitle=meniu.stream()
                        .filter(produs->produs.getTitle().contains(title))
                        .collect(Collectors.toCollection(HashSet::new));

                Object[][] produse=deliveryService.getMeniuSpecial(productsTitle);
                buildTable(produse,"Menu: Title");

            }


            if(!ratings.isEmpty()){


                HashSet<MenuItem> meniu=new HashSet<>();

                try {
                    meniu= serializator.deserializareMeniu("Meniu.txt");
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }


                HashSet<MenuItem> productsRatings;
                productsRatings=meniu.stream()
                        .filter(produs->produs.getRatings()==Float.parseFloat(ratings))
                        .collect(Collectors.toCollection(HashSet::new));


                Object[][] produse=deliveryService.getMeniuSpecial(productsRatings);
                buildTable(produse,"Menu: Ratings");

            }


            if(!calories.isEmpty()){


                HashSet<MenuItem> meniu=new HashSet<>();

                try {
                    meniu= serializator.deserializareMeniu("Meniu.txt");
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }

                HashSet<MenuItem> products;
                products=meniu.stream()
                        .filter(produs->produs.getCalories()==Float.parseFloat(calories))
                        .collect(Collectors.toCollection(HashSet::new));


                Object[][] produse=deliveryService.getMeniuSpecial(products);
                buildTable(produse,"Menu: Calories");


            }


            if(!proteins.isEmpty()){

                HashSet<MenuItem> meniu=new HashSet<>();

                try {
                    meniu= serializator.deserializareMeniu("Meniu.txt");
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }

                HashSet<MenuItem> products;
                products=meniu.stream()
                        .filter(produs->produs.getProteins()==Float.parseFloat(proteins))
                        .collect(Collectors.toCollection(HashSet::new));


                Object[][] produse=deliveryService.getMeniuSpecial(products);
                buildTable(produse,"Menu: Proteins");

            }


            if(!fats.isEmpty()){


                HashSet<MenuItem> meniu=new HashSet<>();

                try {
                    meniu= serializator.deserializareMeniu("Meniu.txt");
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }

                HashSet<MenuItem> products;
                products=meniu.stream()
                        .filter(produs->produs.getFats()==Float.parseFloat(fats))
                        .collect(Collectors.toCollection(HashSet::new));


                Object[][] produse=deliveryService.getMeniuSpecial(products);
                buildTable(produse,"Menu: Fats");

            }


            if(!sodium.isEmpty()){


                HashSet<MenuItem> meniu=new HashSet<>();

                try {
                    meniu= serializator.deserializareMeniu("Meniu.txt");
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }

                HashSet<MenuItem> products;
                products=meniu.stream()
                        .filter(produs->produs.getSodium()==Float.parseFloat(sodium))
                        .collect(Collectors.toCollection(HashSet::new));


                Object[][] produse=deliveryService.getMeniuSpecial(products);
                buildTable(produse,"Menu: Sodium");

            }


            if(!price.isEmpty()){


                HashSet<MenuItem> meniu=new HashSet<>();

                try {
                    meniu= serializator.deserializareMeniu("Meniu.txt");
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }

                HashSet<MenuItem> products;
                products=meniu.stream()
                        .filter(produs->produs.getPrice()==Float.parseFloat(price))
                        .collect(Collectors.toCollection(HashSet::new));


                Object[][] produse=deliveryService.getMeniuSpecial(products);
                buildTable(produse,"Menu: Price");

            }

        });

        this.clientView.addViewMenuListener(e -> {

            HashSet<MenuItem> meniu = new HashSet<>();
            try {
                meniu=serializator.deserializareMeniu("Meniu.txt");
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

    }

    public void buildTable(Object[][] produse, String title){

        String[] columnNames={"Title", "Rating", "Calories", "Protein", "Fat", "Sodium", "Price"};
        JTable table;
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
