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
    public UsuarioBean() {
        iUsuarioDAO = new UsuarioDAOImp();
    }
    
    //Metodos
    /**
     * Retorna un objeto Usuario si coincide con el dni 
     * y el password ingresado
     * @param dni
     * @param password
     * @return 
     */
    public Usuario verificarCredenciales(Integer dni,String password){
        return iUsuarioDAO.verificarCredenciales(dni, password);
    }
    
}
