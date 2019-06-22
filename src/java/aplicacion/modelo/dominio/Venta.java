package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class Venta implements Serializable{
    private int codigoVenta;
    private double descuentoTotal;
    private double subtotalVenta;
    private double totalventa;
    private Date fechaVenta;
    private Date hora;
    private String estado;
    private boolean entregado;
    private Usuario usuario;
    private String tipoFactura;
    private List<VentaProducto> listaVentaProductos;
    
    //constructor
    public Venta() {
        listaVentaProductos= new ArrayList();
    }

    public Venta(int codigoVenta, double descuentoTotal, double subtotalVenta, double totalventa, Date fechaVenta, Date hora, String estado, Usuario usuario, String tipoFactura, List<VentaProducto> listaVentaProductos) {
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

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public List<VentaProducto> getListaVentaProductos() {
        return listaVentaProductos;
    }

    public void setListaVentaProductos(List<VentaProducto> listaVentaProductos) {
        this.listaVentaProductos = listaVentaProductos;
    }

    

    
    
}
