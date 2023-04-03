public class Vocales2 {
    public static String sinvocales(String cadena) {
        String cadenaSinVocales = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != 'a' && cadena.charAt(i) != 'e' && cadena.charAt(i) != 'i' && cadena.charAt(i) != 'o' && cadena.charAt(i) != 'u' &&
                    cadena.charAt(i) != 'A' && cadena.charAt(i) != 'E' && cadena.charAt(i) != 'I' && cadena.charAt(i) != 'O' && cadena.charAt(i) != 'U') {
                cadenaSinVocales += cadena.charAt(i);
            }
        }
        return cadenaSinVocales;
    }
}
