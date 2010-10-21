/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package delucchigomez.Interfaz;

import delucchigomez.Dominio.FachadaDominio;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matias
 */
public class CrearDatos {

    public CrearDatos(){
        CrearPersonas(10);
        CrearMuestras(3);
    }

    void CrearPersonas(int total){
    for (int i = 1; i <= 10; i++){
            try {
                FachadaDominio.altaPersona("Nombre " + i, "Apellido " + i, i, "Direccion " + i, "Telefono " + i);
            } catch (Exception ex) {
                Logger.getLogger(CrearDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
   }

    private void CrearMuestras(int i) {
        
    }
}
