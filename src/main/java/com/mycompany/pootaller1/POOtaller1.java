package com.mycompany.pootaller1;
import java.util.Scanner;
public class POOtaller1 {

    public static void main(String[] args) {
        double Juan, Alberto, Ana;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la edad de juan: ");
        Juan = entrada.nextDouble();
        Alberto = Juan*2/3;
        Ana = Juan*4/3;
        Juan = Math.round(Math.floor(Juan));     //Esto sirve para que la edad quede número entero, sin decimales
        Alberto = Math.round(Math.floor(Alberto));
        Ana = Math.round(Math.floor(Ana));
        System.out.println("La edad de Juan es: " +Juan + " años");
        System.out.println("La edad de Alberto es: " + Alberto + " años");
        System.out.println("La edad de Ana es: " + Ana + " años");
        System.out.println("La edad de la madre de Juan es: " + Math.round(Math.floor((Juan+Alberto+Ana))) + " años");
    }
}
