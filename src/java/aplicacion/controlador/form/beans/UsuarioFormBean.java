package aplicacion.controlador.form.beans;

import aplicacion.controlador.beans.UsuarioBean;
//import aplicacion.modelo.dominio.Rol;
import aplicacion.modelo.dominio.Usuario;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.primefaces.event.RowEditEvent;


/**
 *
 * @author Cristian
 */
@ManagedBean
@ViewScoped
public class UsuarioFormBean implements Serializable{

    @ManagedProperty(value = "#{usuarioBean}")
    private UsuarioBean usuarioBean;
    private boolean esAdministrador;
    private boolean esUsuario;
    private Usuario usuarioNuevo;
    private List<Usuario> listaDeUsuarios;
    //private List<Rol> listaDeRoles;
    private List<String> listadoProvincias;
    
    //Constructor
    public UsuarioFormBean() {
        listadoProvincias = new ArrayList<>();
        listaDeUsuarios = new ArrayList();
        //listaDeRoles = new ArrayList();
    }
    
    @PostConstruct
    public void init(){
        generarProvincias();
        //generarRoles();
        generarUsuarios();
    }

    //Metodos
    
    /**
     * Metodo que permite editar un usuario de la tabla usuarios
     * @param event
     */
    public void onRowEdit(RowEditEvent event){
        Usuario usuarioModificado = (Usuario) event.getObject();
        usuarioBean.modificarUsuario(usuarioModificado);
        FacesMessage msg = new FacesMessage("Exito","Usuario modificado correctamente");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    /**
     * Metodo que permite cancelar la edicion de una fila de la tabla usuarios
     * @param event 
     */
    public void onRowEditCancel(RowEditEvent event){
        FacesMessage msg = new FacesMessage("Edicion Cancelada","No se han modificado los cambios");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    /**
     * Metodo que obtiene los usuarios para cargar los usuarios 
     */
    public void generarUsuarios(){
        listaDeUsuarios = usuarioBean.obtenerUsuarios();
    }
    
    /**
     * Metodo que obtiene los Roles cargados en la bd 
     
    public void generarRoles(){
        listaDeRoles = usuarioBean.obtenerRoles();
    }*/
    
    /**
     * Metodo que carga la lista de Provincias 
     */
    public void generarProvincias(){
        listadoProvincias.add("Buenos Aires");
        listadoProvincias.add("Catamarca");
        listadoProvincias.add("Chaco");
        listadoProvincias.add("Chubut");
        listadoProvincias.add("Cordoba");
        listadoProvincias.add("Corrientes");
        listadoProvincias.add("Entre Rios");
        listadoProvincias.add("Formosa");
        listadoProvincias.add("Jujuy");
        listadoProvincias.add("La Pampa");
        listadoProvincias.add("La Rioja");
        listadoProvincias.add("Mendoza");
        listadoProvincias.add("Misiones");
        listadoProvincias.add("Neuquen");
        listadoProvincias.add("Rio Negro");
        listadoProvincias.add("Salta");
        listadoProvincias.add("San Juan");
        listadoProvincias.add("Santa Cruz");
        listadoProvincias.add("Santa Fe");
        listadoProvincias.add("Santiago Del Estero");
        listadoProvincias.add("Tierra Del Fuego");
        listadoProvincias.add("Tucuman");
    }
    
    /**
     * Retorna el nombre del Usuario que esta en sesion
     * @return nombre de un usuario 
     */
    public String devolverNombreUsuario(){
        Usuario usuario = (Usuario) FacesContext.getCurrentInstance()
                .getExternalContext().getSessionMap().get("usuario");
        return "[" + usuario.getApellido() + "," + usuario.getNombre() + "]";
    }
   
    /**
     * Metodo que agrega un nuevo usuario Comun 
     */
    public void agregarUsuarioComun() {
        //usuarioNuevo.setRol(new Rol(1,"UsuarioComun", "descripcion Usuario Comun"));
        usuarioNuevo.setRol("UsuarioComun");
        usuarioBean.agregarUsuario(usuarioNuevo);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Exito", "Se agrego un usuario correctamente"));
    }

    /**
     * Metodo que agrega un nuevo usuario Administrador 
     */
    public void agregarUsuarioAdministrador() {
        //usuarioNuevo.setRol(new Rol(2,"UsuarioAdministrador", "descripcion Usuario Administrador"));
        usuarioBean.agregarUsuario(usuarioNuevo);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Exito", "Se agrego un usuario Administrador correctamente"));
    }
    
    /**
     * Metodo que elimina un usuario 
     * @param usuario
     */
    public void eliminarUsuario(Usuario usuario) {
        usuarioBean.eliminarUsuario(usuario);
    }

    //Getters & Setters
    /**
     * Metodo que determina si el usuario logueado es administrador
     * @return esAdministrador
     */
    public boolean isEsAdministrador() {
        Usuario usuario = (Usuario) FacesContext.getCurrentInstance()
                .getExternalContext().getSessionMap().get("usuario");
        if (usuario.getRol().equals("Administracion")) {
            esAdministrador = true;
        } else {
            esAdministrador = false;
        }
        return esAdministrador;
    }
    /**
     * Metodo que redirecciona a la pagina del Login
     */
    public void mostrarLogin(){
     FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }

    public void setEsAdministrador(boolean esAdministrador) {
        this.esAdministrador = esAdministrador;
    }
    /**
     * Metodo que determina si el usuario logueado es usuario comun
     * @return esUsuario
     */
    public boolean isEsUsuario() {
        Usuario usuario = (Usuario) FacesContext.getCurrentInstance()
                .getExternalContext().getSessionMap().get("usuario");
        if (usuario.getRol().equals("UsuarioComun")) {
            esUsuario = true;
        } else {
            esUsuario = false;
        }
        return esUsuario;
    }

    public void setEsUsuario(boolean esUsuario) {
        this.esUsuario = esUsuario;
    }

    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }

    public List<Usuario> getListaDeUsuarios() {
        return listaDeUsuarios;
    }

    public void setListaDeUsuarios(List<Usuario> listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }

    public Usuario getUsuarioNuevo() {
        return usuarioNuevo;
    }

    public void setUsuarioNuevo(Usuario usuarioNuevo) {
        this.usuarioNuevo = usuarioNuevo;
    }

    public List<String> getListadoProvincias() {
        return listadoProvincias;
    }

    public void setListadoProvincias(List<String> listadoProvincias) {
        this.listadoProvincias = listadoProvincias;
    }
    public List<Usuario> lista2222()
    {List<Usuario> l = new ArrayList();
     Usuario usu = new Usuario("das", 212, "das", "dsa" , "sad ");
        l.add(usu);
     return l;
    }
    public void listarArrayUsuarioPdf()
        throws JRException, IOException{
        Map<String, Object> parametros = new HashMap<String, Object>();
        //puedo pasar parametros al report, siempre que el diseño lo soporte
        //parametros.put("usuario", "pepito");
        List<Usuario> usuarios = new ArrayList();
         
        usuarios = lista2222();
        File jasper = new File(FacesContext.getCurrentInstance().getExternalContext().getRealPath("/usuarioReport.jasper"));
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasper.getPath(), parametros, new JRBeanCollectionDataSource(usuarios));
        HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
        response.setContentType("application/pdf");
        response.addHeader("Content-disposition", "attachment; filename=usuario-report.pdf");
        ServletOutputStream stream = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(jasperPrint, stream);
        //exportamos a un archivo en disco
        //JasperExportManager.exportReportToPdfFile(jasperPrint, "e:/reporte.pdf");
        //mostrar en visor jasper
        //JasperViewer.viewReport(jasperPrint,false);
        stream.flush();
        stream.close();
        FacesContext.getCurrentInstance().responseComplete();
        }
}
