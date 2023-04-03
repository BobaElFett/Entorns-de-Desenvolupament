import java.util.Objects;

public class Time {

    private int horas;
    private int minutos;
    private int segundos;

    public Time(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Time nextSecond(Time t) {
        if (t.segundos == 59) {
            t.segundos = 0;
            if (t.minutos == 59) {
                t.minutos = 0;
                if (t.horas == 23) {
                    t.horas = 0;
                } else {
                        t.horas++;
                }
            } else {
                t.minutos++;
            }
        } else {
            t.segundos++;
        }
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;
        // Verifica si el objeto pasado es nulo o si es de una clase diferente a la clase Time

        Time time = (Time) o;
        // Convierte el objeto pasado en una instancia de la clase Time

        return horas == time.horas && minutos == time.minutos && segundos == time.segundos;
        // Compara las horas, minutos y segundos de ambos objetos, devolviendo verdadero si son iguales
    }

    @Override
    public int hashCode() {
        return Objects.hash(horas, minutos, segundos);
    }
}
