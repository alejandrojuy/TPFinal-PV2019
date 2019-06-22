/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;
 
import aplicacion.dao.ICategoriaDao;
import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.modelo.dominio.Categoria;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;


/**
 *
 * @author jaimito
 */
public class CategoriaDAOimpl implements Serializable, ICategoriaDao{

    @Override
    public void crear(Categoria categoria) {
  Session session = HibernateUtil.getSessionFactory().openSession();
   session.beginTransaction();
   session.save(categoria);
   session.getTransaction().commit();
   session.close();
     
    
    }

    @Override
    public List<Categoria> obtenerCategorias() {
    
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria= session.createCriteria(Categoria.class);
        List<Categoria> categorias= criteria.list();
        session.close();
        return categorias;
    }
 
  

    
}
