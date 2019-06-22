/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.dao.ICategoriaDao;
import aplicacion.dao.imp.CategoriaDAOimpl;
import aplicacion.modelo.dominio.Categoria;
import java.util.List;

/**
 *
 * @author jaimito
 */
public class TestCategoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ICategoriaDao iCategoriaDao = new CategoriaDAOimpl();
        Categoria categoria = new Categoria();
        
        categoria.setCodigoCate(1);
        categoria.setDescripcion("cama, mesa de luz, ropero ");
        categoria.setNombreCate("Muebles");
        iCategoriaDao.crearCategoria(categoria);
        
        Categoria cate = new Categoria();
        cate.setCodigoCate(2);
        cate.setDescripcion("cocina, mesa, sillas");
        cate.setNombreCate("Living Comedor y Deco");
        iCategoriaDao.crearCategoria(cate);
        
        Categoria cat = new Categoria(); 
        cat.setCodigoCate(3);
        cat.setDescripcion("sillones, mesa ratonera ");
        cat.setNombreCate("Jardin y Exteriores");
        iCategoriaDao.crearCategoria(cat);

        Categoria ca = new Categoria();
        ca.setCodigoCate(4);
        ca.setDescripcion("colchones, somiers");
        ca.setNombreCate("Colchoes y Somiers");
        iCategoriaDao.crearCategoria(ca);
        
        Categoria c= new Categoria();
        
        c.setCodigoCate(5);
        c.setDescripcion("Almohadas");
        c.setNombreCate("Almohadas");
        iCategoriaDao.crearCategoria(c);
        
        Categoria categori = new Categoria();
        
        categori.setCodigoCate(6);
        categori.setDescripcion("va queriendo");
        categori.setNombreCate("Ropa de Cama");
        iCategoriaDao.crearCategoria(categori);
//        List<Categoria> lista = iCategoriaDao.obtenerCategorias();
//         for(Categoria o: lista)
//         {
//             System.out.print(o.getNombreCate());
//             System.out.print(" ");
//             System.out.println(o.getCodigoCate());
//             System.out.print(" ");
//             System.out.println(o.getDescripcion());
//         }
//         
    }
    
}
