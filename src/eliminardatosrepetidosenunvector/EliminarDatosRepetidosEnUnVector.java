/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eliminardatosrepetidosenunvector;

import java.util.Scanner;

/**
 *
 * @author Gerardo Fac
 */
public class EliminarDatosRepetidosEnUnVector {

    public static int suma;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca la cantidad de datos que desee: ");
        int cantidaddatos = entrada.nextInt();

        int vectordat[] = new int[cantidaddatos];

        for (int i = 0; i < cantidaddatos; i++) {
            System.out.println("Ingrese el dato " + (i + 1));
            vectordat[i] = entrada.nextInt();

        }

        System.out.println("Los datos que a ingresado son: ");
        for (int i = 0; i < cantidaddatos; i++) {

            System.out.print(vectordat[i]);

            if ((i + 1) < cantidaddatos) {
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
        }

        System.out.println("");

        int DatosSin = 0;
        System.out.println("Se eliminaron los datos repetidos....");
        System.out.println("Los nuevos datos son: ");
        for (int i = 0; i < (cantidaddatos); i++) {
            suma = 0;

            for (int j = 0; j < i; j++) {

                if (i == 0) {

                    if (vectordat[i] == vectordat[j]) {
                        suma = 0;
                    }

                } else {

                    if (vectordat[i] != vectordat[j]) {
                        suma = suma + 0;
                    } else if (vectordat[i] == vectordat[j]) {
                        suma = suma + 1;
                    }

                }

            }

            if (suma == 0) {

                DatosSin = DatosSin + 1;
                System.out.print(vectordat[i]);

                if (i + 1 < cantidaddatos) {

                    System.out.print(" ");

                } else {
                    System.out.println(".");
                    System.out.println("El numero de elementos que permanecen en el nuevo vector es: " + DatosSin);
                    System.out.println();
                }

            }

        }

    }
}
