/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package delucchigomez.Dominio;

/**
 *
 * @author Matias
 */
public class EstudioPaternidad extends AEstudio {

    private Muestra muestraMadre;
    private Muestra muestraHijo;

    public Muestra getMuestraHijo() {
        return muestraHijo;
    }

    public Muestra getMuestraMadre() {
        return muestraMadre;
    }

    public Muestra getMuestraPresuntoPadre() {
        return muestraPresuntoPadre;
    }
    private Muestra muestraPresuntoPadre;

    // Constructor
    public EstudioPaternidad(String unCodigoEstudio, Muestra unaMuestraMadre, Muestra unaMuestraHijo,Muestra unaMuestraPresuntoPadre){
        super(unCodigoEstudio);

        
    }
}
