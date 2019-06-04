/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dao.IUsuarioDAO;
import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;

/**
 *
 * @author jaimito
 */
public class UsuarioDAOImp implements Serializable, IUsuarioDAO{

    @Override
    public void crearUsuario(Usuario usuario) {
        System.err.println("Hola Mundo");  
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        System.out.println("Usuario eliminado");
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
        System.out.println("UsuarioModificado");
    }
    
}
