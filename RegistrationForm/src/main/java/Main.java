import Controller.Controller;
import Model.Model;
import View.View;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view, model);
        controller.processUser();
    }
}
