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
class Sistema {

    private static Sistema instancia;
    private String nombresMicrosatelites[] = new String[] {"CSF1PO","FGA","TH01","TPOX","VWA","D3S1358","D5S818","D7S820","D8S1179","D13S317","D16S539","D18S51","D21S11"};
    private ArrayList<Poblacion> poblaciones;
    private ArrayList<AEstudio> estudios;
    private ArrayList<Persona> personas;
    private ArrayList<Muestra> muestras;

    public static Sistema getInstancia(){
        if (instancia == null)
            instancia = new Sistema();

        return instancia;
    }

    public ArrayList<Poblacion> getPoblaciones() {
        return poblaciones;
    }

    private ArrayList<AEstudio> getEstudios() {
        return estudios;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

     public String[] getNombresMicrosatelites(){
        return nombresMicrosatelites;
    }

    public ArrayList<Muestra> getMuestras() {
        return muestras;
    }

    // Constructor
    private Sistema(){
        this.poblaciones = new ArrayList<Poblacion>();
        this.estudios = new ArrayList<AEstudio>();
        this.personas = new ArrayList<Persona>();
        this.muestras = new ArrayList<Muestra>();
    }

    // Altas
    public void agregarPoblacion(Poblacion unaPoblacion){
        this.getPoblaciones().add(unaPoblacion);
    }

    public void agregarEstudio(AEstudio estudio){
        this.getEstudios().add(estudio);
    }

     public void agregarPersona(Persona unaPersona) {
        this.getPersonas().add(unaPersona);
    }

    // Fin altas

    public Poblacion obtenerPoblacion(String nombrePoblacion) {
        Poblacion poblacion = null;

        for (Poblacion p : this.getPoblaciones()){
            if (p.getNombrePoblacion().equals(nombrePoblacion)){
                poblacion = p;
                break;
            }
        }
        return poblacion;
    }

    public AEstudio obtenerEstudio(String codigoEstudio) {
        AEstudio estudio = null;
        for (AEstudio e : this.getEstudios()){
            if (e.getCodigoEstudio().equals(codigoEstudio)){
                estudio = e;
                break;
            }
        }
        return estudio;
    }

    public Persona obtenerPersona(Integer cedula) {
        Persona persona = null;
        for (Persona p : this.getPersonas()){
            if (p.getCedula() == cedula){
                persona = p;
                break;
            }
        }
        return persona;
    }


    public void agregarMuestra(Muestra muestra) {
        this.getMuestras().add(muestra);
    }

    public Muestra obtenerMuestra(String codigoMuestra) {
        Muestra muestra = null;
        for (Muestra m : this.getMuestras()){
            if (m.getCodigo().equals(codigoMuestra)){
                muestra = m;
                break;
            }
        }
        return muestra;
    }

    
}