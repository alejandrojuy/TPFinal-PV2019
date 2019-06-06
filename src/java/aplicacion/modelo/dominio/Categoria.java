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
public class Categoria  implements Serializable{
    private int codigoCate;
    private String tipoCate;

    public Categoria() {
    }

    
    public Categoria(int codigoCate, String tipoCate) {
        this.codigoCate = codigoCate;
        this.tipoCate = tipoCate;
    }

    public int getCodigoCate() {
        return codigoCate;
    }

    public void setCodigoCate(int codigoCate) {
        this.codigoCate = codigoCate;
    }

    public String getTipoCate() {
        return tipoCate;
    }

    public void setTipoCate(String tipoCate) {
        this.tipoCate = tipoCate;
    }

    
    
    
}
