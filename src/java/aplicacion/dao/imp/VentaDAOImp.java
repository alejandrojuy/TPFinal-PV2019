package aplicacion.dao.imp;

import aplicacion.dao.IVentaDAO;
import aplicacion.modelo.dominio.Usuario;
import aplicacion.modelo.dominio.Venta;
import java.io.Serializable;
import java.util.Set;
import aplicacion.hibernate.configuracion.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author Cristian
 */
public class VentaDAOImp implements Serializable, IVentaDAO {

    //Implementacion de metodos abstractos
    @Override
    public List<Venta> obtenerVentas(Usuario usuario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Venta.class);
        List<Venta> ventas =criteria.list();
// (Set<Venta>)  criteria.list(); parece q es forma de setear una lista 
        session.close();
        return ventas;
    }

    @Override
    public void agregarVenta(Venta venta) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        sesion.save(venta);
        sesion.getTransaction().commit();
        sesion.close();
    }

    @Override
    public void eliminarVenta(Venta venta) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        sesion.delete(venta);
        sesion.getTransaction().commit();
        sesion.close();
    }

    @Override
    public void modificarVenta(Venta venta) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        sesion.update(venta);
        sesion.getTransaction().commit();
        sesion.close();
    }

    @Override
    public void emitirComprobante(Venta venta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
