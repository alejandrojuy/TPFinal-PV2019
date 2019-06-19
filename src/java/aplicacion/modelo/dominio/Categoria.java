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
   private int codigoCate; 
   private  String descripcion;
   private  String nombreCate;
    
    public Categoria() {
    }
//constructor

    public Categoria(int codigoCate, String descripcion, String nombreCate) {
        this.codigoCate = codigoCate;
        this.descripcion = descripcion;
        this.nombreCate = nombreCate;
        
         }
    
   
    //gets y sets 

    public int getCodigoCate() {
        return codigoCate;
    }

    public void setCodigoCate(int codigoCate) {
        this.codigoCate = codigoCate;
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

    @Override
    public String toString() {
        return "Categoria{" + "codigoCate=" + codigoCate + ", descripcion=" + descripcion + ", nombreCate=" + nombreCate + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.codigoCate;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Categoria other = (Categoria) obj;
        if (this.codigoCate != other.codigoCate) {
            return false;
        }
        return true;
    }

     
   

}

