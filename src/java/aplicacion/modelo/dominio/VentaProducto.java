package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Cristian
 */
public class VentaProducto implements Serializable{
    private int codigo;
    private Producto producto;
    private int cantidad;
    private double importe;
    
    //Constructor

    public VentaProducto() {
    }

    public VentaProducto(int codigo, Producto producto, int cantidad, double importe) {
        this.codigo = codigo;
        this.producto = producto;
        this.cantidad = cantidad;
        this.importe = importe;
    }
    
    public VentaProducto(Producto producto, int cantidad, double importe) {
        
        this.producto = producto;
        this.cantidad = cantidad;
        this.importe = importe;
    }
    
    //Setters & Getters

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    

    
}
