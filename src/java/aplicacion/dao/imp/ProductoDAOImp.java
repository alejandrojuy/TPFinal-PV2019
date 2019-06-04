/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dao.IProductoDAO;
import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.utils.ListaProductos;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author jaimito
 */
public class ProductoDAOImp implements Serializable, IProductoDAO{

        private ListaProductos lista;

    public ProductoDAOImp() {
        lista= new ListaProductos();
    }
        
    @Override
    public void crearProducto(Producto producto) {
        
        lista.crearProduc(producto);
    }

    @Override
    public void eliminarProducto(Producto producto) {
        System.out.println("se elimino el productoDao");
    }

    @Override
    public void modificarProducto(Producto producto) {
        System.out.println("se modifico el productoDao");
    }

    @Override
    public List<Producto> mostrarLista() {
       return lista.getListaProductos();
    
    }

    public ListaProductos getLista() {
        return lista;
    }

    public void setLista(ListaProductos lista) {
        this.lista = lista;
    }
    
    
}
