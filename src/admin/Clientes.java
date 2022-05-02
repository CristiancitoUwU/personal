package admin;
import java.util.Scanner;

public class Clientes {
    
    Scanner scan1 = new Scanner("This is the input string");
    
    private int idCliente;
    private String nombres;
    private String telefono;
    private String correo;

    public Scanner getScan1() {
        return scan1;
    }

    public void setScan1(Scanner scan1) {
        this.scan1 = scan1;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String Nombres) {
        this.nombres = Nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Clientes(int idCliente, String Nombres, String telefono, String correo) {
        this.idCliente = idCliente;
        this.nombres = Nombres;
        this.telefono = telefono;
        this.correo = correo;
    }
   
    
}
