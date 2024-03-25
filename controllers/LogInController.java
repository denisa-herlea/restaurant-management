package controllers;

import businessLayer.DeliveryService;
import models.User;
import presentationLayer.AdministratorView;
import presentationLayer.ClientView;
import presentationLayer.LogInView;
import presentationLayer.RegisterView;

import java.io.IOException;
import java.util.ArrayList;

public class LogInController {

    private LogInView logInView;
    private RegisterController registerController;
    private DeliveryService deliveryService=new DeliveryService();

    public LogInController(LogInView logInView) throws IOException, ClassNotFoundException {

        this.logInView = logInView;

        this.logInView.addRegisterListener(e-> {

           RegisterView registerView = new RegisterView();
            try {
                RegisterController registerController= new RegisterController(registerView);
            } catch (IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        });


        this.logInView.addAdministratorListener(e->{

           AdministratorView administratorView=new AdministratorView();
            try {
                AdministratorController administratorController=new AdministratorController(administratorView);
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        });



        this.logInView.addClientListener(e->{

           int ok=0;
            try {

                ok= deliveryService.testare(logInView.getUsernameTextField(), logInView.getPasswordTextField());

                if(ok==1)
                {
                    ClientView clientView=new ClientView();
                    ClientController clientController=new ClientController(clientView);}
                else System.out.println("Date invalide!");
            } catch (IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        });


        this.logInView.addEmployeeListener(e->{

        });

        }
  }
