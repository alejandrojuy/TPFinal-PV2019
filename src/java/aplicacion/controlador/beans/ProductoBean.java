/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.dao.ICategoriaDao;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import aplicacion.dao.IProductoDAO;
import aplicacion.dao.imp.CategoriaDAOimpl;
import aplicacion.dao.imp.ProductoDAOImp;
import aplicacion.modelo.dominio.Categoria;
import aplicacion.modelo.dominio.Producto;
import java.util.List;


/**
 *
 * @author jaimito
 */
@ManagedBean
@ViewScoped
public class ProductoBean implements Serializable {

    private IProductoDAO iproductoDao;
    private ICategoriaDao iCategoriaDao;
    //inicializando constuctor
    public ProductoBean() {
        iproductoDao = new ProductoDAOImp();
        iCategoriaDao = new CategoriaDAOimpl();
    }

    //Metodos
    public void agregarProducto(Producto producto) {
        iproductoDao.agregarProducto(producto);
    }

    public void eliminarProducto(Producto producto) {
        iproductoDao.eliminarProducto(producto);
    }

    public void modificarProducto(Producto producto) {
        iproductoDao.modificarProducto(producto);
    }
    //Obtener Productos

    public List<Producto> obtenerProductos() {
        return iproductoDao.mostrarListaDeProductos();
    }

    //Obtener Categorias
    public List<Categoria> obtenerCategorias() {
        return iCategoriaDao.obtenerCategorias();
    }
    
    //Getters & Setters

    public IProductoDAO getIproductoDao() {
        return iproductoDao;
    }

    public void setIproductoDao(IProductoDAO iproductoDao) {
        this.iproductoDao = iproductoDao;
    }

    public ICategoriaDao getiCategoriaDao() {
        return iCategoriaDao;
    }

    public void setiCategoriaDao(ICategoriaDao iCategoriaDao) {
        this.iCategoriaDao = iCategoriaDao;
    }
    
    

}
