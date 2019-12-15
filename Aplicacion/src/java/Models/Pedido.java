package Models;

/**
 *
 * @author Christian Quiroz
 *
 */
public class Pedido {

    private int id_pedido;
    private String opc_envio;
    private String opc_pago;
    private Empresa empresa;
    
    public Pedido() {

    }

    public int getId_pedido() {
        return id_pedido;
    }

    public String getOpc_envio() {
        return opc_envio;
    }

    public String getOpc_pago() {
        return opc_pago;
    }


    public Empresa getEmpresa() {
        return empresa;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public void setOpc_envio(String opc_envio) {
        this.opc_envio = opc_envio;
    }

    public void setOpc_pago(String opc_pago) {
        this.opc_pago = opc_pago;
    }


    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

}
