/**
 * @author Christian Quiroz
 * Clase carretera con sus atributos pertinentes
 */
package Models;

public class Carretera {

    private int id_carretera;
    private String nombre;
    private int precio;

    public Carretera() {
    }

    public Carretera(int id_carretera, String nombre, int precio) {
        this.id_carretera = id_carretera;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId_carretera() {
        return id_carretera;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setId_carretera(int id_carretera) {
        this.id_carretera = id_carretera;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
