/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package delucchigomez.Dominio;

/**
 *
 * @author Matias
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Integer cedula;
    private String direccion;
    private String telefono;  

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

     public Persona(String unNombre, String unApellido, Integer unaCedula) {
        this.nombre = unNombre;
        this.apellido = unApellido;
        this.cedula = unaCedula;
    }

     @Override
     public String toString(){
         return this.getApellido() + ", " + this.getNombre();
     }

}
