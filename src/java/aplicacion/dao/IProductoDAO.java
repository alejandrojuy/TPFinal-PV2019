/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao;


import aplicacion.modelo.dominio.Producto;

import java.util.List;

/**
 *
 * @author jaimito
 */
public interface IProductoDAO {
    public void agregarProducto(Producto producto);
    public void eliminarProducto(Producto producto);
    public void modificarProducto(Producto producto);
    public List<Producto> mostrarListaDeProductos();
   

}
