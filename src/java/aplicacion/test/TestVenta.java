/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.dao.IVentaDAO;
import aplicacion.dao.imp.VentaDAOImp;
import aplicacion.modelo.dominio.Categoria;
import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.dominio.Usuario;
import aplicacion.modelo.dominio.Venta;
import aplicacion.modelo.dominio.VentaProducto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author crist
 */
public class TestVenta {
     public static void main(String[] args) {
        IVentaDAO iVentaDao = new VentaDAOImp();
        
        Usuario usuario1 = new Usuario("usuario1", "password1",1 , "nombre1", "apellido1", "sexo1", "direccion1", "provincia1", 4600, new Date(), 5454, "email1", false,"Comun");
        Usuario usuario2 = new Usuario("usuario2", "password2",2 , "nombre2", "apellido2", "sexo2", "direccion2", "provincia2", 4600, new Date(), 5488, "email2", false,"Comun");
       
        
        Producto producto1 = new Producto(1, 200, new Categoria(1, "Descripcion1", "Descripcion1"), 5, "marca1", "nombre1", "descripcion1", "deposito", true, "imagenProducto1");
        Producto producto2 = new Producto(2, 400, new Categoria(1, "Descripcion1", "Descripcion1"), 5, "marca1", "nombre2", "descripcion2", "deposito", true, "imagenProducto2");
        Producto producto3 = new Producto(3, 600, new Categoria(2, "Descripcion2", "Descripcion2"), 5, "marca2", "nombre3", "descripcion3", "deposito", true, "imagenProducto3");
        Producto producto4 = new Producto(4, 800, new Categoria(2, "Descripcion2", "Descripcion2"), 5, "marca2", "nombre4", "descripcion4", "deposito", true, "imagenProducto4");
        Producto producto5 = new Producto(5, 1000, new Categoria(3, "Descripcion3", "Descripcion3"), 5, "marca3", "nombre5", "descripcion5", "deposito", true, "imagenProducto5");
        Producto producto6 = new Producto(6, 1200, new Categoria(3, "Descripcion3", "Descripcion3"), 5, "marca3", "nombre6", "descripcion6", "deposito", true, "imagenProducto6");
        
        VentaProducto pro1 = new VentaProducto(producto1, 2, 400);
        VentaProducto pro2 = new VentaProducto(producto2, 1, 200);
        VentaProducto pro3 = new VentaProducto(producto3, 1, 200);
        VentaProducto pro4 = new VentaProducto(producto4, 4, 800);
        VentaProducto pro5 = new VentaProducto(producto5, 3, 1200);
        VentaProducto pro6 = new VentaProducto(producto6, 1, 200);
        
        List lista1 = new ArrayList(); 
        List lista2 = new ArrayList();
        
        lista1.add(pro1);
        lista1.add(pro2);
        lista1.add(pro3);
        
        lista2.add(pro4);
        lista2.add(pro5);
        lista2.add(pro6);
        
        Venta venta1 = new Venta(1, 0, 0, 0, new Date(), new Date(), "estado1", usuario1, "tipoFactura_A",lista1);
        Venta venta2 = new Venta(2, 0, 0, 0, new Date(), new Date(), "estado2", usuario2, "tipoFactura_B",lista2);
        
        iVentaDao.agregarVenta(venta1);
        iVentaDao.agregarVenta(venta2);
     
     
     }
        
}
