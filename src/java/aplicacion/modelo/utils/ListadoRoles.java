/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.utils;

import aplicacion.modelo.dominio.Rol;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crist
 */
public class ListadoRoles {
    private List<Rol> listaRoles;
    
    public ListadoRoles(){
        listaRoles = new ArrayList<>();
        listaRoles.add(new Rol(1,"Administrador","Usuario con todos los permisos","N"));
        listaRoles.add(new Rol(2,"Usuario A","Usuario con algunos permisos","N"));
        listaRoles.add(new Rol(3,"Usuario B","Usuario con pocos permisos","N"));
              
    }

    public List<Rol> getListaRoles() {
        return listaRoles;
    }

    public void setListaRoles(List<Rol> listaRoles) {
        this.listaRoles = listaRoles;
    }
    
    
}
