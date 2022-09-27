import java.util.Scanner;

public class Ejercicio3 {
    //3. A partir de una variable num1 con valor inicial 12 y una variable num2 con valor
    //inicial 4, crear nuevas variables que almacenen el resultado de realizar la suma, resta,
    //multiplicación, división y resto de num1 y num2. Mostrar el valor de las nuevas
    //variables por pantalla.
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 4;
        int resultado1 = num1 + num2;
        int resultado2 = num1 - num2;
        int resultado3 = num1 * num2;
        int resultado4 = num1 / num2;
        int resultado5 = num1 % num2;
        System.out.println("La suma de " + num1 + " más " + num2 + ", dá como resultado..." + resultado1);
        System.out.println("La resta de " + num1 + " menos " + num2 + ", dá como resultado..." + resultado2);
        System.out.println("La multiplicación de " + num1 + " por " + num2 + ", dá como resultado..." + resultado3);
        System.out.println("La división de " + num1 + " entre " + num2 + ", dá como resultado..." + resultado4);
        System.out.println("El resto de " + num1 + " y " + num2 + ", dá como resultado..." + resultado5);


    }
}
