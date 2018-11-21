public class Inversa {
    public static String inversaCadena(String cadena) {

        if(cadena==null){
            return null;
        }
        if(cadena.length()==1){
            return cadena;
        }
        String salida="";
        for (int i = 0; i < cadena.length(); i++) {
            salida=cadena.charAt(i)+salida;
        }
        return salida;
    }
}
