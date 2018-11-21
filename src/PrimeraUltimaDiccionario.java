import java.util.Scanner;

public class PrimeraUltimaDiccionario {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String entrada=sc.nextLine();
        String maximo=entrada;
        String minimo=entrada;
        while(!entrada.equalsIgnoreCase("FIN")){
            if(entrada.compareTo(maximo)>0){
                maximo=entrada;
                System.out.println("Act");
            }
            if(entrada.compareTo(minimo)<0){
                minimo=entrada;
                System.out.println("EE");
            }
            entrada=sc.nextLine();
        }
        System.out.println("Primera palabra:" + minimo + " Última Palabra:" + maximo);
    }
}
