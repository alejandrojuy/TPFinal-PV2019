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
 * @author crist
 */
@ManagedBean
@ViewScoped
public class LoginFormBean {

    @ManagedProperty(value = "#{usuarioBean}")
    private UsuarioBean usuarioBean;
    private String usuario;
    private String password;

    // Constructor
    public LoginFormBean() {
    }

    //Metodos
    /**
     * Verificar si el usuario y el password ingresado corresponden a un usuario
     * guardado en la lista de usuarios
     *
     * @return
     */
    public String verificarCredenciales() {
        String resultado = "";
        Usuario usuario = usuarioBean.verificarCredenciales(this.usuario, this.password);
        if (usuario != null) {
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", usuario);
                resultado = "home?faces-redirect=true";
        } else {
            FacesContext fc = FacesContext.getCurrentInstance();
            fc.addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Acceso Denegado", "Las credenciales son incorrectas"));
        }
        return resultado;
    }

    public boolean verificarSesion() {
        boolean estado;
        if (FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario") == null) {
            estado = false;
        } else {
            estado = true;
        }
        return estado;
    }

    public String cerrarSesion() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "login";
    }

    //Getters & Setters
    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
