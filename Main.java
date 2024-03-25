import businessLayer.DeliveryService;
import controllers.LogInController;
import presentationLayer.LogInView;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        LogInView logInView=new LogInView();
        LogInController logInController=new LogInController(logInView);
       // DeliveryService d=new DeliveryService();
    }
}
