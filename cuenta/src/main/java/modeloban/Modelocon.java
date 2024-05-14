package modeloban;

public class Modelocon {

    private int saldo; 

    public Modelocon(int saldoInicial) {
        this.saldo = saldoInicial;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void depositar(int cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que 0.");
        }
    }

    public boolean retirar(int cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Saldo actual: " + saldo);
            return true; 
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida. Saldo actual: " + saldo);
            return false; 
        }
    }
}
