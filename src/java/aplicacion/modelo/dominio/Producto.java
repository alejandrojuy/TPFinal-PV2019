/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author jaimito
 */
public class Producto implements Serializable{
    private int    codigo;
    private String marca;
    private String nombre;
    private double precio;
    private int    stock;
    private String deposito;
    private String estado;//esta variable es si lo activo para venderlo o lo desactivo para q no figure mas
    private Categoria categoria; 
    public Producto() {
    }
    //constructor
    public Producto(int codigo, String marca, String nombre, double precio, int stock, String deposito, String estado, Categoria categoria) {
        this.codigo = codigo;
        this.marca = marca;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.deposito = deposito;
        this.estado = estado;
        this.categoria = categoria;
    }

    public Producto(int codigo,double precio, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    //gets y sets 

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDeposito() {
        return deposito;
    }

    public void setDeposito(String deposito) {
        this.deposito = deposito;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    

   @Override
    public String toString() {
        return "Codigo: "+ this.codigo+" "+ "Nombre: "+this.nombre+" "+"Precio: "+" "+ this.precio;
    }
    
   
}