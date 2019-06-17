/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author jaimito
 */
public class Venta implements Serializable{
    private int codigoVenta;
    private double descuentoTotal;
    private double subtotalVenta;
    private double totalventa;
    private Date fechaVenta;
    private Date hora;
    private String estado;
    private Usuario usuario;
    private String tipoFactura;
    private Set<VentaProducto> listaVentaProductos;
    
    //constructor
    public Venta() {
        listaVentaProductos= new HashSet();
    }

    public Venta(int codigoVenta, double descuentoTotal, double subtotalVenta, double totalventa, Date fechaVenta, Date hora, String estado, Usuario usuario, String tipoFactura, Set<VentaProducto> listaVentaProductos) {
        this.codigoVenta = codigoVenta;
        this.descuentoTotal = descuentoTotal;
        this.subtotalVenta = subtotalVenta;
        this.totalventa = totalventa;
        this.fechaVenta = fechaVenta;
        this.hora = hora;
        this.estado = estado;
        this.usuario = usuario;
        this.tipoFactura = tipoFactura;
        this.listaVentaProductos = listaVentaProductos;
    }
    
    


    
    //gets y sets 

    public int getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public double getDescuentoTotal() {
        return descuentoTotal;
    }

    public void setDescuentoTotal(double descuentoTotal) {
        this.descuentoTotal = descuentoTotal;
    }

    public double getSubtotalVenta() {
        return subtotalVenta;
    }

    public void setSubtotalVenta(double subtotalVenta) {
        this.subtotalVenta = subtotalVenta;
    }

    public double getTotalventa() {
        return totalventa;
    }

    public void setTotalventa(double totalventa) {
        this.totalventa = totalventa;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(String tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    public Set<VentaProducto> getListaVentaProductos() {
        return listaVentaProductos;
    }

    public void setListaVentaProductos(Set<VentaProducto> listaVentaProductos) {
        this.listaVentaProductos = listaVentaProductos;
    }

    
    
}
