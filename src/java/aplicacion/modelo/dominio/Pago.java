package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Cristian
 */
public class Pago implements Serializable {

    private int codigo;
    private String nombre;
    private String descripcion;

    //Constructores
    public Pago() {
    }

    public Pago(int codigo, String nombre, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    //Getters & Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
