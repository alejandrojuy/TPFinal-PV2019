/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;
import aplicacion.dao.IProductoDAO;
import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.modelo.dominio.Producto;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author jaimito
 */
public class ProductoDAOImp implements Serializable, IProductoDAO{
    
    public ProductoDAOImp() {
    
    }
        
    //Metodos implementados
    
    @Override
    public void agregarProducto(Producto producto) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        sesion.save(producto);
        sesion.getTransaction().commit();
        sesion.close();
    }
    
    @Override
    public void eliminarProducto(Producto producto) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        sesion.delete(producto);
        sesion.getTransaction().commit();
        sesion.close();
    }

    @Override
    public void modificarProducto(Producto producto) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        sesion.update(producto);
        sesion.getTransaction().commit();
        sesion.close();
    }

    @Override
    public List<Producto> mostrarListaDeProductos() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Producto.class);
        List<Producto> productos = criteria.list();
        session.close();
        return productos;
    }
    
  
  

    
}
