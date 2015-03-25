/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author servidor
 */
public class TelaInicialController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonActionJogar(ActionEvent event) throws IOException {
         Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Jogo.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Vamos ao jogo!");
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(( (Node)event.getSource()).getScene().getWindow());
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
