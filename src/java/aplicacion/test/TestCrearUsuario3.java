/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.dao.IUsuarioDAO;
import aplicacion.dao.imp.UsuarioDAOImp;
import aplicacion.modelo.dominio.Categoria;
import aplicacion.modelo.dominio.Usuario;
import java.util.Date;

/**
 *
 * @author jaimito
 */
public class TestCrearUsuario3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ejecutar los test de acuerdo a los numeros
        
        
        
        IUsuarioDAO ida= new UsuarioDAOImp();
        Usuario usuario = new Usuario();
        
        usuario.setUsuario("peluchin");
        usuario.setPassword("root");
        usuario.setDni(321);
        usuario.setNombre("peluchin");
        usuario.setApellido("zerpa22");
        usuario.setSexo("varon22");
        usuario.setDireccion("comedero");
        usuario.setProvincia("Jujuy22");
        usuario.setCodigoPostal(4600);
        
        
        usuario.setFechaNacimiento(new Date());
        usuario.setTelefono(43722);
        usuario.setEmail("dsa@hotmail.com");
        usuario.setBorrado(true);
        usuario.setRol("consumidor");
          ida.crearUsuario(usuario);
    }
    
}
