/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.form.beans;

import aplicacion.controlador.beans.ProductoBean;
import aplicacion.modelo.dominio.Producto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author jaimito
 */
@ManagedBean
@ViewScoped
public class ProductoFormBean implements Serializable{
    @ManagedProperty(value="#{productoBean}")
    private ProductoBean productoBean;
    private Producto producto;
    private List<String> images;
    
    //construcctor
    public ProductoFormBean() {
        producto = new Producto();
        images = new ArrayList<String>();
    }
    
     @PostConstruct
    public void init() {
        mostrarImagenes();
    }
    
    public void mostrarImagenes(){
        for (int i = 1; i <= 12; i++) {
            images.add("muebleria" + i + ".jpg");
        }
    }
    
    public void d(){
        
        productoBean.crearProducto(producto);
    }

    
    // definiendo get y set de los atributos de la clase ProductoFormBean
    public ProductoBean getProductoBean() {
        return productoBean;
    }

    public void setProductoBean(ProductoBean productoBean) {
        this.productoBean = productoBean;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
    
}
