import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu.displayHome();
        Scanner datos = new Scanner(System.in);
        int option;
        option = Integer.parseInt(datos.nextLine());
        datos.reset();
        if (option == 1){
            System.out.println("Ingresa la cadena a comprobar:");
            String cadena;
            cadena = datos.nextLine();
            if (automata.afdUno(cadena)){
                System.out.println("La cadena " + cadena + " es valida");
            }
            else {
                System.out.println("La cadena " + cadena + " es invalida");
            }
        }
        else if (option == 2){
            System.out.println("Ingresa la cadena a comprobar:");
            String cadena;
            cadena = datos.nextLine();
            if (automata.afdDos(cadena)){
                System.out.println("La cadena " + cadena + " es valida");
            }
            else {
                System.out.println("La cadena " + cadena + " es invalida");
            }
        }
        else if (option == 3){
            System.out.println("Ingresa la cadena a comprobar:");
            String cadena;
            cadena = datos.nextLine();
            if (automata.afdTres(cadena)){
                System.out.println("La cadena " + cadena + " es valida");
            }
            else {
                System.out.println("La cadena " + cadena + " es invalida");
            }
        }
        else if (option == 4){
            System.out.println("Ingresa la cadena a comprobar:");
            String cadena;
            cadena = datos.nextLine();
            if (automata.afdCuatro(cadena)){
                System.out.println("La cadena " + cadena + " es valida");
            }
            else {
                System.out.println("La cadena " + cadena + " es invalida");
            }
        }
        else if (option == 5){
            System.out.println("Ingresa la cadena a comprobar:");
            String cadena;
            cadena = datos.nextLine();
            if (automata.afdCinco(cadena)){
                System.out.println("La cadena " + cadena + " es valida");
            }
            else {
                System.out.println("La cadena " + cadena + " es invalida");
            }
        }
    }
}
