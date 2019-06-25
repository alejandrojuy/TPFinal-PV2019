package aplicacion.dao;

import aplicacion.modelo.dominio.Usuario;
import aplicacion.modelo.dominio.Venta;
import aplicacion.modelo.dominio.VentaProducto;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Cristian
 */
public interface IVentaDAO {

    public List<Venta> obtenerVentas(Usuario usuario);
    
    public List<VentaProducto> obtenerVentasProductosDeUnaVenta(Venta venta);
    
    public void agregarVenta(Venta venta);

    public void eliminarVenta(Venta venta);

    public void modificarVenta(Venta venta);

    public void emitirComprobante(Venta venta);

}
