/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jaimito
 */
public class Oferta implements Serializable{
    private int codigoOferta;
    private Date fechaInicio;
    private Date fechaFin;
    private String nombreOferta;
    private Producto productoEnOferta;
    private List<Producto> listadoOfertas;
    private double precioOferta;

    //constructors
    public Oferta() {
    listadoOfertas = new ArrayList();
    
    }

    public Oferta(int codigoOferta, Date fechaInicio, Date fechaFin, String nombreOferta, Producto productoEnOferta, List<Producto> listadoOfertas, double precioOferta) {
        this.codigoOferta = codigoOferta;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nombreOferta = nombreOferta;
        this.productoEnOferta = productoEnOferta;
        this.listadoOfertas = listadoOfertas;
        this.precioOferta = precioOferta;
    }
    //gets y sets

    public int getCodigoOferta() {
        return codigoOferta;
    }

    public void setCodigoOferta(int codigoOferta) {
        this.codigoOferta = codigoOferta;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getNombreOferta() {
        return nombreOferta;
    }

    public void setNombreOferta(String nombreOferta) {
        this.nombreOferta = nombreOferta;
    }

    public Producto getProductoEnOferta() {
        return productoEnOferta;
    }

    public void setProductoEnOferta(Producto productoEnOferta) {
        this.productoEnOferta = productoEnOferta;
    }

    public List<Producto> getListadoOfertas() {
        return listadoOfertas;
    }

    public void setListadoOfertas(List<Producto> listadoOfertas) {
        this.listadoOfertas = listadoOfertas;
    }

    public double getPrecioOferta() {
        return precioOferta;
    }

    public void setPrecioOferta(double precioOferta) {
        this.precioOferta = precioOferta;
    }
    
    
    
}
