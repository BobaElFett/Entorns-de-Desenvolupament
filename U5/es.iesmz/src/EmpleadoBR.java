public class EmpleadoBR {
    public static void main(String[] args) {

        System.out.println(calculaSalarioBruto(TipoEmpleado.encarregat, 1000, 10));

        float sa = calculaSalarioBruto(TipoEmpleado.encarregat, 1000, 10);

        System.out.println(calculaSalarioNeto(sa));

        System.out.println(calculaSalarioBruto(null, 0, 0));
    }

    public static float calculaSalarioBruto( TipoEmpleado tipus, float ventasMes, float horasExtra) {
        float salario = 0;

        if (tipus == null || ventasMes < 0 || horasExtra < 0){
            return -1;
        }

        if (tipus == TipoEmpleado.venedor){
            salario += 1000;
        } else {
            salario += 1500;
        }

        if (ventasMes >= 1000  && ventasMes < 1500) {
            salario += 100;
        } else if (ventasMes >= 1500) {
            salario += 200;
        }

        salario += 20 * horasExtra;

        return salario;
    }

    public static float calculaSalarioNeto(float salarioBruto) {
        float retencio = salarioBruto;

        if (salarioBruto < 0) {
            return -1;
        } else if (salarioBruto >= 1000 && salarioBruto < 1500) {
            retencio = (float) (salarioBruto * (1.0 - (16.0/100.0)));
            return retencio;
        } else if (salarioBruto >= 1500) {
             retencio = (float) (salarioBruto * (1.0 - (18.0/100.0)));
            return retencio;
        } else {
            return retencio;
        }
    }
}
