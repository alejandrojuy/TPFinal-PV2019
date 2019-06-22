package aplicacion.dao;

import aplicacion.modelo.dominio.Usuario;
import aplicacion.modelo.dominio.Venta;
import java.util.Set;

/**
 *
 * @author Cristian
 */
public interface IVentaDAO {

    public Set<Venta> obtenerVentas(Usuario usuario);

    public void agregarVenta(Venta venta);

    public void eliminarVenta(Venta venta);

    public void modificarVenta(Venta venta);

    public void emitirComprobante(Venta venta);

}
