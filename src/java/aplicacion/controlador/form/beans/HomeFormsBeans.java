/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.form.beans;

import aplicacion.controlador.beans.ProductoBean;
import aplicacion.controlador.beans.VentaBean;
import aplicacion.controlador.beans.VentaProductoBean;
import aplicacion.dao.IProductoDAO;
import aplicacion.dao.imp.ProductoDAOImp;
import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.dominio.Usuario;
import aplicacion.modelo.dominio.Venta;
import aplicacion.modelo.dominio.VentaProducto;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author jaimito
 */
@ManagedBean
@ViewScoped
public class HomeFormsBeans implements Serializable{
    @ManagedProperty(value ="#{ventaBean}")
    private VentaBean ventaBean;
    @ManagedProperty(value = "#{productoBean}")
    private ProductoBean productoBean;
    private List<Producto> productosDisponibles;
    private VentaProducto nuevaVentaProducto;
    @ManagedProperty(value ="#{ventaProductoBean}")
    private VentaProductoBean ventaProductoBean;
    private List<VentaProducto> productosVendidos;
    
            
    /**
     * Creates a new instance of HomeFormsBeans
     */
    public HomeFormsBeans() {
        
    }
    @PostConstruct
    public void init(){
        generarProductos();
        generarProductosVendidos();
        nuevaVentaProducto = new VentaProducto();
    }
    
    public void generarProductos(){
        productosDisponibles = productoBean.obtenerProductos();
        
    }
    
    public void generarProductosVendidos(){
        productosVendidos = ventaProductoBean.obtenerVentasProductos();
    FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("productosVendidos", productosVendidos);
    }
    
    public void grabarVenta(){
        System.out.println("Entro a venta");
        double importe;
        importe= nuevaVentaProducto.getCantidad()*nuevaVentaProducto.getProducto().getPrecio();
        nuevaVentaProducto.setImporte(importe);
        ventaProductoBean.agregarAListaVentaProducto(nuevaVentaProducto);
        generarProductosVendidos();
        nuevaVentaProducto = new VentaProducto();
    }
    public void finalizarCompra()
            
    {   IProductoDAO iProductoDAO = new ProductoDAOImp();
        List<Producto> listaProducto= iProductoDAO.mostrarListaDeProductos();
       Producto prod2 = listaProducto.get(1);
       VentaProducto n = new VentaProducto(prod2,22, 44);
        
       productosVendidos.add(n);
       productosVendidos.add(n);
       productosVendidos.add(n);
        double total=0;
        Usuario us= new Usuario("peluchin", "dasda", 543, "ee",  "das", "dasd", "das", "ads", 3232, new Date(), 25342,"dad",true,"asdas");
        Venta nuevaVenta = new Venta();
        Usuario usuario = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario"); 
            for(VentaProducto k: productosVendidos)
            {
                ventaProductoBean.cargarVenta(k);
            }
        
//        nuevaVenta.setListaVentaProductos(new HashSet<>(productosVendidos));
//        nuevaVenta.setUsuario(us);
//        nuevaVenta.setFechaVenta(new Date());
//        nuevaVenta.setDescuentoTotal(1);
//        nuevaVenta.setEstado("Pendiente");
//        nuevaVenta.setEntregado(false);
//        nuevaVenta.setHora(new Date());
//        nuevaVenta.setSubtotalVenta(total);
//        nuevaVenta.setTotalventa(total);
//        nuevaVenta.setTipoFactura("A");
        
//        ventaBean.agregarVenta(nuevaVenta);
    }        

    public ProductoBean getProductoBean() {
        return productoBean;
    }

    public void setProductoBean(ProductoBean productoBean) {
        this.productoBean = productoBean;
    }

    public List<Producto> getProductosDisponibles() {
        return productosDisponibles;
    }

    public void setProductosDisponibles(List<Producto> productosDisponibles) {
        this.productosDisponibles = productosDisponibles;
    }

    public VentaProducto getNuevaVentaProducto() {
        return nuevaVentaProducto;
    }

    public void setNuevaVentaProducto(VentaProducto nuevaVentaProducto) {
        this.nuevaVentaProducto = nuevaVentaProducto;
    }

    public VentaProductoBean getVentaProductoBean() {
        return ventaProductoBean;
    }

    public void setVentaProductoBean(VentaProductoBean ventaProductoBean) {
        this.ventaProductoBean = ventaProductoBean;
    }

    public List<VentaProducto> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(List<VentaProducto> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public VentaBean getVentaBean() {
        return ventaBean;
    }

    public void setVentaBean(VentaBean ventaBean) {
        this.ventaBean = ventaBean;
    }
    
    
    
}
