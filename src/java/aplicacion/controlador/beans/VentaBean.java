/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.dao.IVentaDAO;
import aplicacion.dao.imp.VentaDAOImp;
import aplicacion.modelo.dominio.Usuario;
import aplicacion.modelo.dominio.Venta;
import java.io.Serializable;
import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

/**
 *
 * @author crist
 */
@ManagedBean
@ViewScoped
public class VentaBean implements Serializable{
    private IVentaDAO iVentaDAO;
    
    /**
     * Consructor
     */
    public VentaBean() {
        iVentaDAO = new VentaDAOImp();
    }
    
    // Metodos
    
    public void agregarVenta(Venta venta){
        iVentaDAO.agregarVenta(venta);
    }
    
    public void eliminarVenta(Venta venta){
        iVentaDAO.eliminarVenta(venta);
    }
    
    public void modificarVenta(Venta venta){
        iVentaDAO.modificarVenta(venta);
    }
    
    public Set<Venta> obtenerVentas(Usuario usuario){
        return iVentaDAO.obtenerVentas(usuario);
    }
    
    //Getters & Setters

    public IVentaDAO getiVentaDAO() {
        return iVentaDAO;
    }

    public void setiVentaDAO(IVentaDAO iVentaDAO) {
        this.iVentaDAO = iVentaDAO;
    }
    
    
}
