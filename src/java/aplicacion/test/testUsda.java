/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.dao.IUsuarioDAO;
import aplicacion.dao.imp.UsuarioDAOImp;
import aplicacion.modelo.dominio.Usuario;

/**
 *
 * @author jaimito
 */
public class testUsda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IUsuarioDAO usu = new UsuarioDAOImp();
        

        Usuario u = usu.verificarCredenciales("alumno", "root");
        System.out.println( u.getUsuario() );
        System.out.println(u.getPassword());
    }
    
}
