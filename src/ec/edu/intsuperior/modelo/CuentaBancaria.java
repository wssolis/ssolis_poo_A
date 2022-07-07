package ec.edu.intsuperior.modelo;

public class CuentaBancaria {
    private Cliente c1;
    private String numCuenta;
    private double saldo;
    public enum TipoCuenta{AHORROS, CORRIENTE}
    private TipoCuenta tipo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(Cliente c1, String numCuenta, double saldo, TipoCuenta tipo) {
        this.c1 = c1;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public void setC1(Cliente c1) {
        this.c1 = c1;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    
    
    
}
