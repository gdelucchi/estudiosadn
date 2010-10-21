/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package delucchigomez.Dominio;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Matias
 */
public abstract class AEstudio {

    private Date fechaCreacion;
    //private ATest test;
    private String codigoEstudio;
    private ArrayList<Muestra> muestras;

    /*
    public ATest getTest() {
        return test;
    }*/

    public ArrayList<Muestra> getMuestras() {
        return muestras;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public String getCodigoEstudio() {
        return this.codigoEstudio;
    }

    public AEstudio(String unCodigoEstudio){ //, ATest unTest){
        this.codigoEstudio = unCodigoEstudio;
        //this.test = unTest;
        this.muestras = new ArrayList<Muestra>();
        this.fechaCreacion = new Date(); // Fecha y hora de creacion del estudio
    }

    public void agregarMuestra(Muestra unaMuestra){
        this.muestras.add(unaMuestra);
    }


}
