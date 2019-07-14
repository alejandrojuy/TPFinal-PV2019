/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.dao.IVentaProductoDAO;
import aplicacion.dao.imp.VentaProductoDAOimp;
import aplicacion.modelo.dominio.VentaProducto;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author jaimito
 */
@ManagedBean
@ViewScoped
public class VentaProductoBean implements Serializable{
    private IVentaProductoDAO iVentaProductoDAO;
    public VentaProductoBean() {
        iVentaProductoDAO =new VentaProductoDAOimp();
    }
    
    
    
    
    public void agregarAListaVentaProducto(VentaProducto ventaProducto)
    {
        iVentaProductoDAO.agregarVentaProductoALista(ventaProducto);
    }

    public IVentaProductoDAO getiVentaProductoDAO() {
        return iVentaProductoDAO;
    }
    
    public void cargarVenta(VentaProducto ventaProducto)
    {
     iVentaProductoDAO.crearVentaProducto(ventaProducto);
    }
    
    public  List<VentaProducto> obtenerVentasProductos()
    {
        return iVentaProductoDAO.listaVentasProductoPendientes();
    }
    public void setiVentaProductoDAO(IVentaProductoDAO iVentaProductoDAO) {
        this.iVentaProductoDAO = iVentaProductoDAO;
    }
    
    
}
