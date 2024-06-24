/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contador.de.letras;

/**
 *
 * @author Mariano
 */
public class CompararPalabras {
     // Método estático para verificar si un carácter es una letra válida (a-z)
    public static boolean esLetraValida(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}
