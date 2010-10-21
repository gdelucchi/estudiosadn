/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package delucchigomez.Dominio;

import java.util.*;

/**
 *
 * @author Matias
 */
public class FachadaDominio {   
    
    public static void altaPoblacion(String nombrePoblacion, HashMap<String, Integer[]> rangoMicro, HashMap<String, Double[]> valAlelos){
        Poblacion nuevaPoblacion = new Poblacion(nombrePoblacion);

        for (String key : rangoMicro.keySet()){
            int min = rangoMicro.get(key)[0];
            int max = rangoMicro.get(key)[1];

            Microsatelite m = new Microsatelite(nuevaPoblacion, key);
            m.setMin(min);
            m.setMax(max);

            Double[] valoresAlelos = valAlelos.get(key);
            for (int i = 0; i < valoresAlelos.length; i++){
                Alelo a = new Alelo(min + i);
                a.setPorcentaje(valoresAlelos[i]);

                m.agregarAlelo(a);
            }

            nuevaPoblacion.agregarMicrosatelite(m);
        }

         Sistema.getInstancia().agregarPoblacion(nuevaPoblacion);
    }

    public static void altaPersona(String nombre, String apellido, Integer cedula, String direccion, String telefono) throws Exception{
        nombre = nombre.trim();
        apellido = apellido.trim();
        direccion = direccion.trim();
        telefono = telefono.trim();

        if (Sistema.getInstancia().obtenerPersona(cedula) != null)
            throw new Exception("Ya existe una persona con la cédula ingresada");

        Persona persona = new Persona(nombre, apellido, cedula);
        persona.setDireccion(direccion);
        persona.setTelefono(telefono);

        Sistema.getInstancia().agregarPersona(persona);
    }

    public static void altaEstudioPaternidad(String codigoEstudio, String codigoMuestraMadre, String codigoMuestraHijo, String codigoMuestraPresuntoPadre){
        Muestra muestraMadre = Sistema.getInstancia().obtenerMuestra(codigoMuestraMadre);
        Muestra muestraHijo = Sistema.getInstancia().obtenerMuestra(codigoMuestraHijo);
        Muestra muestraPresuntoPadre = Sistema.getInstancia().obtenerMuestra(codigoMuestraPresuntoPadre);

        EstudioPaternidad estudioPaternidad = new EstudioPaternidad(codigoEstudio, muestraMadre, muestraHijo, muestraPresuntoPadre);

        Sistema.getInstancia().agregarEstudio(estudioPaternidad);
    }

    // Gets
    public static ArrayList<Poblacion> getPoblaciones(){
        return Sistema.getInstancia().getPoblaciones();
    }

    public static ArrayList<Persona> getPersonas() {
        return Sistema.getInstancia().getPersonas();
    }

    public static ArrayList<Muestra> getMuestras(){
        return Sistema.getInstancia().getMuestras();
    }
    // Fin Gets

    public static void realizarTestPaternidad(String codigoEstudio, String nombrePoblacion, HashMap<String, Integer[]> hashMuestraMadre, HashMap<String, Integer[]> hashMuestraHijo, HashMap<String, Integer[]> hashMuestraPresuntoPadre){
        Poblacion poblacion = Sistema.getInstancia().obtenerPoblacion(nombrePoblacion);
        EstudioPaternidad estudio = (EstudioPaternidad)Sistema.getInstancia().obtenerEstudio(codigoEstudio);

        for (String key : hashMuestraMadre.keySet()){
            estudio.getMuestraMadre().agregarValorMuestra(key, hashMuestraMadre.get(key));
            estudio.getMuestraHijo().agregarValorMuestra(key, hashMuestraHijo.get(key));
            estudio.getMuestraPresuntoPadre().agregarValorMuestra(key, hashMuestraPresuntoPadre.get(key));
        }
        
        TestPaternidad testPaternidad = new TestPaternidad(poblacion, estudio);
        testPaternidad.calcular();
    }
   
    public static void mapearCodigoMuestra(String codigoMuestra, Persona persona){
        Muestra muestra = new Muestra(codigoMuestra, persona);
        Sistema.getInstancia().agregarMuestra(muestra);
    }   
}
