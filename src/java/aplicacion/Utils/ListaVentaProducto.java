/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.Utils;

import aplicacion.modelo.dominio.Categoria;
import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.dominio.VentaProducto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jaimito
 */
public class ListaVentaProducto implements Serializable{
    List<VentaProducto> lista;

    public ListaVentaProducto() {
        lista = new ArrayList();
       Producto prod = new Producto(6, 1099, new Categoria(  1, "cocina", "cocina"), 100,"Liv Home", "Cestos de Residuos Acero Inoxidable 12 Lts + 3 Lts LIV HOME", "Los Cestos de Residuos de Liv Home fueron diseñados en acero inoxidable para darle estilo y ofrecerte la posibilidad de ubicarlo en cualquier ambiente. En esta oportunidad ofrecemos un combo ideal para que puedas almacenar todos tus residuos.","N°20 Los Ceibos", true,"muebleria1" );
       Producto prod2 = new Producto(1, 1099, new Categoria(  12, "cocina", "cocina"), 100,"Liv Home", "Cestos de Residuos Acero Inoxidable 12 Lts + 3 Lts LIV HOME", "Los Cestos de Residuos de Liv Home fueron diseñados en acero inoxidable para darle estilo y ofrecerte la posibilidad de ubicarlo en cualquier ambiente. En esta oportunidad ofrecemos un combo ideal para que puedas almacenar todos tus residuos.","N°20 Los Ceibos", true,"muebleria1" );
         VentaProducto primeraVentaProducto = new VentaProducto(prod, 1, 200);
        VentaProducto segundaVentaProducto = new VentaProducto(prod2, 2, 800);
        lista.add(segundaVentaProducto);
        lista.add(primeraVentaProducto);
    }

    public List<VentaProducto> getLista() {
        return lista;
    }

    public void setLista(List<VentaProducto> lista) {
      
        this.lista = lista;
    }
    
     public void agregarVentaProducto(VentaProducto producto)
    {     
            lista.add(producto);
    }

    /**
     * permite buscar un objeto y si existe lo modifica 
     * 
     * @param libro el libro con los parametros que deseamos modificar
     */
    /**public void modificarLibro(VentaProducto libro) {
        for(int i=0; i<lista.size();i++)
        {
            if(lista.get(i).getCodigo()==libro.getCodigo()) 
            {
                lista.set(i, libro);
            }
        }
    }**/
    /**permite eliminar un libro ingresado.
     * @autor Zerpa Emanuel Alejandro
      * @param libro libro que borramos de la lista
     */
    /**public void borrarLibro(VentaProducto libro)
    {
        for(int i= 0; i<lista.size();i++)
        {
            if (lista.get(i).getCodigo() == libro.getCodigo())
            {
                lista.remove(i);
            }
        }
            
    }**/
     
    
    
}
