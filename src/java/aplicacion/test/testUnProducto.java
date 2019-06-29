/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.dao.IProductoDAO;
import aplicacion.dao.imp.ProductoDAOImp;
import aplicacion.modelo.dominio.Producto;
import java.util.List;

/**
 *
 * @author jaimito
 */
public class testUnProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IProductoDAO iProductoDAO = new ProductoDAOImp();
        List<Producto> productos = iProductoDAO.mostrarListaDeProductos();
            int i=1;
        for(Producto p: productos)
            {   System.out.println("For numero "+i );
                i++;
                System.out.println("Producto Nombre: "+ p.getNombre());
                System.out.println("Producto Nombre: "+ p.getMarca());
                System.out.println("Producto Nombre: "+ p.getDeposito());
                System.out.println("Producto Nombre: "+ p.getCodigo());
                System.out.println("Producto Nombre: "+ p.getPrecio());
                System.out.println("Producto Nombre: "+ p.getStock());
                System.out.println("Producto Nombre: "+ p.getImagenProducto());

                System.out.println("Categoria del Producto");
                System.out.println("codigo " +p.getCategoria().getCodigoCate());
                System.out.println("Nombre" +p.getCategoria().getNombreCate());
                System.out.println("Descripcion" +p.getCategoria().getDescripcion());
                System.out.println("");
            }
    }
    
}
