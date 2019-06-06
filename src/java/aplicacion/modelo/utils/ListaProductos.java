/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.utils;

import aplicacion.modelo.dominio.Producto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jaimito
 */
public class ListaProductos implements Serializable{
    private List<Producto> listaProductos;
    
    public ListaProductos() {
    listaProductos= new ArrayList();
    listaProductos.add(new Producto(333,200,"Rumba"));
    listaProductos.add(new Producto(001,20,"Tita"));
    
    }
    public void crearProducto(Producto producto)
    {  Producto prodAux = new Producto();
            prodAux.setCodigo(producto.getCodigo());
            prodAux.setNombre(producto.getNombre());
            prodAux.setPrecio(producto.getPrecio());
       
        listaProductos.add(prodAux);
    }
    public ListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

 
}
