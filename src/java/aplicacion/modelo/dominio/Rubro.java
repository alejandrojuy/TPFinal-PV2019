/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author jaimito
 */
public class Rubro  implements Serializable{
    private int rubro_codigo;
    private String rubro_tipo;

    public Rubro() {
    }

    public Rubro(int rubro_codigo, String rubro_tipo) {
        this.rubro_codigo = rubro_codigo;
        this.rubro_tipo = rubro_tipo;
    }

    public int getRubro_codigo() {
        return rubro_codigo;
    }

    public void setRubro_codigo(int rubro_codigo) {
        this.rubro_codigo = rubro_codigo;
    }

    public String getRubro_tipo() {
        return rubro_tipo;
    }

    public void setRubro_tipo(String rubro_tipo) {
        this.rubro_tipo = rubro_tipo;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
