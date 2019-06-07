/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.dao.IUsuarioDAO;
import aplicacion.dao.imp.UsuarioDAOImp;
import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author crist
 */
@ManagedBean
@ViewScoped
public class UsuarioBean implements Serializable{
    private IUsuarioDAO iUsuarioDAO;
    private Usuario usuario;
    
    //Constructor
    public UsuarioBean() {
        iUsuarioDAO = new UsuarioDAOImp();
        usuario = new Usuario();
    }
    
    //Metodos
    /**
     * Retorna un objeto Usuario si coincide con el usuario 
     * y el password ingresado
     * @param usuario
     * @param password
     * @return 
     */
    public Usuario verificarCredenciales(String usuario,String password){
        return iUsuarioDAO.verificarCredenciales(usuario, password);
    }
    
    public void agregarUsuario(){
        iUsuarioDAO.crearUsuario(usuario);
    }
    
    //Getters & Setters

    public IUsuarioDAO getiUsuarioDAO() {
        return iUsuarioDAO;
    }

    public void setiUsuarioDAO(IUsuarioDAO iUsuarioDAO) {
        this.iUsuarioDAO = iUsuarioDAO;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
