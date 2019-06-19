/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author jaimito
 */
@ManagedBean
@ViewScoped
public class GaleriaBean implements Serializable{
     private List<String> images;
    /**
     * Creates a new instance of GaleriaBean
     */
    public GaleriaBean() {
        
    }
      @PostConstruct
        public void init() {
            images = new ArrayList<String>();
            for (int i = 1; i <= 5; i++) {
                images.add("muebleria" + i + ".jpg");
            }
        }

        public List<String> getImages() {
            return images;
        }
}

