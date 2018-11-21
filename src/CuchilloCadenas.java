public class CuchilloCadenas {
    public static void main(String[] args) {
        String cadena="programa que muestre una cadena dividida en trozos del tamaño";
        int tamanyo=7;
        //Primera solución
        int indicePrincipio=0;
        int indiceFinal=tamanyo;
        while(indiceFinal<cadena.length()){
            System.out.println(cadena.substring(indicePrincipio, indiceFinal));
            indicePrincipio+=tamanyo;
            indiceFinal+=tamanyo;
        }
        System.out.println(cadena.substring(indicePrincipio));

        //Segunda forma
        String cadenaQueSePierde=cadena;
        while(cadenaQueSePierde.length()>tamanyo){
            System.out.println(cadenaQueSePierde.substring(0, tamanyo));
            cadenaQueSePierde=cadenaQueSePierde.substring(tamanyo);
        }
        System.out.println(cadenaQueSePierde);

    }
}
