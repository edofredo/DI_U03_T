/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import componenteDatos.ComponenteDatosController;
import javafx.application.Platform;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * Clase controladora de la vista principal de la aplicacion
 * @author Cristian
 */
public class VistaPrincipalController implements Initializable {
    
    @FXML private TextField contrasena;
    @FXML private Button btGenerarContrasena;
    @FXML private Button btNuevosDatos;
    @FXML private Button btSalir;
       
    @FXML private VBox componenteDatos;
    @FXML private ComponenteDatosController componenteDatosController;
    
    /**
     * Método que inicializa la clase controladora.
     * @param url
     * @param rb 
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }  
    
    
    /**Método que genera la contraseña a partir de las entradas del usuario
     * @param event 
     */ 
    @FXML 
    protected void generarContrasena(ActionEvent event){
        try {
            String nom = componenteDatosController.getNombre().substring(0, 1);
            String ape = componenteDatosController.getApellido().substring(0, 3);
            String dni = componenteDatosController.getDni().substring(
                componenteDatosController.getDni().length()-4,
                componenteDatosController.getDni().length());
        
            contrasena.setText((nom+ape+dni).toUpperCase());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en la introducción de datos");
            System.out.println(e);   
        }
    }
    
    /**Método que limpia los campos
     * @param event 
     */ 
    @FXML 
    protected void nuevosDatos(ActionEvent event){
        componenteDatosController.setLimpiarCampos();
        contrasena.setText("");
    }
    
    /**Método para salir de la aplicación
     * @param event 
     */
    @FXML 
    protected void salir(ActionEvent event){
        Platform.exit();
    }
    
}
