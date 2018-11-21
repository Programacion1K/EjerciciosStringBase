public class Ejercicios {
    public static String subcadenaMayuscula(String cadena,String subcadena){
        return cadena.replace(subcadena,subcadena.toUpperCase());
    }

    public static String cadenaConComas(String cadena){
        String salida="";
        for (int i = 0; i < cadena.length()-1; i++) {
            char caracterActual=cadena.charAt(i);
            salida+=caracterActual;
            if(caracterActual!=','){
                salida+=',';
            } //MIRAR
        }
        salida+=cadena.charAt(cadena.length()-1);
        return salida;
    }

    public static void main(String[] args) {
        System.out.println(subcadenaMayuscula("vijsdfn ndfsnsdjkl nkfjdnfds kjldf sjklnfd jkl","4774"));
        System.out.println(cadenaConComas("Cadena de, ejemplo, con coma"));
    }
}
