package app.dominio;

/**
 * Cuenta
 */
public class Cuenta {
    // declaracion de propiedades
    public int numeroCuenta;
    public String propietario;
    public double saldo;
    public long clabe;
    public char tipoCuenta;
    public boolean activa;

    {
        System.out.println("Iniciando cuenta...");
    }

    /**
     * muestra la informacion de la cuenta
     */
    public void mostrarInformacionCuenta() {
        System.out.println("Cuenta: " + numeroCuenta
                            + " Propietario: " + propietario
                            + " Saldo: " + saldo
                            + " CLABE: " + clabe
                            + " tipo: " + tipoCuenta);
    }
}