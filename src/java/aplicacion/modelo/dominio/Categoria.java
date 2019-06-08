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
public class Categoria  implements Serializable{
   private int codigoCategoria; 
   private  String descripcion;
   private  String nombreCate;

    public Categoria() {
    }
//constructor
    public Categoria(int codigoCategoria, String descripcion, String nombreCate) {
        this.codigoCategoria = codigoCategoria;
        this.descripcion = descripcion;
        this.nombreCate = nombreCate;
    }
   
    //gets y sets 

    public int getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(int codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreCate() {
        return nombreCate;
    }

    public void setNombreCate(String nombreCate) {
        this.nombreCate = nombreCate;
    }


}

