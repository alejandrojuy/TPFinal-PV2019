/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principals;

import aplicacion.dao.IProductoDAO;
import aplicacion.dao.imp.ProductoDAOImp;
import aplicacion.modelo.dominio.Producto;
import java.util.Scanner;

/**
 *
 * @author jaimito
 */
public class PrincipalProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Producto producto= new Producto();
        
       IProductoDAO IproductoDAO = new ProductoDAOImp();
       
        for(Producto p: IproductoDAO.mostrarLista())
        {System.out.println(p);
        }
        System.out.println("ingresa Codigo del producto");
        int cod= sc.nextInt();
            producto.setCodigo(cod);
        System.out.println("ingresa precio del producto");
        double pre= sc.nextDouble();
        producto.setPrecio(pre);
        System.out.println("ingresa nombre del producto");
        String nom= sc.next();
        producto.setNombrePro(nom);
        IproductoDAO.crearProducto(producto);
        System.out.println("ingresa Codigo del producto");
         cod= sc.nextInt();
            producto.setCodigo(cod);
        System.out.println("ingresa precio del producto");
        pre= sc.nextDouble();
        producto.setPrecio(pre);
        System.out.println("ingresa nombre del producto");
         nom= sc.next();
        producto.setNombrePro(nom);
        IproductoDAO.crearProducto(producto);
        
        for(Producto p: IproductoDAO.mostrarLista())
        {System.out.println(p);
        }
    }
    
}
