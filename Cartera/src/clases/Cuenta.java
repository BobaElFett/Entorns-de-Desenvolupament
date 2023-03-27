package clases;

public class Cuenta {

    private double saldo;

    public Cuenta() {
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double i) {
        if(!esCantidadValida(i))
            saldo = 0.0f;
        else {
            saldo += i;
        }
    }

    public boolean esCantidadValida(double cantidad){
        if(cantidad < 0 || cantidad > 6000) {
            return false;
        }
        else {
            return true;
        }
    }

    public void retirar(double i) {
        if (i <= saldo && i > 0 && i <= 6000) {
            saldo -= i;
        }
    }

    public void tranferencia(double i, Cuenta cuenta) {
        if (i > 0 && i <= 3000) {
            this.saldo -= i;
            cuenta.saldo += i;
        }
    }
}
