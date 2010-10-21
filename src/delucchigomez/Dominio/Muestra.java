/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package delucchigomez.Dominio;

import java.util.HashMap;

/**
 *
 * @author Matias
 */
public class Muestra {

    private String codigo;
    private Persona persona;
    private HashMap<String, Integer[]> alelosMicrosatelites;

    public String getCodigo() {
        return codigo;
    }

    public Persona getPersona() {
        return persona;
    }

    // Constructor
    public Muestra(String unCodigo, Persona unaPersona){
        this.codigo = unCodigo;
        this.persona = unaPersona;        
        this.alelosMicrosatelites = new HashMap<String, Integer[]>();
    }

    public void agregarValorMuestra(String nombreMicrosatelite, Integer[] valoresAlelos){        
        this.alelosMicrosatelites.put(nombreMicrosatelite, valoresAlelos);
    }

    public Integer[] obtenerValoresAlelos(String nombreMicrosatelite){
        return this.alelosMicrosatelites.get(nombreMicrosatelite);
    }
}
