package test;

import clases.Cuenta;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCartera {

    @Test
    public void testAlCrearCuentaElSaldoEsCero() {
        Cuenta c = new Cuenta();
        assertEquals(0,c.getSaldo());
    }

    @Test
    public void testAlIngresar100EnCuentaVaciaElSaldoEs100() {
        Cuenta c = new Cuenta();
        c.ingresar(100);
        assertEquals(100,c.getSaldo());
    }

    @Test
    void testAlIngresar3000EnCuentaVaciaElSaldoEs3000(){
        Cuenta c = new Cuenta();
        c.ingresar(3000);
        assertEquals(3000,c.getSaldo());
    }

    @Test
    void testAlIngresar100EnCuentaCon3000ElSaldoEs3100(){
        Cuenta c = new Cuenta();
        c.ingresar(100);
        c.ingresar(3000);
        assertEquals(3100,c.getSaldo());
    }

    @Test
    void testNoSePuedeIngresarCAntidadNegativa() {
        Cuenta c = new Cuenta();
        c.ingresar(-100);
        assertEquals(0,c.getSaldo());
    }

    @Test
    void IngresoCantidad2Decimales(){
        Cuenta c = new Cuenta();
        c.ingresar(100.45);
        assertEquals(100.45,c.getSaldo());
    }

    @Test
    void testIngresoMaximoEsDe6000(){
        Cuenta c = new Cuenta();
        c.ingresar(6000);
        assertEquals(6000,c.getSaldo());
    }
    @Test
    void testIngresoMasDe6000NoEsValido(){
        Cuenta c = new Cuenta();
        c.ingresar(6000.01);
        assertEquals(0,c.getSaldo());
    }

    @Test
    void testRetirar100(){
        Cuenta c = new Cuenta();
        c.ingresar(500);
        c.retirar(100);
        assertEquals(400,c.getSaldo());
    }

    @Test
    void testRetirar500(){
        Cuenta c = new Cuenta();
        c.ingresar(200);
        c.retirar(500);
        assertEquals(200,c.getSaldo());
    }

    @Test
    void testRetirarMenys100(){
        Cuenta c = new Cuenta();
        c.ingresar(500);
        c.retirar(-100);
        assertEquals(500,c.getSaldo());
    }

    @Test
    void testRetirar100_4(){
        Cuenta c = new Cuenta();
        c.ingresar(500);
        c.retirar(100.45);
        assertEquals(399.55,c.getSaldo());
    }

    @Test
    void testRetirar6000(){
        Cuenta c = new Cuenta();
        c.ingresar(6000);
        c.ingresar(1000);
        c.retirar(6000);
        assertEquals(1000,c.getSaldo());
    }

    @Test
    void testRetirar6000_01(){
        Cuenta c = new Cuenta();
        c.ingresar(6000);
        c.ingresar(1000);
        c.retirar(6000.01);
        assertEquals(7000,c.getSaldo());
    }

    @Test
    void testTransferencia100(){
        Cuenta c1 = new Cuenta();
        c1.ingresar(500);
        Cuenta c2 = new Cuenta();
        c2.ingresar(50);
        c1.tranferencia(100,c2);
        assertEquals(400,c1.getSaldo());
        assertEquals(150,c2.getSaldo());
    }

    @Test
    void testTransferencia_100(){
        Cuenta c1 = new Cuenta();
        c1.ingresar(500);
        Cuenta c2 = new Cuenta();
        c2.ingresar(50);
        c1.tranferencia(-100,c2);
        assertEquals(500,c1.getSaldo());
        assertEquals(50,c2.getSaldo());
    }

    @Test
    void testTransferencia3000(){
        Cuenta c1 = new Cuenta();
        c1.ingresar(3500);
        Cuenta c2 = new Cuenta();
        c2.ingresar(50);
        c1.tranferencia(3000,c2);
        assertEquals(500,c1.getSaldo());
        assertEquals(3050,c2.getSaldo());
    }

    @Test
    void testTransferencia3000_01(){
        Cuenta c1 = new Cuenta();
        c1.ingresar(3500);
        Cuenta c2 = new Cuenta();
        c2.ingresar(50);
        c1.tranferencia(3000.01,c2);
        assertEquals(3500,c1.getSaldo());
        assertEquals(50,c2.getSaldo());
    }
}