/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contador.de.letras;
import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class ProgramaBaseConExepcion {
    public static void main(String[] args) {
        int[] conteos = new int[26];
        Scanner teclado = new Scanner(System.in);
        
        // Leer palabra del usuario
        System.out.print("Ingrese una palabra o frase  (por favor, sólo letras): ");
        String palabra = teclado.nextLine();
        
        // Convertir a mayúsculas
        palabra = palabra.toUpperCase();
        
        // Contar la frecuencia de cada letra
        for (int i = 0; i < palabra.length(); i++) {
            try {
                conteos[palabra.charAt(i) - 'A']++;
            } catch (ArrayIndexOutOfBoundsException e) {
                // Capturar la excepción pero no hacer nada con ella en este paso
            }
        }
        
        // Imprimir frecuencias
        System.out.println();
        for (int i = 0; i < conteos.length; i++) {
            if (conteos[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + conteos[i]);
            }
        }
    }
}
