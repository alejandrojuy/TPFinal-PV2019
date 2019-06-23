/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.dao.ICategoriaDao;
import aplicacion.dao.IProductoDAO;
import aplicacion.dao.IVentaDAO;
import aplicacion.dao.IVentaProductoDAO;
import aplicacion.dao.imp.CategoriaDAOimpl;
import aplicacion.dao.imp.ProductoDAOImp;
import aplicacion.dao.imp.VentaDAOImp;
import aplicacion.dao.imp.VentaProductoDAOimp;
import aplicacion.modelo.dominio.Categoria;
import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.dominio.VentaProducto;
import java.util.List;

/**
 *
 * @author jaimito
 */
public class TestVentaProduco4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IVentaProductoDAO iVentaProductoDAO = new VentaProductoDAOimp();
        IProductoDAO  iProductoDAO = new ProductoDAOImp();
        ICategoriaDao iCategoriaDao = new CategoriaDAOimpl();
        List<Categoria> listaCategoria = iCategoriaDao.obtenerCategorias();
        Categoria categoria= listaCategoria.get(0);
//            System.out.println(categoria.getCodigoCate());
//            System.out.println(categoria.getNombreCate());
//            System.out.println(categoria.getDescripcion());
//        
        List<Producto> listaProducto= iProductoDAO.mostrarListaDeProductos();
        Producto prod = listaProducto.get(0);
            System.out.println(prod.getCodigo());
            System.out.println(prod.getNombre());
            System.out.println(prod.getStock());
        
//        Producto producto5 = new Producto(25, 1000, categoria, 5, "marca3", "nombre5", "descripcion5", "deposito", true, "imagenProducto5");
//        iProductoDAO.agregarProducto(producto5);
//        Producto producto6 = new Producto(26, 1200,  categoria, 5, "marca3", "nombre6", "descripcion6", "deposito", true, "imagenProducto6");
//         iProductoDAO.agregarProducto(producto6);
          
        VentaProducto segundaVentaProducto = new VentaProducto(prod, 2, 400);
        VentaProducto primeraVentaProducto = new VentaProducto(prod, 1, 200);
        iVentaProductoDAO.crearVentaProducto(primeraVentaProducto);
        iVentaProductoDAO.crearVentaProducto(segundaVentaProducto);
    }
    
}
