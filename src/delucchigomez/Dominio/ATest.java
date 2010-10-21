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
public abstract class ATest {
    private ArrayList<Muestra> muestras;

    protected abstract void calcular();
    
    public ATest(){
        this.muestras = new ArrayList<Muestra>();
    }

    public ArrayList<Muestra> getMuestras() {
        return muestras;
    }

    public void agregarMuestra(Muestra unaMuestra){
        this.muestras.add(unaMuestra);
    }

}
