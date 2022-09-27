import java.util.Scanner;

public class Ejercicio09 {
    //9. Escribe un programa que calcule (y muestre) cuántas horas, minutos y segundos han
    //transcurrido entre dos momentos del mismo día. Para ello, el programa ha de pedir
    //por teclado seis números enteros: las horas, minutos y segundos para el momento
    //inicial y lo mismo para el momento final. De momento vamos a considerar que los
    //números introducidos van a estar en el rango adecuado y que el momento inicial
    //introducido es menor (o igual) que el momento final. Por ejemplo, si se introducen
    //los números 1, 2, 30,15, 21, 1 entenderemos que el momento inicial es 1:02:30 am y
    //el momento final es 15:21:1. El programa debe mostrar por pantalla la diferencia en
    //el formato: hh:mm:ss.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Momento inicial");
        System.out.println("---------------");
        System.out.println("Introduce la hora: ");
        int h1 = sc.nextInt();
        System.out.println("Introduce los minutos");
        int m1 = sc.nextInt();
        System.out.println("Introduce los segundos");
        int s1 = sc.nextInt();
        System.out.println(" Hora: " + h1 + "h " + m1 + "' " + s1 +"'' am ");

        System.out.println("Momente final");
        System.out.println("-------------");
        System.out.println("Introduce la hora");
        int h2 = sc.nextInt();
        System.out.println("Introduce los minutos");
        int m2 = sc.nextInt();
        System.out.println("Introduce los segundos");
        int s2 = sc.nextInt();
        System.out.println(" Hora: " + h2 + "h " + m2 + "' " + s2 +"'' pm ");

        int segundosMomentoInicial = (h1 * 3600) + (m1 * 60) + s1;
        int segundosMomentoFinal = (h2 * 3600) + (m2 * 60) + s2;

        int diferenciaTotal = (segundosMomentoFinal - segundosMomentoInicial);

        int resultado1 = diferenciaTotal / 3600; int resultado2= resultado1 * 60; int resultado3 = diferenciaTotal % 3600;
        System.out.println("La diferencia de tiempo es: " + resultado1 + " h " + resultado2 + " ' " + resultado3 + " ''");









    }
}
