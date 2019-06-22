
package aplicacion.dao.imp;
import aplicacion.dao.IUsuarioDAO;
import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.context.FacesContext;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author jaimito
 */
public class UsuarioDAOImp implements Serializable, IUsuarioDAO {

    private List<Usuario> lista; 
    

    //Constructor
    public UsuarioDAOImp() {
        lista = new ArrayList();
        
        }

    //Metodos
    @Override
    public void crearUsuario(Usuario usuario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(usuario);
        session.getTransaction().commit();
        session.close();
    } 
    @Override
    public List<Usuario> obtenerUsuarios() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria= session.createCriteria(Usuario.class);
        List<Usuario> usuarios= criteria.list();
        session.close();
        return usuarios;
    }

    @Override
    public Usuario verificarCredenciales(String usuario, String password) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria= session.createCriteria(Usuario.class);
        //aca es donde filtramos por cada campo (en like se declara el nombre del atributo de la clase usuario q seria usuario q es nuestro id)
        // y alado va la variable que comparamos nosotros (la q recibimos q es usuario)
        criteria.add(Restrictions.like("usuario", usuario));
       //aca es donde filtramos de nuevo por cada campo (en like se declara el nombre del atributo de la clase usuario q seria password q es nuestro password de nuestro usuario q se intenta logear)
        // y alado va la variable que comparamos nosotros (la q recibimos q es password)
        criteria.add(Restrictions.like("password", password));// aca volvevmos a filtrar los objetos q pasaron el primer filtro con like q era el filtro por usuario
        Usuario usuarioEncontrado = null;
        //mirar que en la condicion del if va un ! que significa distinto de vacio 
            if(!criteria.list().isEmpty())
            {//aca abajo casteamos a tipo usuario lo q sobra de la lista que contiene criteria en la posicion 0
               usuarioEncontrado = (Usuario) criteria.list().get(0);
                FacesContext.getCurrentInstance().getExternalContext()
                        .getSessionMap().put("usuario", usuarioEncontrado);
            }
        session.close();
        return usuarioEncontrado;
    }

       
    public List<Usuario> getLista() {
        return lista;
    }

    public void setLista(List<Usuario> lista) {
        this.lista = lista;
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    /**
    @Override
    public void eliminarUsuario(Usuario usuario) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        sesion.delete(usuario);
        sesion.getTransaction().commit();
        sesion.close();
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        sesion.update(usuario);
        sesion.getTransaction().commit();
        sesion.close();
    }

    /**@Override
    public List<Rol> obtenerRoles() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Rol.class);
        Set<Rol> roles = (Set<Rol>) criteria.list();
        session.close();
        return roles;
    }**/

}

