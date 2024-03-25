package businessLayer;

import dataLayer.Serializator;
import models.User;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DeliveryService implements IDeliveryServiceProcessing {

    private HashSet<MenuItem> products = new HashSet<>();
    private HashSet<User> users=new HashSet<>();
    private Serializator serializator;



    public DeliveryService() {

        try {
            serializator=new Serializator();
            users = serializator.deserializare("User.txt");
        } catch (ClassNotFoundException | IOException e1) {
            serializator = new Serializator();
            users = new HashSet<>();
            serializator.serializare("User.txt", users);
        }
    }



    public void addUser(String username, String password)
    {
        User user= new User(username,password);
        users.add(user);
        serializator.serializare("User.txt", users);

    }



    public int testare(String usernameTextField, String passwordTextField) throws IOException, ClassNotFoundException {

        serializator.deserializare("User.txt");
        for(User user: users)
            if(user.getUsername().equals(usernameTextField) && user.getPassword().equals(passwordTextField))
                return 1;
            return 0;
    }



    @Override
    public HashSet<MenuItem> baseProductObjects() {

        HashSet<MenuItem> meniu = new HashSet<>();

        try {

            String path = "products.csv";
            File inputF = new File(Paths.get(path).toString());
            InputStream inputFS = new FileInputStream(inputF);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));

            meniu = br.lines()
                    .skip(1)
                    .map(mapToItem)
                    .collect(Collectors.toCollection(HashSet::new));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        serializator.serializareMeniu("Meniu.txt",meniu);
        products=meniu;
        return products;
    }



    private final Function<String, MenuItem> mapToItem = (line) -> {

        String[] values = line.split(",");
        BaseProduct baseProduct = new BaseProduct(null, 0, 0, 0, 0, 0, 0);
        baseProduct.setTitle(values[0]);
        baseProduct.setRatings(Float.parseFloat(values[1]));
        baseProduct.setCalories(Float.parseFloat(values[2]));
        baseProduct.setProteins(Float.parseFloat(values[3]));
        baseProduct.setFats(Float.parseFloat(values[4]));
        baseProduct.setSodium(Float.parseFloat(values[5]));
        baseProduct.setPrice(Float.parseFloat(values[6]));

        return baseProduct;
    };

    public Object[][] getMeniu(){

        HashSet<MenuItem> meniu;
        meniu=baseProductObjects();
        return meniu.stream()
                .map(MenuItem::getProducts)
                .toArray(Object[][]::new);

    }

    public Object[][] getMeniuSpecial(HashSet<MenuItem> produse){

        return produse.stream()
                .map(MenuItem::getProducts)
                .toArray(Object[][]::new);
    }

}