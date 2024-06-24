package com.mycompany.contador.de.letras;

import java.util.Scanner;

public class ContadorDeLetras {
    public static void main(String[] args) {
        String[] palabrasTeclado = new String[3]; // Arreglo para almacenar 3 palabras
        int[] conteos = new int[26]; // Arreglo para contar la frecuencia de cada letra (a-z)

        // Leer 3 palabras del usuario
        for (int i = 0; i < palabrasTeclado.length; i++) {
            System.out.println("Ingrese un total de 3 palabras o frases");
            Scanner teclado = new Scanner(System.in);
            // Leer palabra del usuario
            System.out.print("Ingrese una palabra o frase (puede contener espacios o signos de puntuación): ");
            String palabra = teclado.nextLine().toLowerCase(); // Convertir a minúsculas para uniformidad
            // Almacenar palabra del usuario
            palabrasTeclado[i] = palabra;
        }

        // Mostrar las palabras ingresadas
        for (int j = 0; j < palabrasTeclado.length; j++) {
            System.out.println("Palabra " + j);
            System.out.println(palabrasTeclado[j]);
        }

        // Solicitar al usuario elegir una palabra por su índice
        System.out.println("Elija un índice de las palabras o frases mostradas ");
        Scanner teclado = new Scanner(System.in);
        // Leer índice
        int indice = teclado.nextInt();
        String palabraElegida = palabrasTeclado[indice];
        System.out.println("Frase o palabra elegida: " + palabraElegida);

        // Contar la frecuencia de cada letra en la palabra elegida y registrar posiciones
        for (int i = 0; i < palabraElegida.length(); i++) {
            char C = palabraElegida.charAt(i);
            try {
                if (CompararPalabras.esLetraValida(C)) {
                    conteos[Character.toLowerCase(C) - 'a']++;
                } else {
                    throw new ArrayIndexOutOfBoundsException();
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                // Identificar el tipo de carácter mostrar el caracter y el nombre de este...
                if (Character.isDigit(C)) {
                    System.out.println("El número: "+C+" no es una letra ");
                } else if (Character.isWhitespace(C)) {
                    System.out.println("Espacio no es una letra");
                } else {
                    switch (C) {
                        case '.':
                            System.out.println("Punto no es una letra");
                            break;
                        case ',':
                            System.out.println("Coma no es una letra");
                            break;
                        case '!':
                            System.out.println("Signo de exclamación no es una letra");
                            break;
                        case '?':
                            System.out.println("Signo de interrogación no es una letra");
                            break;
                        case ';':
                            System.out.println("Punto y coma no es una letra");
                            break;
                        case ':':
                            System.out.println("Dos puntos no es una letra");
                            break;
                        default:
                            System.out.println("Carácter no válido: " + C);
                            break;
                    }
                }
            }
        }

        // Imprimir frecuencias de cada letra y sus posiciones
        System.out.println("Frecuencia de letras y posiciones:");
        for (int i = 0; i < conteos.length; i++) {
            if (conteos[i] != 0) {
                System.out.print((char) (i + 'a') + ": " + conteos[i] + " posiciones: ");
                for (int j = 0; j < palabraElegida.length(); j++) {
                    if (palabraElegida.charAt(j) == (char) (i + 'a')) {
                        System.out.print(j + " ");
                    }
                }
                System.out.println();
            }
        }

        // Encontrar la letra que más se repite
        int maxConteo = 0;
        char letraMasRepetida = ' ';
        for (int i = 0; i < conteos.length; i++) {
            if (conteos[i] > maxConteo) {
                maxConteo = conteos[i];
                letraMasRepetida = (char) (i + 'a');
            }
        }

        // Mostrar la letra que más se repite
        System.out.println("La letra que más se repite es '" + letraMasRepetida + "' con " + maxConteo + " ocurrencias.");

        // Contar la cantidad total de letras en la palabra elegida
        int totalLetras = palabraElegida.length();
        System.out.println("La cantidad total de letras en la palabra elegida es: " + totalLetras);
    }
}
