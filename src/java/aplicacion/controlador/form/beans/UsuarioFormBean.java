/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.form.beans;

import aplicacion.controlador.beans.UsuarioBean;
import aplicacion.modelo.dominio.Usuario;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author sdc201
 */
@ManagedBean
@ViewScoped
public class UsuarioFormBean {

    boolean esUsuario;

    @ManagedProperty(value = "#{usuarioBean}")
    private UsuarioBean usuarioBean;

    //Constructor
    public UsuarioFormBean() {
    }

    //Metodos
    
    public String devolverNombreUsuario(){
        Usuario usuario = (Usuario) FacesContext.getCurrentInstance()
                .getExternalContext().getSessionMap().get("usuario");
        return "[" + usuario.getApellido() + "," + usuario.getNombre() + "]";
    }
   
    //Agregar nuevo Usuario Final
    public void agregarUsuario() {
        usuarioBean.getUsuario().setRol("Usuario Comun");
        usuarioBean.agregarUsuario();
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Exito", "Se agrego un usuario correctamente"));
    }

    //Agregar nuevo Usuario Administrador
    

    //Getters & Setters
 
    
    public void mostrarLogin(){
     FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }
 

    public boolean isEsUsuario() {
        Usuario usuario = (Usuario) FacesContext.getCurrentInstance()
                .getExternalContext().getSessionMap().get("usuario");
        if (usuario.getRol().equals(usuario.getRol())) {
            esUsuario = true;
        } else {
            esUsuario = false;
        }
        return esUsuario;
    }

    public void setEsUsuario(boolean esUsuario) {
        this.esUsuario = esUsuario;
    }

    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }

}
