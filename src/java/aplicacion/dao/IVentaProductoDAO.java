package aplicacion.dao;

import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.dominio.Venta;
import aplicacion.modelo.dominio.VentaProducto;
import java.util.List;


/**
 *
 * @author Cristian
 */
public interface IVentaProductoDAO {
    
    public void agregarVentaProductoALista(VentaProducto ventaproducto);
    
    public List<VentaProducto> listaVentasProducto();
    
    public List<VentaProducto> listaVentasProductoPendientes();

    public void crearVentaProducto(VentaProducto ventaProducto);

    public void eliminarVentaProducto(Producto producto, Venta venta);

    public void modificarVentaProducto(Producto producto, Venta venta);
}
