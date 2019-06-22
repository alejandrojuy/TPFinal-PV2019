/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao;

import aplicacion.modelo.dominio.Categoria;
import java.util.List;

/**
 *
 * @author jaimito
 */
public interface ICategoriaDao {
    public void crear(Categoria categoria);
    public List<Categoria>obtenerCategorias();
    
}
