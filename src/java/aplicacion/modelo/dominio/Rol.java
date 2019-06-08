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
public class Rol implements Serializable {

    private int codigo;
    private String tipoRol;
    private String descripcion;
    private String borrado;

    //Constructores
    public Rol() {
    }

    public Rol(int codigo, String tipoRol, String descripcion, String borrado) {
        this.codigo = codigo;
        this.tipoRol = tipoRol;
        this.descripcion = descripcion;
        this.borrado = borrado;
    }

    //Getters & Setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipoRol() {
        return tipoRol;
    }

    public void setTipoRol(String tipoRol) {
        this.tipoRol = tipoRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getBorrado() {
        return borrado;
    }

    public void setBorrado(String borrado) {
        this.borrado = borrado;
    }

    

}
