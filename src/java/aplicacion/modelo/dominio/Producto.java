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
public class Producto implements Serializable{
    private int codigo;
    private double precio;
    private String nombrePro;

    public Producto() {
    }

    
    public Producto(int codigo, double precio, String nombrePro) {
        this.codigo = codigo;
        this.precio = precio;
        this.nombrePro = nombrePro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    @Override
    public String toString() {
        return "codigo: "+this.codigo +" "+ "nombre del Producto: "+ this.getNombrePro()+" "+"Precio del Producto: "+" "+this.precio;   
                }
    
    
    
}
