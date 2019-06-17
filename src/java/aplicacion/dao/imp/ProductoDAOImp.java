/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dao.IProductoDAO;
import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.dominio.Usuario;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author jaimito
 */
public class ProductoDAOImp implements Serializable, IProductoDAO{
        private List<Usuario> lista;
         

    public ProductoDAOImp() {
        lista= new ArrayList();
    
    }
        
    @Override
    public void crearProducto(Producto producto) {
       Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(producto);
        session.getTransaction().commit();
        session.close();
        
    }

    @Override
    public void eliminarProducto(Producto producto) {
        System.out.println("se elimino el productoDao");
    }

    @Override
    public void modificarProducto(Producto producto) {
        System.out.println("se modifico el productoDao");
    }

   

    public List<Usuario> getLista() {
        return lista;
    }

    public void setLista(List<Usuario> lista) {
        this.lista = lista;
    }

    @Override
    public List<Producto> mostrarLista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
