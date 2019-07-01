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
    private Categoria categoria; 
    private int stock;
    private String marca;
    private String nombre;
    private String descripcion;
    private String deposito;
    private boolean estado;//esta variable es si lo activo para venderlo o lo desactivo para q no figure mas
    private String imagenProducto;
    public Producto() {
    }
    //constructor 

    public Producto(int codigo, double precio, Categoria categoria, int stock, String marca, String nombre, String descripcion, String deposito, boolean estado,String imagenProducto) {
        this.codigo = codigo;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
        this.marca = marca;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.deposito = deposito;
        this.estado = estado;
        this.imagenProducto = imagenProducto;
    }
    public Producto(int codigo,String imagenProducto, String nombre) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.imagenProducto = imagenProducto;
    }
    // gets y sets 

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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDeposito() {
        return deposito;
    }

    public void setDeposito(String deposito) {
        this.deposito = deposito;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getImagenProducto() {
        return imagenProducto;
    }

    public void setImagenProducto(String imagenProducto) {
        this.imagenProducto = imagenProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", precio=" + precio + ", categoria=" + categoria + ", stock=" + stock + ", marca=" + marca + ", nombre=" + nombre + ", descripcion=" + descripcion + ", deposito=" + deposito + ", estado=" + estado + ", imagenProducto=" + imagenProducto + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + this.codigo;
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
        final Producto other = (Producto) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    
}
