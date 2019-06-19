/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dao.IUsuarioDAO;
import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.modelo.dominio.Usuario;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.context.FacesContext;
import org.hibernate.Session;

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
        
        return lista;
    }

    @Override
    public Usuario verificarCredenciales(String usuario, String password) {
        Usuario usuarioEncontrado = null;
        for (Usuario usu : lista) {
            if (usu.getUsuario().equals(usuario) && usu.getPassword().equals(password)) {
                usuarioEncontrado = usu;
                FacesContext.getCurrentInstance().getExternalContext()
                        .getSessionMap().put("usuario", usuarioEncontrado);
            }
        }
        return usuarioEncontrado;
    }

    public List<Usuario> getLista() {
        return lista;
    }

    public void setLista(List<Usuario> lista) {
        this.lista = lista;
    }

  
}
