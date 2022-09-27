import java.util.Scanner;

public class Ejercicio05corregir {
    //5.5. Escribe un programa que lea un valor entero n de la entrada estándar y muestre el
    //resultado de la siguiente expresión aritmética: ((n + 1) * n + 2) * n + 3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuánto vale n?");
        int n = sc.nextInt();
        System.out.println("El resultado sería el siguiente: ((n + 1) * n + 2) * n + 3 = " + ((n + 1) * n + 2) * n + 3 );



    }
}
