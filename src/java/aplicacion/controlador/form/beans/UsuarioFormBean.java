/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.form.beans;

import aplicacion.controlador.beans.UsuarioBean;
import aplicacion.modelo.dominio.Usuario;
import aplicacion.modelo.utils.ListadoRoles;
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

    boolean esAdministrador;
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
        usuarioBean.getUsuario().setRol(new ListadoRoles().getListaRoles().get(1));
        usuarioBean.agregarUsuario();
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Exito", "Se agrego un usuario correctamente"));
    }

    //Agregar nuevo Usuario Administrador
    public void agregarUsuarioAdministrador() {
        usuarioBean.getUsuario().setRol(new ListadoRoles().getListaRoles().get(0));
        usuarioBean.agregarUsuario();
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Exito", "Se agrego un usuario Administrador correctamente"));
    }

    //Getters & Setters
    public boolean isEsAdministrador() {
        Usuario usuario = (Usuario) FacesContext.getCurrentInstance()
                .getExternalContext().getSessionMap().get("usuario");
        if (usuario.getRol().getNombre().equals("Administracion")) {
            esAdministrador = true;
        } else {
            esAdministrador = false;
        }
        return esAdministrador;
    }
    
    public void mostrarLogin(){
     FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }

    public void setEsAdministrador(boolean esAdministrador) {
        this.esAdministrador = esAdministrador;
    }

    public boolean isEsUsuario() {
        Usuario usuario = (Usuario) FacesContext.getCurrentInstance()
                .getExternalContext().getSessionMap().get("usuario");
        if (usuario.getRol().getNombre().equals("UsuarioComun")) {
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
