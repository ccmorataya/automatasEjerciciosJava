import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String cadena;
        System.out.println("Ingresa la cadena a comprobar:");
        Scanner datos = new Scanner(System.in);
        cadena = datos.nextLine();
        if (automataUno.afd(cadena)){
            System.out.println("La cadena " + cadena + " es valida");
        }
        else {
            System.out.println("La cadena " + cadena + " es invalida");
        }
    }
}
