/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author s0733
 */
public class Recursos {
    // Primer Metodo
    public String Mensaje() {
        return "Programacion Orientada a Objetos 2021";
    }

    // Segundo Metodo
    public String MayoriaDeEdad(int edad) {
        System.out.println("Verificar edad: " + edad);
        return (edad >= 21) ? "Mayor de edad" : "Menor de edad";
    }

    // Tercer Metodo
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Cuarto Metodo
    public int[] ListaDeNumeros(int x) {
        int[] lista = new int[x];
        for (int i = 0; i < x; i++) {
            lista[i] = i + 1;
        }
        return lista;
    }
}

