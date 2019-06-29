package aplicacion.controlador.form.beans;

import aplicacion.controlador.beans.ProductoBean;
import aplicacion.dao.ICategoriaDao;
import aplicacion.dao.imp.CategoriaDAOimpl;
import aplicacion.modelo.dominio.Categoria;
import aplicacion.modelo.dominio.Producto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author Cristian
 */
@ManagedBean
@ViewScoped
public class ProductoFormBean implements Serializable {

    @ManagedProperty(value = "#{productoBean}")
    private ProductoBean productoBean;
    private Producto producto;

        private ICategoriaDao idaCategoriaDao= new CategoriaDAOimpl();
        private List<Categoria> lista;
        private List<Producto> listaProducto;
        private int cantidad;
        private List<Categoria> listaDeCategorias;
        private List<Producto> listaDeProductos;
        private List<Producto> listaDeProductosCocina;
        private List<Producto> listaDeProductosComedor;
        private List<Producto> listaDeProductosColchones;
        private List<Producto> listaDeProductosDormitorio;
        private List<Producto> listaDeProductosLavadero;
    
        //construcctor
    public ProductoFormBean() {
        producto = new Producto();
        listaDeCategorias = new ArrayList();
        listaDeProductos = new ArrayList();
        listaDeProductosCocina = new ArrayList();
        listaDeProductosComedor = new ArrayList();
        listaDeProductosColchones = new ArrayList();
        listaDeProductosDormitorio = new ArrayList();
        listaDeProductosLavadero = new ArrayList();
        lista= new ArrayList();
    }
    //Metodos
    @PostConstruct
    public void init() {
        cargarCategorias();
        cargarProductos();
        cargarProductosSegunCategoria();
        //cargarProveedores();
    }
    /**
     * Metodo que permite editar un producto de la tabla productos
     *
     * @param event
     */
    public void onRowEdit(RowEditEvent event) {
        Producto productoModificado = (Producto) event.getObject();
        productoBean.modificarProducto(productoModificado);
        FacesMessage msg = new FacesMessage("Exito", "Usuario modificado correctamente");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    public List<Categoria>getListaCategoria(){
        List<Categoria> lista= idaCategoriaDao.obtenerCategorias();
        return  lista;
    }

    /**
     * Metodo que permite cancelar la edicion de un producto de la tabla
     * productos
     *
     * @param event
     */
    public void onRowEditCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edicion Cancelada", "No se han modificado los cambios");
        FacesContext.getCurrentInstance().addMessage(null, msg);

    }

    /**
     * Metodo que carga los productos almacenados en la base de datos
     */
    public void cargarProductos() {
        listaDeProductos = productoBean.obtenerProductos();
    }

    /**
     * Metodo que carga los productos Segun Categoria
     */
    public void cargarProductosSegunCategoria() {
        
        for (int i = 0; i < listaDeProductos.size(); i++) {
            if (listaDeProductos.get(i).getCategoria().getNombreCate().equals("Cocina")) {
                this.listaDeProductosCocina.add(listaDeProductos.get(i));
            } else {
                if (listaDeProductos.get(i).getCategoria().getNombreCate().equals("Sala de Estar-Comedor")) {
                    this.listaDeProductosComedor.add(listaDeProductos.get(i));
                } else {
                    if (listaDeProductos.get(i).getCategoria().getNombreCate().equals("Dormitorio")) {
                        this.listaDeProductosDormitorio.add(listaDeProductos.get(i));
                    } else {
                        if (listaDeProductos.get(i).getCategoria().getNombreCate().equals("Colchones y Somier")) {
                            this.listaDeProductosColchones.add(listaDeProductos.get(i));
                        } else {
                            if (listaDeProductos.get(i).getCategoria().getNombreCate().equals("Lavadero y Baño")) {
                                this.listaDeProductosLavadero.add(listaDeProductos.get(i));
                            }
                        }
                    }
                }
            }
        }

    }

    /**
     * Metodo que carga los proveedores almacenados en la base de datos
     */
    public void cargarProveedores() {
        //proveedoresCargados = proveedorBean.obtenerProveedores();
    }

    /**
     * Metodo que carga las categorias almacenadas en la base de datos
     */
    public void cargarCategorias() {
        listaDeCategorias = productoBean.obtenerCategorias();
    }

    /**
     * Metodo que guarda un nuevo producto cargado por el administrador
     */
    public void guardarNuevoProducto() {
        productoBean.agregarProducto(this.producto);
    }

    /**
     * Metodo que elimina un producto cargado
     *
     * @param producto
     */
    public void eliminarProducto(Producto producto) {
        productoBean.eliminarProducto(producto);
    }

    /**
     * Metodo que modifica un producto cargado
     *
     * @param producto
     */
    public void modificarProducto(Producto producto) {
        productoBean.modificarProducto(producto);
    }

    //Getters & Setters
    
    public ProductoBean getProductoBean() {
        return productoBean;
    }

    public void setProductoBean(ProductoBean productoBean) {
        this.productoBean = productoBean;
    } 

    public List<Categoria> getListaDeCategorias() {
        return listaDeCategorias;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public ICategoriaDao getIdaCategoriaDao() {
        return idaCategoriaDao;
    }

    public void setIdaCategoriaDao(ICategoriaDao idaCategoriaDao) {
        this.idaCategoriaDao = idaCategoriaDao;
    }

    public List<Categoria> getLista() {
        return lista;
    }

    public void setLista(List<Categoria> lista) {
        this.lista = lista;
    }

    public List<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(List<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setListaDeCategorias(List<Categoria> listaDeCategorias) {
        this.listaDeCategorias = listaDeCategorias;
    }

    public List<Producto> getListaDeProductos() {
        return listaDeProductos;
    }

    public void setListaDeProductos(List<Producto> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    public List<Producto> getListaDeProductosCocina() {
        return listaDeProductosCocina;
    }

    public void setListaDeProductosCocina(List<Producto> listaDeProductosCocina) {
        this.listaDeProductosCocina = listaDeProductosCocina;
    }

    public List<Producto> getListaDeProductosComedor() {
        return listaDeProductosComedor;
    }

    public void setListaDeProductosComedor(List<Producto> listaDeProductosComedor) {
        this.listaDeProductosComedor = listaDeProductosComedor;
    }

    public List<Producto> getListaDeProductosColchones() {
        return listaDeProductosColchones;
    }

    public void setListaDeProductosColchones(List<Producto> listaDeProductosColchones) {
        this.listaDeProductosColchones = listaDeProductosColchones;
    }

    public List<Producto> getListaDeProductosDormitorio() {
        return listaDeProductosDormitorio;
    }

    public void setListaDeProductosDormitorio(List<Producto> listaDeProductosDormitorio) {
        this.listaDeProductosDormitorio = listaDeProductosDormitorio;
    }

    public List<Producto> getListaDeProductosLavadero() {
        return listaDeProductosLavadero;
    }

    public void setListaDeProductosLavadero(List<Producto> listaDeProductosLavadero) {
        this.listaDeProductosLavadero = listaDeProductosLavadero;
    }
}
