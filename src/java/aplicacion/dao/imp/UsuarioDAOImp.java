/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dao.IUsuarioDAO;
import aplicacion.modelo.dominio.Usuario;
import aplicacion.modelo.utils.ListadoUsuarios;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author jaimito
 */
public class UsuarioDAOImp implements Serializable, IUsuarioDAO {

    private ListadoUsuarios listaUsuarios;

    //Constructor
    public UsuarioDAOImp() {
        listaUsuarios = new ListadoUsuarios();
    }

    //Metodos
    @Override
    public List<Usuario> obtenerUsuarios() {
        return listaUsuarios.getListadoUsuarios();
    }

    @Override
    public Usuario verificarCredenciales(Integer dni, String password) {
        Usuario us = null;
        for (Usuario usuario : listaUsuarios.getListadoUsuarios()) {
            if (usuario.getDni() == dni && usuario.getPassword().equals(password)) {
                us = usuario;
            }
        }
        return us;
    }

    @Override
    public void crearUsuario(Usuario usuario) {
        listaUsuarios.agregar(usuario);
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        listaUsuarios.eliminar(usuario);
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
        listaUsuarios.modificar(usuario);
    }

}
