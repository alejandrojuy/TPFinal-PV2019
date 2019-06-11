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
    private List<VentaProducto> listaVentaProducto;
    
    //constructor
    public Venta() {
        listaVentaProducto= new ArrayList();
    }


    
    //gets y sets 

    
    
}
