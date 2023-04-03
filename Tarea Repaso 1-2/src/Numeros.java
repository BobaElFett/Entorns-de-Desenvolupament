public class Numeros {
    public static int soniguales(int a, int b, int c) {
        if (a == b && b == c) {
            return 0;
        } else if (a == b || b == c || a == c) {
            return 1;
        } else {
            return 2;
        }
    }
}
