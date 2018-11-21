public class Espejo {
    public static String espejoCadena(String cadena) {

        return cadena+Inversa.inversaCadena(cadena).substring(1);
    }
}
