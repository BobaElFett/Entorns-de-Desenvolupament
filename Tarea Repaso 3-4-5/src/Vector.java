public class Vector {
    public static int [] reverso(int [] v) {
        int [] v2 = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            v2[i] = v[v.length - 1 - i];
        }
        return v2;
    }
}
