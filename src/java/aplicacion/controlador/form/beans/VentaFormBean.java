/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.form.beans;

import aplicacion.Utils.ListaVentaProducto;
import aplicacion.controlador.beans.VentaBean;
import aplicacion.controlador.beans.VentaProductoBean;
//import aplicacion.modelo.dominio.Pago;
import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.dominio.Usuario;
import aplicacion.modelo.dominio.Venta;
import aplicacion.modelo.dominio.VentaProducto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
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
   @ManagedProperty(value = "#{productoFormBean}")
    private ProductoFormBean productoFormBean;
    private Usuario usuarioLogueado;
    private List<Venta> listaDeVentas;
    private List<String> modosDePago;
    private VentaProducto ventaProducto;
    private Producto producto;
    private Venta venta;
    private List<VentaProducto> listaVentaProducto;
    private int cantidad = 5;
   
    /**
     * Constructor
     */
    public VentaFormBean() {
        producto = new Producto();
        modosDePago = new ArrayList();
        usuarioLogueado = new Usuario();
        venta = new Venta();
        listaDeVentas = new ArrayList<>();       
     }

   
    public void generarListaVentasProductos()
    {
        listaVentaProducto = ventaProductoBean.obtenerVentasProductos();
    }
            
    @PostConstruct //se ejecta de forma automatica
    public void init() {
    generarListaVentasProductos();
    ventaProducto  = new VentaProducto();
    cargarModosDePago();
    }

    public List<VentaProducto> getListaVentaProducto() {
        return listaVentaProducto;
    }

    public void setListaVentaProducto(List<VentaProducto> listaVentaProducto) {
        this.listaVentaProducto = listaVentaProducto;
    }

    // Metodos 
    /**
     * Metodo que crea una nueva Venta
     */
  /**  public void crearNuevaVenta() {
        double totalVenta = 0;
        String estadoVenta = "Encargado";
        String tipoDeFactura = "A";
        String modoDePago = "Tarjeta";
        if (devolverUsuarioLogueado() != null && this.listaDeVentasProductos != null) {
            Date fecha = obtenerFechaActual();
            Date hora = obtenerHoraActual();
            venta.setDescuentoTotal(0);
            venta.setSubtotalVenta(0);
            venta.setTotalventa(totalVenta);
            venta.setFechaVenta(fecha);
            venta.setHora(hora);
            venta.setEstado(estadoVenta);
            venta.setUsuario(devolverUsuarioLogueado());
            venta.setTipoFactura(tipoDeFactura);
            venta.setListaVentaProductos( new HashSet<>(listaDeVentasProductos) );
            //venta.setMedioDePago(new Pago(1, "modoDePago1", "modoDePago1"));
        }
    }**/

    
    /**
     * Metodo que devuelve la fecha actual del sistema
     *
     * @return
     */
    public Date obtenerFechaActual() {
        Date hoy = new Date();
        return hoy;
    }

    /**
     * Metodo que devuelve la hora actual del sistema
     *
     * @return horaActual
     */
    public Date obtenerHoraActual() {
        Date horaActual = new Date();
        return horaActual;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * Agregar Venta
     */
    public void agregarVenta() {
        ventaBean.agregarVenta(venta);
        FacesMessage msg = new FacesMessage("Exito", "Venta Agregada");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    /**
     * Eliminar Venta
     *
     * @param ventaAEliminar
     */
    public void eliminarVenta(Venta ventaAEliminar) {
        ventaBean.eliminarVenta(ventaAEliminar);
        FacesMessage msg = new FacesMessage("Exito", "Venta Eliminada");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    /**
     * Modificar Venta
     */
    public void modificarVenta() {
        ventaBean.modificarVenta(venta);
        FacesMessage msg = new FacesMessage("Exito", "Venta Modificada");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    /**
     * Metodo que emite un comprobante para el usuario luego de confirmar la
     * compra
     *
     * @param venta
     */
    public void emitirComprobante(Venta venta) {

    }

    /**
     * Metodo que devuelve el usuario Logueado
     *
     * @return usuario
     */
    public Usuario devolverUsuarioLogueado() {
        Usuario usuario = (Usuario) FacesContext.getCurrentInstance()
                .getExternalContext().getSessionMap().get("usuario");
        return usuario;
    }


    /**
     * Metodo que crea una VentaProducto agregando un Producto y su cantidad al
     * carrito
     *
     * @param prod
     */
   
    

      public void cargarProdVenta()
    {   //System.out.println(this.cantidad);
       ventaProducto.setProducto(producto);
        ventaProducto.setCantidad(this.cantidad);
       // System.out.println(ventaProducto.getCantidad()+ "cannntidad ");
        double importe = ventaProducto.getCantidad()*ventaProducto.getProducto().getPrecio();
        ventaProducto.setImporte(importe);
        ventaProductoBean.agregarAListaVentaProducto(ventaProducto);
        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO, "Producto agregado al carrito", "Producto Agregado al Carrito"));
        generarListaVentasProductos();
        ventaProducto= new VentaProducto();
    }
   
    public int getCantidad() {
        //System.out.println("entro a get...");
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        System.out.println("entro a set....");
        System.out.println(cantidad);
        this.cantidad = cantidad;
    }

     
  

     
    public VentaProducto getVentaProducto() {
        return ventaProducto;
    }

    public void setVentaProducto(VentaProducto ventaProducto) {
        this.ventaProducto = ventaProducto;
    }
    
    

    /**
     * Metodo que quita un producto seleccionado del carrito de compras
     *
     * @param producto
     */
    /**
    public void quitarProductoDelCarrito(Producto producto) {
        boolean borrado = false;
        for (int i = 0; i < this.listaDeVentasProductos.size(); i++) {
            if (listaDeVentasProductos.get(i).getProducto().getCodigo() == producto.getCodigo()) {
                listaDeVentasProductos.remove(i);
                borrado = true;
            }
        }
        if (borrado) {
            FacesMessage msg = new FacesMessage("Exito", "Producto Quitado del Carrito");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } else {
            FacesMessage msg = new FacesMessage("Error", "Producto No Quitado");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }

    }**/

    /**
     * Metodo que calcula y devuelve el importe total del carrito de compras
     *
     * @return
     */
   /** public double calcularImporteDelCarrito() {
        double resultado = 0;
        for (int i = 0; i < this.listaDeVentasProductos.size(); i++) {
            resultado = resultado + listaDeVentasProductos.get(i).getImporte();
        }
        return resultado;
    }
**/
    /**
     * Metodo que carga las opciones de pago en una lista 
     */
    public void cargarModosDePago() {
        this.modosDePago.add("Efectivo");
        this.modosDePago.add("Tarjeta de debito");
        this.modosDePago.add("Tarjeta de credito");
        this.modosDePago.add("Cheque");
    }

    //Getters & Setters
    public VentaBean getVentaBean() {
        return ventaBean;
    }

    public void setVentaBean(VentaBean ventaBean) {
        this.ventaBean = ventaBean;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Usuario getUsuarioLogueado() {
        return usuarioLogueado;
    }

    public void setUsuarioLogueado(Usuario usuarioLogueado) {
        this.usuarioLogueado = usuarioLogueado;
    }

    

    public List<Venta> getListaDeVentas() {
        return listaDeVentas;
    }

    public void setListaDeVentas(List<Venta> listaDeVentas) {
        this.listaDeVentas = listaDeVentas;
    }

    public ProductoFormBean getProductoFormBean() {
        return productoFormBean;
    }

    public void setProductoFormBean(ProductoFormBean productoFormBean) {
        this.productoFormBean = productoFormBean;
    }

   
   
 

    public List<String> getModosDePago() {
        return modosDePago;
    }

    public void setModosDePago(List<String> modosDePago) {
        this.modosDePago = modosDePago;
    }

    public VentaProductoBean getVentaProductoBean() {
        return ventaProductoBean;
    }

    public void setVentaProductoBean(VentaProductoBean ventaProductoBean) {
        this.ventaProductoBean = ventaProductoBean;
    }
 
}
