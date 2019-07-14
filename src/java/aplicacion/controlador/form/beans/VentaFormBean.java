/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.form.beans;

import aplicacion.controlador.beans.VentaBean;
import aplicacion.controlador.beans.VentaProductoBean;
//import aplicacion.modelo.dominio.Pago;
import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.dominio.VentaProducto;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

/**
 *
 * @author crist
 */
@ManagedBean
@ViewScoped
public class VentaFormBean implements Serializable {
    /// PARA MOSTRAR LAS TODAS LAS VENTAS VER VIDEO 13 abm Publicaciones Listado en youtube minuto 33 en adelante
    @ManagedProperty(value = "#{ventaBean}")
    private VentaBean ventaBean;
    @ManagedProperty(value = "#{ventaProductoBean}")
    private VentaProductoBean ventaProductoBean;
     private VentaProducto ventaProducto;
    private List<VentaProducto> listaVentaProducto;
    private Producto producto;
    private int cantidad;
  
    public VentaFormBean() {
        producto = new Producto();
     } 
    
    public void copyStateSelectProduct(Producto producto){
        ventaProducto.getProducto().setCategoria(producto.getCategoria());
        ventaProducto.getProducto().setCodigo(producto.getCodigo());
        ventaProducto.getProducto().setNombre(producto.getNombre());
    }
    
    public void generarListaVentasProductos()
    {
        listaVentaProducto = ventaProductoBean.obtenerVentasProductos();
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("listaVentaProducto", listaVentaProducto);
    }
            
    
    
    
    @PostConstruct //se ejecta de forma automatica
    public void init() {
    generarListaVentasProductos();
    ventaProducto  = new VentaProducto();
   
    }
    
    
    public void verCarga(){
        System.out.println(ventaProducto.getProducto());
    }
    
    public void cargarProdVenta()    
    {   //System.out.println(ventaProducto.getProducto().getCodigo());
        //ventaProducto.setProducto(producto);
        //ventaProducto.setCantidad(cantidad);
        System.out.println("El producto a agregar es: "+this.ventaProducto.getProducto());
       ventaProductoBean.agregarAListaVentaProducto(ventaProducto);
        //listaVentaProducto.add(ventaProducto);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Producto Agregado al carrito","Se agrego producto "));
        generarListaVentasProductos();
    ventaProducto= new VentaProducto();
    }

    public int getCantidad() {
        
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public VentaBean getVentaBean() {
        return ventaBean;
    }

    public void setVentaBean(VentaBean ventaBean) {
        this.ventaBean = ventaBean;
    }

    public VentaProductoBean getVentaProductoBean() {
        return ventaProductoBean;
    }

    public void setVentaProductoBean(VentaProductoBean ventaProductoBean) {
        this.ventaProductoBean = ventaProductoBean;
    }

    public VentaProducto getVentaProducto() {
        return ventaProducto;
    }

    public void setVentaProducto(VentaProducto ventaProducto) {
        this.ventaProducto = ventaProducto;
    }

    public List<VentaProducto> getListaVentaProducto() {
        return listaVentaProducto;
    }

    public void setListaVentaProducto(List<VentaProducto> listaVentaProducto) {
        this.listaVentaProducto = listaVentaProducto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
 
}
