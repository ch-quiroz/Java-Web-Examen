package Models;

/**
 * @author Christian Quiroz Clase empresa con sus atributos pertinentes
 */
public class Empresa {

    private int id_empresa;
    private String rutEmpresa;
    private String nombreEmpresa;
    private String direccion;
    private String comprador;

    public Empresa() {
    }

    public Empresa(int id_empresa, String rutEmpresa, String nombreEmpresa, String direccion, String comprador) {
        this.id_empresa = id_empresa;
        this.rutEmpresa = rutEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.comprador = comprador;
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public String getRutEmpresa() {
        return rutEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getComprador() {
        return comprador;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public void setRutEmpresa(String rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

}
