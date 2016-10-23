import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String cadena;
        Scanner datos = new Scanner(System.in);
        cadena = datos.nextLine();
        automata(cadena);
    }
    static boolean automata(String cadena){
        for (int i = 0; i < cadena.length(); i++)
        {
            Character c = cadena.charAt(i);
            System.out.println(c);
        }
            return false;

    }
}
