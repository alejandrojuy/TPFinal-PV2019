/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.utils;

import aplicacion.modelo.dominio.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crist
 */
public class ListadoUsuarios {

    private List<Usuario> listadoUsuarios;

    public ListadoUsuarios() {
        listadoUsuarios = new ArrayList<>();
        ListadoRoles listaRoles = new ListadoRoles();

    }

    //Metodos
    public void agregar(Usuario usuario) {
        listadoUsuarios.add(usuario);
    }

    public void eliminar(Usuario usuario) {
        for (int i = 0; i < listadoUsuarios.size(); i++) {
            // if(listadoUsuarios.get(i).getDni().equals(usuario.getDni())){
            //   listaUsuarios.set(i, usuario);
        }
    }

    public void modificar(Usuario usuario) {
        for (int i = 0; i < listadoUsuarios.size(); i++) {
            // if (listadoUsuarios.get(i).getDni().equals(editorial.getDni())) {
            //   listadoUsuarios.remove(i);
            //}
        }
    }
    //Getters & Setters

    public List<Usuario> getListadoUsuarios() {
        return listadoUsuarios;
    }

    public void setListadoUsuarios(List<Usuario> listadoUsuarios) {
        this.listadoUsuarios = listadoUsuarios;
    }

}
