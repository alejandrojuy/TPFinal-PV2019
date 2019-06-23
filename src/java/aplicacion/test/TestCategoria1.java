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
public class TestCategoria1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejecutar los test de acuerdo a los numeros
        
        
       ICategoriaDao iCategoriaDao = new CategoriaDAOimpl();
        Categoria categoria = new Categoria();
        categoria.setCodigoCate(1);
        categoria.setDescripcion("Muebles para la cocina como: mesas, sillas..ect. ");
        categoria.setNombreCate("Cocina");
        iCategoriaDao.crearCategoria(categoria);
        
        Categoria cate = new Categoria();
        cate.setCodigoCate(2);
        cate.setDescripcion("Muebles para la habitacion como : colchones, sabanas, almohadas, etc.");
        cate.setNombreCate("Colchones y Somier");
        iCategoriaDao.crearCategoria(cate);
        
        Categoria cat = new Categoria(); 
        cat.setCodigoCate(3);
        cat.setDescripcion("Muebles como mesa de luz ropero, organizador de zapatos, ect");
        cat.setNombreCate("Dormitorio");
        iCategoriaDao.crearCategoria(cat);

        Categoria ca = new Categoria();
        ca.setCodigoCate(4);
        ca.setDescripcion("muebles como: Botiquin, Alacena Esquinera de Baño,Set de Cajas Organizadoras Eco, etc");
        ca.setNombreCate("Lavadero y Baño");
        iCategoriaDao.crearCategoria(ca);
        
        Categoria c= new Categoria();
        c.setCodigoCate(5);
        c.setDescripcion("Muebles como:Mesa de Acero, Vidrio, Moderna,Mesa para TV, Set de Sillas de Plástico,Sillónes de cuero, etc    ");
        c.setNombreCate("Sala de Estar-Comedor");
        iCategoriaDao.crearCategoria(c);
        
       
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
