package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class Controller {

@FXML
private Label label1;

    @FXML
    private void doIT(ActionEvent event) {
        System.out.println("You clicked me!");
        label1.setText("Hello World!");
    }

}
