/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componenteDatos;

import componenteRestriccion.RestrictiveTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 * Clase controladora del componente ComponenteDatos
 * @author Cristian
 */
public class ComponenteDatosController implements Initializable {

    
    @FXML private TextField tfNombre;
    @FXML private TextField tfApellido;
    @FXML private TextField tfDNI;
        
    /**
     * Método que inicializa la clase controladora.
     * @param url objeto de tipo URL
     * @param rb objeto de tipo ResourceBundle
     */ 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    /**
     * Método que devuelve el nombre.
     * @return tfNombre
     */
    public String getNombre(){
        String nom = tfNombre.getText();
        return nom;
    }
    
    /**
     * Método que devuelve el apellido.
     * @return tfApellido
     */
    public String getApellido(){
        String nom = tfApellido.getText();
        return nom;
    }
    
    /**
     * Método que devuelve el dni.
     * @return tfDNI
     */
    public String getDni(){
        String nom = tfDNI.getText();
        return nom;
    }
    
    /**
     * Método que limpia todos los campos.
     */
    public void setLimpiarCampos(){
        tfNombre.setText("");
        tfApellido.setText("");
        tfDNI.setText("");
        
    }
    
}
