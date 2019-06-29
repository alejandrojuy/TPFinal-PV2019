/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.dao.IVentaDAO;
import aplicacion.dao.imp.VentaDAOImp;
import aplicacion.modelo.dominio.Venta;
import aplicacion.modelo.dominio.VentaProducto;
import java.util.List;

/**
 *
 * @author jaimito
 */
public class TestTodasLasVentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IVentaDAO iVentaDAO = new VentaDAOImp();
        List<Venta> ventas = iVentaDAO.obtenerTodasVentas();
        int i=0;
        for(Venta v: ventas)
        {i++;
            System.out.println("Vez que entra al for"+i);
            System.out.println("Codigo de Venta: "+v.getCodigoVenta());
            System.out.println("Fecha de Venta: "+v.getFechaVenta());
            System.out.println("Hora de Venta: "+v.getHora());
            System.out.println("Nombre del usuario que realizo la compra: "+v.getUsuario().getNombre());
            System.out.println("Listado de Los Productos que se realizaron en la compra");
            int j=1;
            System.out.println("");
            for(VentaProducto vp: v.getListaVentaProductos())
            {   System.out.println("Producto N°"+j+" comprado");
                System.out.println("Nombre del Producto:  "+vp.getProducto().getNombre());
                System.out.println("Marca del Producto que se vendio: "+vp.getProducto().getMarca());
                System.out.println("Precio del Producto: "+vp.getProducto().getPrecio());
               System.out.println(vp.getProducto().getCategoria().getCodigoCate());

               System.out.println("Nombre categoria del Producto: "+vp.getProducto().getCategoria().getNombreCate());

               j++;
            }
                           System.out.println(v.getListaVentaProductos() );

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            
        }
        
    }
    
}
