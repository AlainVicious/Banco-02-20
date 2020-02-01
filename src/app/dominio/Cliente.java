package app.dominio;

/**
 * Cliente
 */
public class Cliente {

    public String idCliente;
    public String nombre;
    public String apellidos;
    public byte edad;
    public short anioAfiliacion;
    public int codigoPostal;
    public float sueldo;
    
    public Cuenta cuentaCliente;

    public void mostrarCliente() {
        System.out.println("ID: " + idCliente
                            + " nombre: " + nombre
                            + " apellidos: " + apellidos
                            + " edad: " + edad
                            + " afiliacion: " + anioAfiliacion
                            + " CP: " + codigoPostal
                            + " sueldo: " + sueldo);
    }
    
}