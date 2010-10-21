/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package delucchigomez.Dominio;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Poblacion {

    private String nombre;
    private ArrayList<Microsatelite> microsatelites;

    public String getNombrePoblacion() {
        return nombre;
    }

    public ArrayList<Microsatelite> getMicrosatelites() {
        return microsatelites;
    }

    // Constructor
    public Poblacion(String unNombrePoblacion){
        this.nombre = unNombrePoblacion;
    }

    public void agregarMicrosatelite(Microsatelite unMicrosatelite){
        this.microsatelites.add(unMicrosatelite);
    }

}
