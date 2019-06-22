/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.validators;

import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author sdc201
 */
@FacesValidator("vtelefono")
public class ValidarTelefono implements Validator{
    
    //Metodo que valida el formato del telefono
    
    @Override
    public void validate(FacesContext fc,UIComponent uic,Object o) throws ValidatorException{
        String ntelefono = o.toString().trim();
        if(ntelefono.length() == 0 ){
            throw new ValidatorException(new FacesMessage("Ingrese telefono"));
        }else{
            String erTexto = "\\d\\d\\d-\\d\\d\\d\\d\\d\\d\\d$";
            boolean ok = Pattern.matches(erTexto,ntelefono);
            if(!ok){
                throw new ValidatorException(new FacesMessage("Formato debe ser 388-#######"));
            }
        }
    }
}
