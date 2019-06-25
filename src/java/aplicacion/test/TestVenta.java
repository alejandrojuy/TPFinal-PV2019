/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.dao.IUsuarioDAO;
import aplicacion.dao.IVentaDAO;
import aplicacion.dao.IVentaProductoDAO;
import aplicacion.dao.imp.UsuarioDAOImp;
import aplicacion.dao.imp.VentaDAOImp;
import aplicacion.dao.imp.VentaProductoDAOimp;
import aplicacion.modelo.dominio.Usuario;
import aplicacion.modelo.dominio.Venta;
import aplicacion.modelo.dominio.VentaProducto;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import static sun.net.www.http.HttpClient.New;

/**
 *
 * @author jaimito
 */
public class TestVenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IVentaDAO iVentaDAO = new VentaDAOImp();
        Usuario usuario = new Usuario();
        IUsuarioDAO iUsuarioDAO = new UsuarioDAOImp();
        
        List<Usuario> usuarios = iUsuarioDAO.obtenerUsuarios();
            usuario = usuarios.get(0);
        IVentaProductoDAO iVentaProductoDAO= new VentaProductoDAOimp();
        List<VentaProducto> ventasProductos = iVentaProductoDAO.listaVentasProducto();
//        Venta venta= new Venta(2000, 8000, 12000, new Date(), new Date(), "Pendiente",usuario, "A", new HashSet<>(ventasProductos) );
//        iVentaDAO.agregarVenta(venta);
        List<Venta> ventas= iVentaDAO.obtenerVentas(usuario);
        Venta otraVenta = ventas.get(0);

//          ArrayList ventaproductos = new ArrayList<>();
//          ventaproductos = (ArrayList<VentaProducto>)otraVenta.getListaVentaProductos();
            for(VentaProducto d: iVentaDAO.obtenerVentasProductosDeUnaVenta(otraVenta))
            {
                System.out.println();
                System.out.print(d.getCantidad());
                System.out.print(d.getImporte());
                System.out.print(d.getProducto().getNombre());
                System.out.print(d.getProducto().getCategoria().getNombreCate());
                
            
            }
        
    }
    
}
