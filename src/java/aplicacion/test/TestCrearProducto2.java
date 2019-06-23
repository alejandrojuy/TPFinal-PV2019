/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.dao.ICategoriaDao;
import aplicacion.dao.IProductoDAO;
import aplicacion.dao.imp.CategoriaDAOimpl;
import aplicacion.dao.imp.ProductoDAOImp;
import aplicacion.modelo.dominio.Categoria;
import aplicacion.modelo.dominio.Producto;

/**
 *
 * @author jaimito
 */
public class TestCrearProducto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        //Ejecutar los test de acuerdo a los numeros
        IProductoDAO ida= new ProductoDAOImp();
        Categoria categoria = new Categoria();
     ICategoriaDao iCategoriaDao= new CategoriaDAOimpl();
        Producto producto= new Producto();
        categoria.setCodigoCate(1234);
        categoria.setDescripcion("992");
        categoria.setNombreCate("9921");
        iCategoriaDao.crearCategoria(categoria);//sin antes crear esta categoria me daba error taloco jaja
        producto.setCategoria(categoria); // y esta tambien va si o si ... prueben al menos a mi me daba error
        producto.setCodigo(1267);
        producto.setPrecio(1234);
        producto.setStock(10);
        producto.setMarca("toiota");
        producto.setNombre("TV OLED");
        producto.setDescripcion("mejor de lo mejor");
        producto.setDeposito("vida");
        producto.setEstado(true);
        producto.setImagenProducto("sin imagen ");
       ida.agregarProducto(producto);
       
       Producto otroProducto =new Producto(678, 699, categoria, 100, "Uniliver", "Perchero", "perchero que es para colgar ropa", "AV 291", true,"amaka");
       ida.agregarProducto(otroProducto);
        
   }
    
    }
 
    

