import java.util.Scanner;

public class Ejercicio04 {
    //4.Escribir un programa en el cual se piden cuatro números y se calcule e imprima la
    //suma de los dos primeros y el producto del tercero y el cuarto.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe cuatro números:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        System.out.println("La suma del primer número y el segundo es..." + (num1 + num2));
        System.out.println("El producto del tercer y cuarto número es..." + (num3 * num4));



    }
}
