/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package delucchigomez.Dominio;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author Matias
 */
public class TestPaternidad extends ATest {

    private final int INT_NoCoincidenciasPermitidas = 2;  

    private Poblacion poblacion;
    private EstudioPaternidad estudioPaternidad;
    private Double resultado;
    
    public EstudioPaternidad getEstudioPaternidad() {
        return estudioPaternidad;
    }

    public Muestra getMuestraHijo() {
        return getEstudioPaternidad().getMuestraHijo();
    }

    public Muestra getMuestraMadre() {
        return getEstudioPaternidad().getMuestraMadre();
    }

    public Muestra getMuestraPresuntoPadre() {
        return getEstudioPaternidad().getMuestraPresuntoPadre();
    }

    public Poblacion getPoblacion() {
        return poblacion;
    }

    public Double getResultado() {
        return resultado;
    }

    private void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    // Constructor
    //public TestPaternidad(Poblacion unaPoblacion, Muestra muestraMadre, Muestra muestraHijo, Muestra muestraPresuntoPadre){
    public TestPaternidad(Poblacion unaPoblacion, EstudioPaternidad estudioPaternidad){
        this.poblacion = unaPoblacion;
        this.estudioPaternidad = estudioPaternidad;
    }

    /* Cálculo:
     *  1. Para cada microsatélite calcular IP = [P(H/M * Pp)] / RMP;
     *  2. Multiplicar los IP obtenidos para obtener el IPC
     *  3. W = IPC / (IPC + 1)
     */
    @Override
    protected void calcular() {
        int contadorNoCoincidencias = 0;

        HashMap<String, Double> indicesPaternidad = new HashMap<String, Double>(14);

        // Primero se calculan los IP para cada microsatelite
        for (Microsatelite m : this.getPoblacion().getMicrosatelites()){

            Integer[] alelosMadre = this.getMuestraMadre().obtenerValoresAlelos(m.getNombre());
            Integer[] alelosHijo = this.getMuestraHijo().obtenerValoresAlelos(m.getNombre());
            Integer[] alelosPresuntoPadre = this.getMuestraPresuntoPadre().obtenerValoresAlelos(m.getNombre());

            int aleloHeredadoPadre = obtenerAleloHeredadoPadre(alelosMadre, alelosHijo, alelosPresuntoPadre);
            if (aleloHeredadoPadre == -1){
                contadorNoCoincidencias++;
                if (contadorNoCoincidencias < INT_NoCoincidenciasPermitidas)
                    indicesPaternidad.put(m.getNombre(), 1.0);
                else
                {
                    // Se alcanzó el numero de no coincidencias, caso de EXCLUSION.
                    indicesPaternidad.put(m.getNombre(), 0.0);
                    break;
                }
            }
            else{
                Double porcentajeAleloHeredadoPadre = m.obtenerPorcentajeAlelo(aleloHeredadoPadre);
                Double ip = porcentajeAleloHeredadoPadre / m.getRMP();
                indicesPaternidad.put(m.getNombre(), ip);
            }
        }

        // Con los IP calculados, se obtiene el IPC y con eso se calcula W
        Double ipc = 1.0;
        for (Double ip : indicesPaternidad.values()){
            ipc = ipc * ip;
        }

        Double w = ipc / (ipc + 1);
        this.setResultado(w);
    }

    private int obtenerAleloHeredadoPadre(Integer[] alelosMadre, Integer[] alelosHijo, Integer[] alelosPresuntoPadre) {
        int aleloHeredadoPadre = -1;
        
        Arrays.sort(alelosHijo);
        Arrays.sort(alelosMadre);
        Arrays.sort(alelosPresuntoPadre);

        if (sonIguales(alelosHijo, alelosMadre)){
            aleloHeredadoPadre = aleloHeredado(alelosHijo, alelosPresuntoPadre);
        }
        else{
            int aleloHeredadoMadre = aleloHeredado(alelosHijo, alelosMadre);            
            int aleloNoHeradoMadre = alelosMadre[0];

            if (aleloHeredadoMadre == alelosMadre[0]){
                aleloNoHeradoMadre = alelosMadre[1];
            }

            if (alelosPresuntoPadre[0] == aleloNoHeradoMadre)
                aleloHeredadoPadre = alelosPresuntoPadre[0];
            else{
                if (alelosPresuntoPadre[1] == aleloNoHeradoMadre)
                    aleloHeredadoPadre = alelosPresuntoPadre[1];
            }
        }

        return aleloHeredadoPadre;
    }

    private int aleloHeredado(Integer[] alelosHijo, Integer[] alelosProgenitor) {
        int aleloHeredado = -1;
        for (int i = 0; i < alelosHijo.length; i++){
            for (int j = 0; j < alelosProgenitor.length; j++){
                if (alelosHijo[i] == alelosProgenitor[j]){
                    aleloHeredado = alelosHijo[i];
                    break;
                }
            }

            if (aleloHeredado != -1) //Encontró una coinidencia no es necesario seguir buscando
                 break;
        }

        return aleloHeredado;
    }

    private boolean sonIguales(Integer[] array1, Integer[] array2) {
        boolean iguales = true;
        for (int i = 0; i < array1.length; i++){
           if (array1[i] != array2[i]){
               iguales = false;
               break;
           }
        }
        return iguales;
    }
}
