/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author s0733
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio del programa");

        Recursos recursos = new Recursos();

        // Primer Metodo
        System.out.println(recursos.Mensaje());

        // Segundo Metodo
        System.out.println(recursos.MayoriaDeEdad(20));
        System.out.println(recursos.MayoriaDeEdad(21));

        // Tercer Metodo
        System.out.println("Multiplicacion: " + recursos.multiplicar(8, 10));

        // Cuarto Metodo
        int[] lista = recursos.ListaDeNumeros(20);
        System.out.println("Lista de numeros: ");
        for (int num : lista) {
            System.out.print(num + " ");
        }
    }
}
