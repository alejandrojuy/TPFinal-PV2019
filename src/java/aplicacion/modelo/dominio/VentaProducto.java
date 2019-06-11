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
public class VentaProducto implements Serializable{
    private Venta venta;
    private Producto producto;
    private int cantidad;
    private boolean entregado;
    private double importe;

    public VentaProducto() {
    }

    public VentaProducto(Venta venta, Producto producto, int cantidad, boolean entregado, double importe) {
        this.venta = venta;
        this.producto = producto;
        this.cantidad = cantidad;
        this.entregado = entregado;
        this.importe = importe;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    
}
