package gestioncuentas.es.cifpcarlosiii.ed1daw.ut4;

/**
 * Descripcion cuenta
 * @author Maria isabel
 * @version 1.2
 */
public class Cuenta {

    private String titular;
    private double saldo;


    public Cuenta() {

        setSaldo(0);
    }

    public Cuenta(String titular) {
        this.titular = titular;
    }

    /**
     * IMprime por pantalla el titular y saldo
     */


    public void mostrarDatos() {
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: " + getSaldo());
    }

    /**
     * DEscripcion metodo retirarConControl
     * @param cantidad {double} cantidad del saldo
     * @return {boolean}
     */

    public boolean retirarConControl(double cantidad) {
        if (cantidad <= getSaldo()) {
            setSaldo(getSaldo() - cantidad);
            return true;
        } else {
            return false;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
