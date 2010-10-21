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
public class Microsatelite {

    private Poblacion poblacion;
    private String nombre;
    private double min;
    private double max;
    private ArrayList<Alelo> alelos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }    

    public Poblacion getPoblacion() {
        return poblacion;
    }    

    // Constructor
    public Microsatelite(Poblacion unaPoblacion, String unNombre){
        this.poblacion = unaPoblacion;
        this.nombre = unNombre;
        this.alelos = new ArrayList<Alelo>();
    }
    
    public void agregarAlelo(Alelo unAlelo){
        this.alelos.add(unAlelo);
    }

    // Random Match Probability: Productoria de los porcentajes del rango
    public double getRMP(){
        double rmp = 1;
        for (Alelo alelo : this.alelos){
            rmp = rmp * alelo.getPorcentaje();
        }
        return rmp;
    }

    public double obtenerPorcentajeAlelo(int numeroAlelo){
        double porcentaje = 1.0;
        for (Alelo a : this.alelos){
            if (a.getNumero() == numeroAlelo){
                porcentaje = a.getPorcentaje();
                break;
            }
        }
        return porcentaje;
    }
}
