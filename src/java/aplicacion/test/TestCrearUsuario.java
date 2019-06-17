/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.dao.IUsuarioDAO;
import aplicacion.dao.imp.UsuarioDAOImp;
import aplicacion.modelo.dominio.Usuario;
import java.util.Date;

/**
 *
 * @author jaimito
 */
public class TestCrearUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IUsuarioDAO ida= new UsuarioDAOImp();
        Usuario usuario = new Usuario();
        usuario.setUsuario("pepito");
        usuario.setPassword("root");
        usuario.setDni(36351299);
        usuario.setNombre("emanuel alejandro");
        usuario.setApellido("zerpa");
        usuario.setSexo("varon");
        usuario.setDireccion("alto comedero");
        usuario.setProvincia("Jujuy");
        usuario.setCodigoPostal(4600);
        usuario.setCodigoPostal(4600);
        usuario.setFechaNacimiento(new Date());
        usuario.setTelefono(43722);
        usuario.setEmail("dsa@hotmail.com");
        usuario.setBorrado(false);
        usuario.setRol("consumidor");
          ida.crearUsuario(usuario);
    }
    
}
