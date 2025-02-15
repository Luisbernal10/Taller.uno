package Taller.uno;

public class CuentaBancaria {
    int numeroCuenta;
    double saldo;
    String tipoCuenta;

    // Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = 0;
        this.saldo = 0.0;
        this.tipoCuenta = "Desconocido";
    }

    // Constructor parametrizado con dos parámetros (numeroCuenta y tipoCuenta)
    public CuentaBancaria(int numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0; // Se inicializa con saldo en 0
        this.tipoCuenta = tipoCuenta;
    }

    // Constructor sobrecargado con tres parámetros (numeroCuenta, saldo, tipoCuenta)
    public CuentaBancaria(int numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
    public String toString() {
        return "CuentaBancaria{" + "Número de Cuenta=" + numeroCuenta +", Saldo=" + saldo +", Tipo de Cuenta='" + tipoCuenta + '\'' + '}';
    }
}
