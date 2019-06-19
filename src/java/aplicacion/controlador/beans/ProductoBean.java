/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import aplicacion.dao.IProductoDAO;
import aplicacion.dao.imp.ProductoDAOImp;
import aplicacion.modelo.dominio.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
/**
 *
 * @author jaimito
 */
@ManagedBean
@ViewScoped
public class ProductoBean implements Serializable{
    private IProductoDAO iproductoDao;
 
    //inicializando constuctor
    public ProductoBean() {
        iproductoDao = new ProductoDAOImp();
    }

    public void crearProducto(Producto producto)
    {
        iproductoDao.crearProducto(producto);
    }
    
    //defieniendo metodos accesores get y set del IProductoDAO
    public IProductoDAO getIproductoDao() {
        return iproductoDao;

    }

    public void setIproductoDao(IProductoDAO iproductoDao) {
        this.iproductoDao = iproductoDao;
    }
    
   // public class ImagesView {
     
    
     
 
    
//}
    
}
