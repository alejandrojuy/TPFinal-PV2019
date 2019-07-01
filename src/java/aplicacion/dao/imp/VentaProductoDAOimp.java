/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.Utils.ListaVentaProducto;
import aplicacion.dao.IVentaProductoDAO;
import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.dominio.Venta;
import aplicacion.modelo.dominio.VentaProducto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author jaimito
 */
public class VentaProductoDAOimp  implements Serializable, IVentaProductoDAO{
     private ListaVentaProducto listaImp;

    public VentaProductoDAOimp() {
            listaImp = new  ListaVentaProducto();
                    
    }
     
 
    @Override
    public void crearVentaProducto(VentaProducto ventaProducto) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        sesion.save(ventaProducto);
        sesion.getTransaction().commit();
        sesion.close();
    }
 
      

     

    @Override
    public void eliminarVentaProducto(Producto producto, Venta venta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarVentaProducto(Producto producto, Venta venta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<VentaProducto> listaVentasProducto() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(VentaProducto.class);
        List<VentaProducto> lista =  criteria.list();
        session.close();
        return lista;
        
    }

    @Override
    public List<VentaProducto> listaVentasProductoPendientes() {
       
    return listaImp.getLista();
    }

    public ListaVentaProducto getListaImp() {
        return listaImp;
    }

    public void setListaImp(ListaVentaProducto listaImp) {
        this.listaImp = listaImp;
    }

    @Override
    public void agregarVentaProductoALista(VentaProducto ventaproducto) {
        listaImp.agregarVentaProducto(ventaproducto);
    
    }



}
