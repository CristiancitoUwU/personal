package admin;

import javax.swing.JOptionPane;

public class Factura extends Clientes{
    
    private int idFactura;
    private int cantidad;
    private String descripcion;
    private float valorUnitario;
    private float iva;
    private float total;

    public Factura(int idFactura, int cantidad, String descripcion, float valorUnitario, int idCliente, String nombres, String telefono, String correo) {
        super(idCliente, nombres, telefono, correo);
        this.idFactura = idFactura;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.valorUnitario = valorUnitario;
    }
    
    public float CalculoIva(int cantidad, int valorUnitario){
        this.iva = (((cantidad * valorUnitario) * 19) / 100);
        return iva;
    }
    
    public float CalculoTotal(int cantidad, int valorUnitario){
        this.total = (cantidad * valorUnitario + iva);
        return total;
    }
    
    public void MostrarFactura(){
        JOptionPane.showMessageDialog(null,
                  " ============== Factsoft ==============" + "\n" + "\n"
                + "# Factura: " + this.idFactura + "\n"
                + "ID Cliente: " + super.getIdCliente() + "\n"
                + "Nombre cliente: " + super.getNombres() + "\n"
                + "Telefono cliente: " + super.getTelefono() + "\n"
                + "Cantidad: " + this.cantidad + "\n"
                + "Producto: " + this.descripcion + "\n"
                + "Precio: " + this.valorUnitario + "\n" + "\n"
                + " ============== A PAGAR ============== " + "\n" + "\n"
                + "IVA: " + this.iva + "\n"
                + "TOTAL: " + this.total + "\n"
        );
    }
}
