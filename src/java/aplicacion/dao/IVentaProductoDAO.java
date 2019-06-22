package aplicacion.dao;

import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.dominio.Venta;
import aplicacion.modelo.dominio.VentaProducto;
import java.util.Set;

/**
 *
 * @author Cristian
 */
public interface IVentaProductoDAO {

    public Set<VentaProducto> obtenerVentasProductos(Venta venta);

    public void crearVentaProducto(Producto producto, Venta venta);

    public void eliminarVentaProducto(Producto producto, Venta venta);

    public void modificarVentaProducto(Producto producto, Venta venta);
}
