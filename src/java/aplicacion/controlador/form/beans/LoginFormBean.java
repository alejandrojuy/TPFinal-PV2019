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
    @ManagedProperty(value="#{usuarioBean}")
    private UsuarioBean usuarioBean;
    private Integer dni;
    private String password;
    
    // Constructor
    public LoginFormBean() {
    }
    
    //Metodos
    
    /**
     * Verificar si el dni y el password ingresado
     * corresponden a un usuario guardado en la lista de usuarios
     * @return 
     */
    public String verificarCredenciales(){
        String resultado = "";
        Usuario usuario = usuarioBean.verificarCredenciales(dni, password);
        if (usuario != null) {
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario",usuario);
            resultado = "menu?faces-redirect=true";
        }else{
            FacesContext fc = FacesContext.getCurrentInstance();
            fc.addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR,"Acceso Denegado","Las credenciales son incorrectas"));
        }
        return resultado;
    }
    
    //Getters & Setters
    
    
     public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
