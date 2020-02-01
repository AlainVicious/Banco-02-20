package app.prueba;

import app.dominio.Cliente;
import app.dominio.Cuenta;;

/**
 * PruebaCuenta
 */
public class PruebaCuenta {
    public static void main(String args[]) {
        Cliente cliente = new Cliente();
        Cuenta cuenta = new Cuenta();

        cliente.idCliente = "M001";
        cliente.nombre = "Carmin";
        cliente.apellidos = "Luna";
        cliente.edad = 18;
        cliente.anioAfiliacion = 2005;
        cliente.codigoPostal = 54715;
        cliente.sueldo = 123.89F;

        cuenta.numeroCuenta = 123456;
        cuenta.propietario = "M001";
        cuenta.clabe = 123_456_789_101_112L;
        cuenta.saldo = 189.52;
        cuenta.tipoCuenta = 'C';

        cliente.cuentaCliente = cuenta;
        
        cliente.mostrarCliente();

        cliente.cuentaCliente.mostrarInformacionCuenta();

        cuenta.saldo = 0;

        System.out.println(cliente.cuentaCliente.saldo);
    }
}