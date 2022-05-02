package admin;

import javax.swing.JOptionPane;

public class CostiFactsoft {
    
    public static void main(String[] args) {
        
        int idFactura, cantidad, idCliente, valorUnitario;
        String nombres, telefono, correo, descripcion;
        float iva, total;
        
        idFactura = Integer.parseInt(JOptionPane.showInputDialog(
                "=== FactSoft ===" + "\n" + "Digite la ID de la factura"));
        idCliente = Integer.parseInt(JOptionPane.showInputDialog(
                "=== FactSoft ===" + "\n" + "Digite la ID del cliente"));
        nombres = JOptionPane.showInputDialog(
                "=== FactSoft ===" + "\n" + "Digite los nombres del cliente");
        telefono = JOptionPane.showInputDialog(
                "=== FactSoft ===" + "\n" + "Digite el telefono del cliente");
        correo = JOptionPane.showInputDialog(
                "=== FactSoft ===" + "\n" + "Digite el correo del cliente");
        descripcion = JOptionPane.showInputDialog(
                "=== FactSoft ===" + "\n" + "Digite el nombre del producto");
        valorUnitario = Integer.parseInt(JOptionPane.showInputDialog(
                "=== FactSoft ==="+ "\n" + "Digite el valor del producto"));
        cantidad = Integer.parseInt(JOptionPane.showInputDialog(
                "=== FactSoft ==="+ "\n" + "Digite la cantidad de " + descripcion));
        
        Factura parceraFactura = new Factura(idFactura, cantidad, descripcion, valorUnitario, idCliente, nombres, telefono, correo);
        iva = parceraFactura.CalculoIva(cantidad, valorUnitario);
        total = parceraFactura.CalculoTotal(cantidad, valorUnitario);
        parceraFactura.MostrarFactura();
    }
    
}
