package Models;

/**
 *
 * @author 
 */
public class Item {

    private int id_item;
    private int cantidad;
    private int total;
    private Carretera carretera;
    private Pedido pedido;

    public Item() {
    }

    public int getId_item() {
        return id_item;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Carretera getCarretera() {
        return carretera;
    }

    public void setId_item(int id_item) {
        this.id_item = id_item;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCarretera(Carretera carretera) {
        this.carretera = carretera;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getTotal() {
        return total;
    }

}
