/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication13;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;

/**
 *
 * @author Alex Clemente < DAW >
 */
public class FXMLDocumentController implements Initializable {
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    /**
     * Carga el contenido dependiendo de la pestaña activa
     * 
     * @param event 
     */
    @FXML
    private void cambiarTab(Event event) {
        String pestanya = ((Tab)event.getSource()).getText();  
        try {
            switch (pestanya) {
                case "Películas":
                    pestanya = "FXMLPeliculas.fxml";
                    break;
                case "Actores":
                    pestanya = "FXMLActores.fxml";
                    break;
            }
            ((Tab)event.getSource()).setContent(FXMLLoader.load(getClass().getResource(pestanya)));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
