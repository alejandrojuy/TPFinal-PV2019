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
import java.util.Date;
import java.util.HashSet;

import java.util.List;

/**
 *
 * @author crist
 */
public class TestVenta5 {
     public static void main(String[] args) {
         //Ejecutar los test de acuerdo a los numeros
         
         
         
         
        IVentaDAO iVentaDao = new VentaDAOImp();
        //antes de ejecutar este test debe ejecutar los tes de categoria, producto y ventasProducto
        
         IUsuarioDAO iUsuarioDAO = new UsuarioDAOImp();
        IVentaProductoDAO iVentaProductoDAO = new VentaProductoDAOimp();
           List<VentaProducto> listaVentaProducto = iVentaProductoDAO.listaVentasProducto();
//        for (VentaProducto vp: listaVentaProducto)
//        {
//            System.err.print(vp.getCodigo()+" ");
//            System.err.print(vp.getProducto().getCodigo()+" ");
//            System.err.print(vp.getProducto().getNombre()+" ");
//            System.err.print(vp.getCantidad()+" ");
//            System.err.println(vp.getImporte());
//        }
           List<Usuario> usuarios = iUsuarioDAO.obtenerUsuarios();
           Usuario usuario= usuarios.get(0);
           Venta unaVenta = new Venta();
           unaVenta.setDescuentoTotal(2000);
           unaVenta.setSubtotalVenta(6000);
           unaVenta.setTotalventa(15000);
           unaVenta.setEntregado(false);
           unaVenta.setEstado("Espera");
           unaVenta.setFechaVenta(new Date());
           unaVenta.setHora(new Date());
           unaVenta.setListaVentaProductos(new HashSet<>(listaVentaProducto));
//si tuviera q setear a un atributo de tipo set     unaVenta.setListaVentaProductos(new HashSet<>(listaVentaProducto));
           unaVenta.setTipoFactura("A");
           unaVenta.setUsuario(usuario);
     iVentaDao.agregarVenta(unaVenta);
     }
        
}
