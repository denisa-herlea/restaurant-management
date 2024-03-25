package controllers;

import businessLayer.DeliveryService;
import models.User;
import presentationLayer.RegisterView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RegisterController {

    private RegisterView registerView;
    HashSet<User> users= new HashSet<>();
    private DeliveryService deliveryService=new DeliveryService();


    public RegisterController(RegisterView registerView) throws IOException, ClassNotFoundException {

        this.registerView = registerView;

        this.registerView.addRegisterListener(e-> {

            String username=registerView.getUsernameTextField();
            String password= registerView.getPasswordTextField();

            deliveryService.addUser(username, password);

        });

    }
}
