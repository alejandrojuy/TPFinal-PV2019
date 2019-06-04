/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author jaimito
 */
public class Rol implements Serializable{
    private String rol_tipo;
    private String rol_detalle;

    public Rol() {
    }

    public Rol(String rol_tipo, String rol_detalle) {
        this.rol_tipo = rol_tipo;
        this.rol_detalle = rol_detalle;
    }

    public String getRol_tipo() {
        return rol_tipo;
    }

    public void setRol_tipo(String rol_tipo) {
        this.rol_tipo = rol_tipo;
    }

    public String getRol_detalle() {
        return rol_detalle;
    }

    public void setRol_detalle(String rol_detalle) {
        this.rol_detalle = rol_detalle;
    }
    
    
    
}
