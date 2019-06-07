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
import javax.faces.context.FacesContext;

/**
 *
 * @author jaimito
 */
public class UsuarioDAOImp implements Serializable, IUsuarioDAO {

    private List<Usuario> listaUsuarios;
    private ListadoUsuarios listadoUsuarios;

    //Constructor
    public UsuarioDAOImp() {
        listaUsuarios = new ListadoUsuarios().getListadoUsuarios();
        listadoUsuarios = new ListadoUsuarios();
    }

    //Metodos
    @Override
    public List<Usuario> obtenerUsuarios() {
        return listaUsuarios;
    }

    @Override
    public Usuario verificarCredenciales(String usuario, String password) {
        Usuario usuarioEncontrado = null;
        for (Usuario usu : listaUsuarios) {
            if (usu.getUsuario().equals(usuario) && usu.getPassword().equals(password)) {
                usuarioEncontrado = usu;
                FacesContext.getCurrentInstance().getExternalContext()
                        .getSessionMap().put("usuario", usuarioEncontrado);
            }
        }
        return usuarioEncontrado;
    }

    @Override
    public void crearUsuario(Usuario usuario) {
        usuario.setBorrado("N");
        listadoUsuarios.agregar(usuario);
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        listadoUsuarios.eliminar(usuario);
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
        listadoUsuarios.modificar(usuario);
    }

}
