package Taller17.Ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        CuentaBancaria cuentaNormal = new CuentaBancaria(1000);
        CuentaBancaria cuentaAhorros = new CuentaAhorros(2000);

        cuentaNormal.consultarSaldo();
        cuentaAhorros.consultarSaldo();

        cuentaNormal.depositar(500);
        cuentaAhorros.depositar(500);

        CuentaAhorros cuentaAhorros1 = new CuentaAhorros(2000);
        cuentaAhorros1.generarIntereses(5);  
}

}
