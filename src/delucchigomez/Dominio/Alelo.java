/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package delucchigomez.Dominio;

/**
 *
 * @author Matias
 */
public class Alelo {

    private int numero;
    private double porcentaje;

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getNumero() {
        return numero;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public Alelo(int unNumero){
        this.numero = unNumero;
    }
}
