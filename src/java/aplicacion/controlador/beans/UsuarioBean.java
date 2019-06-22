/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.dao.IUsuarioDAO;
import aplicacion.dao.imp.UsuarioDAOImp;
//import aplicacion.modelo.dominio.Rol;
import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Cristian
 */
@ManagedBean
@ViewScoped
public class UsuarioBean implements Serializable{
    private IUsuarioDAO iUsuarioDAO;
    
    
    //Constructor
    public UsuarioBean() {
        iUsuarioDAO = new UsuarioDAOImp();
    }
    
    //Metodos
    /**
     * Retorna un objeto Usuario si coincide con el usuario 
     * y el password ingresado
     * @param usuario
     * @param password
     * @return Usuario correspondiente al suario y contrasenia
     */
    public Usuario verificarCredenciales(String usuario,String password){
        return iUsuarioDAO.verificarCredenciales(usuario, password);
    }
    /**
     * Metodo que agrega un usuario 
     */
    public void agregarUsuario(Usuario usuario){
        iUsuarioDAO.crearUsuario(usuario);
    }
    
    /**
     * Metodo que elimina un usuario 
     */
    public void eliminarUsuario(Usuario usuario){
        iUsuarioDAO.eliminarUsuario(usuario);
    }
    
    /**
     * Metodo que modifica un usuario 
     */
    public void modificarUsuario(Usuario usuario){
        iUsuarioDAO.modificarUsuario(usuario);
    }
    
    /**
     * Metodo que obtiene Usuarios cargados
     * @return 
     */
    public List<Usuario> obtenerUsuarios(){
        return iUsuarioDAO.obtenerUsuarios();
    }
    
    /**
     * Metodo que obtiene Roles cargados
     * @return 
     *
    public List<Rol> obtenerRoles(){
        return iUsuarioDAO.obtenerRoles();
    }*/
    
    //Getters & Setters

    public IUsuarioDAO getiUsuarioDAO() {
        return iUsuarioDAO;
    }

    public void setiUsuarioDAO(IUsuarioDAO iUsuarioDAO) {
        this.iUsuarioDAO = iUsuarioDAO;
    }

    
    
}
