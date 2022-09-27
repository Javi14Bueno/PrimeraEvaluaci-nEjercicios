package VariablesOperaciones;

import java.util.Scanner;

public class EjemplosDecimales {
    public static void main(String[] args) {
        //TIPO DOUBLE
        double ceroComaCero = 0.0;
        double unoComaCero = 1.0;
        double decimalNegativo = -1.0;

        //TIPO FLOAT
        float decimalFloat = 1.3f;
        float dcimalLargo = -3.12344273214123f;
        System.out.println(dcimalLargo); // perdemos precisión

        //Notación cientifica

        double eps = 5e-3; // es lo mismo que 5 + 10^(-3) = 0.005
        System.out.println(eps);
        double n = 0.01e2; // es lo mismo que 0.01 + 10^2 = 1.0
        System.out.println(n);


        //Operaciones aritméticas:
        System.out.println("Suma: " + (eps + n));
        System.out.println("Resta: " + (eps - n));
        System.out.println("Producto: " +  (eps * n));
        System.out.println("Division: " + (eps / n));
        //no tiene sentido hacer el % resto

        //¿Que pasa si divido números enteros y los guardo en una variable con decimales?
        double d1 = 5 / 4; //divide dos números enteros (división entera) y lo asigna a la variable decimal
        System.out.println("División 1: " + d1);
        double d2 = 5.0 / 4.0; // divide dos números decimales (división decimal)
        System.out.println("División 2 : " + d2);

        //Falta de precisión a veces con las variables primitivas decimales
        System.out.println(3.3 / 3); // imprime 0.9999999999999

        //Leer desde teclado
        Scanner sc = new Scanner(System.in);
        float decimalPorTeclado = sc.nextFloat();
        System.out.println(decimalPorTeclado);
        double doublePorTeclado = sc.nextDouble();
        System.out.println(doublePorTeclado);













    }
}
