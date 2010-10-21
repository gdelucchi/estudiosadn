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
public class Usuario {

    private String nombreUsuario;
    private String password;
    private String nombre;

    ArrayList<Rol> listaRoles;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreUsuario(){
        return nombreUsuario;
    }

    public void setNombreUsuario(String unNombreUsuario){
        this.nombreUsuario = unNombreUsuario;
    }

    // Constructor
    public Usuario(){
        this.listaRoles = new ArrayList<Rol>();
    }
    


}
