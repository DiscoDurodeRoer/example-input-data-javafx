/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;

public class EjemplPedirDatosController implements Initializable {
    
    @FXML
    private Button btnAccion;
    @FXML
    private TextField txtValor;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    private void insertarValor(ActionEvent event) {

        TextInputDialog tid = new TextInputDialog();
        tid.setHeaderText(null);
        tid.setTitle("Insertar");
        tid.setContentText("Introduce un valor");
        Optional<String> texto = tid.showAndWait();
        
        this.txtValor.setText("El valor introducido es " + texto.get());
        
    }
    
}
