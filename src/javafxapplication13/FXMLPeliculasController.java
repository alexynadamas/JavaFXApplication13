/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication13;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Alex Clemente < DAW >
 */
public class FXMLPeliculasController implements Initializable {

    @FXML
    private TextField idActor;
    @FXML
    private Button editar;
    @FXML
    private Button anterior;
    @FXML
    private Button siguiente;
    @FXML
    private Button anyadirNuevo;
    @FXML
    private Button guardar;
    @FXML
    private Button cancelar;
    @FXML
    private TextField nombre;
    @FXML
    private TextField apellido;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
