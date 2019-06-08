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
public class Venta implements Serializable{
    private int codigoVenta;
    private double descuentoVenta;
    private double subtotalVenta;
    private double totalventa;
    private Date fechaVenta;
    private Date hora;
    private String estado;
    private Usuario usuario;
    private String tipoFactura;
    //constructor
    public Venta() {
    }

    public Venta(int codigoVenta, double descuentoVenta, double subtotalVenta, double totalventa, Date fechaVenta, Date hora, String estado, Usuario usuario, String tipoFactura) {
        this.codigoVenta = codigoVenta;
        this.descuentoVenta = descuentoVenta;
        this.subtotalVenta = subtotalVenta;
        this.totalventa = totalventa;
        this.fechaVenta = fechaVenta;
        this.hora = hora;
        this.estado = estado;
        this.usuario = usuario;
        this.tipoFactura = tipoFactura;
    }
    //gets y sets 

    public int getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public double getDescuentoVenta() {
        return descuentoVenta;
    }

    public void setDescuentoVenta(double descuentoVenta) {
        this.descuentoVenta = descuentoVenta;
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
    
    
    
}
