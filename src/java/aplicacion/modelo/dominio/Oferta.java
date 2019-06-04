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
    private Producto ofer_producto;
    private List<Producto> listadoOfertas;
    private Date Oferta_tiempo;
    private double ofer_descuento;

    public Oferta() {
    listadoOfertas = new ArrayList();
    
    }

    public Oferta(Producto ofer_producto, List<Producto> listadoOfertas, Date Oferta_tiempo, double ofer_descuento) {
        this.ofer_producto = ofer_producto;
        this.listadoOfertas = listadoOfertas;
        this.Oferta_tiempo = Oferta_tiempo;
        this.ofer_descuento = ofer_descuento;
    }

    public Producto getOfer_producto() {
        return ofer_producto;
    }

    public void setOfer_producto(Producto ofer_producto) {
        this.ofer_producto = ofer_producto;
    }

    public List<Producto> getListadoOfertas() {
        return listadoOfertas;
    }

    public void setListadoOfertas(List<Producto> listadoOfertas) {
        this.listadoOfertas = listadoOfertas;
    }

    public Date getOferta_tiempo() {
        return Oferta_tiempo;
    }

    public void setOferta_tiempo(Date Oferta_tiempo) {
        this.Oferta_tiempo = Oferta_tiempo;
    }

    public double getOfer_descuento() {
        return ofer_descuento;
    }

    public void setOfer_descuento(double ofer_descuento) {
        this.ofer_descuento = ofer_descuento;
    }
    
    
    
    
    
}
