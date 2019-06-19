/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.dao.ICategoriaDao;
import aplicacion.dao.imp.CategoriaDAOimpl;
import aplicacion.modelo.dominio.Categoria;

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
        
        categoria.setCodigoCate(22312);
        categoria.setDescripcion("va queriendo");
        categoria.setNombreCate("lol");
        iCategoriaDao.crear(categoria);
    }
    
}
