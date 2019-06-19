/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.form.beans;

import aplicacion.controlador.beans.ProductoBean;
import aplicacion.dao.ICategoriaDao;
import aplicacion.dao.imp.CategoriaDAOimpl;
import aplicacion.modelo.dominio.Categoria;
import aplicacion.modelo.dominio.Producto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
private List<Categoria> lista;
private List<Producto> listaProducto;
    
    //construcctor
    public ProductoFormBean() {
        producto = new Producto();
        lista= new ArrayList();
        listaProducto= new ArrayList();
        Categoria cate = new Categoria(123, "muebles de livin","Interior");
        lista.add(cate);
        cate = new Categoria(456,"roperos de lujos", "amoblamiento");
        lista.add(cate);
        cate = new Categoria(678, "herramientas para el hogar", "Jardin");
        lista.add(cate);
    }

    public List<Categoria> getLista() {
        return lista;
    }

    public void setLista(List<Categoria> lista) {
        this.lista = lista;
    }
    
     
    
    public void d(){
              //lista.add(producto);
              ICategoriaDao ida= new CategoriaDAOimpl();
                      
              Categoria cate= new Categoria();
              cate.setCodigoCate(1234);
              cate.setDescripcion("dasdsa");
              cate.setNombreCate("palala");
              ida.crear(cate);
              //Producto rod = new Producto(111999, 22112,"tiramisu");
              //lista.add(rod);
              producto.setCategoria(cate);
              producto.setEstado(true);
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
    public void cargarProducto()
    {
        listaProducto.add(producto);
    }

    public List<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(List<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }
   
    
}
