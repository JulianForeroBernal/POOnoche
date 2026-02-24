public class Cuenta {
    // Atributos
    private String numCuenta;
    private String franquicia;
    private double saldo;
    //constructor vacío
    public Cuenta() {
    }
    // constructor con todos los parámetros
    public Cuenta(String numCuenta, String franquicia, double saldo) {
        this.numCuenta = numCuenta;
        this.franquicia = franquicia;
        this.saldo = saldo;
    }
    // getter - setter
    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(String franquicia) {
        this.franquicia = franquicia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    // to string
    @Override
    public String toString() {
        return "Cuenta{" +
                "numCuenta='" + numCuenta + '\'' +
                ", franquicia='" + franquicia + '\'' +
                ", saldo=" + saldo +
                '}';
    }
    public double depositar(double saldo){
        return (this.saldo + saldo);
    }
    public double retirar(double monto){
        return (this.saldo - monto);
    }
}
