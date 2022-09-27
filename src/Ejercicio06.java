import java.util.Scanner;

public class Ejercicio06 {
    //6. N ardillas encuentran K nueces y deciden dividirlas equitativamente. Escribe un
    //programa que calcule (y muestre) cuántas nueces corresponden a cada ardilla y
    //cuántas sobrarán tras el reparto.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántas ardillas son?");
        int N = sc.nextInt();
        System.out.println("¿Y cuántas nueces se encuentran?");
        int K = sc.nextInt();
        System.out.println("Cada ardilla toca a " + K / N);
        System.out.println("Y encima les sobraron " + K % N);
    }
}
