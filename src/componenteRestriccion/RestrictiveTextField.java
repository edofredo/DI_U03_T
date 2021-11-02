/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componenteRestriccion;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;

/**s
 * Creación de restricciones para campos de texto
 * @author Cristian
 */

public class RestrictiveTextField extends TextField {

    /**
     * Restricción para la longitud, valor por defecto -1
     */
    private IntegerProperty longitud = 
                new SimpleIntegerProperty(this, "longitud", -1);

    /**
     * Restricción para el patrón
     */
    private StringProperty patron = new SimpleStringProperty(this, "patron");

    
    /**
     * Método que establece un listner sobre el TextField para controlar las
     * restricciones declaradas
     */
    public RestrictiveTextField() { 
        textProperty().addListener(new ChangeListener<String>() {
        private boolean ignore;

        @Override
        public void changed(ObservableValue<? extends String> observableValue,
                            String s, String s1) {
          if (ignore || s1 == null)
            return;
          if (longitud.get() > -1 && s1.length() > longitud.get()) {
            ignore = true;
            setText(s1.substring(0, longitud.get()));
            ignore = false;
          }

          if (patron.get()!=null) {
            if (!patron.get().equals("") && !s1.matches(patron.get() + "*")) {
              ignore = true;
              setText(s);
              ignore = false;
            }
          }
        }
      });
    }

    /**
     * Método que devuelve la propiedad longitud
     * @return longitud
     */
    public IntegerProperty longitudProperty() { return longitud; }

    /**
     * Método que devuelve la longitud declarada
     * @return entero de longitud
     */    
    public int getLongitud() { return longitud.get(); }

    /**
     * Método que establece la longitud
     */
    public void setLongitud(int longitud) { this.longitud.set(longitud); }

    /**
     * Método que devuelve la propiedad patron
     * @return patron
     */
    public StringProperty patronProperty() { return patron; }

    /**
     * Método que devuelve el patrón declarada
     * @return cadena de patron
     */
    public String getPatron() { return patron.get(); }

    /**
     * Método que establece el patrón
       */
    public void setPatron(String patron) { this.patron.set(patron); }
}