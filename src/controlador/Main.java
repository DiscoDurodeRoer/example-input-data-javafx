/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Fernando
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/vista/EjemplPedirDatosVista.fxml"));
            // Cargo la ventana
            Pane ventana = (Pane) loader.load();

            // Cargo el scene
            Scene scene = new Scene(ventana);

            // Seteo la scene y la muestro
            primaryStage.setScene(scene);
            primaryStage.setTitle("Ejemplo pedir datos");
            primaryStage.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}