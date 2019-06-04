/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao;

import aplicacion.modelo.dominio.Usuario;

/**
 *
 * @author jaimito
 */
public interface IUsuarioDAO {
    public void crearUsuario(Usuario usuario);
    public void eliminarUsuario(Usuario usuario);
    public void modificarUsuario(Usuario usuario);
    
}
