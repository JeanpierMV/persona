package com.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Ana", "Gómez", "12345678", LocalDate.of(1990, 1, 1), "Argentina", 'M');
        Persona p2 = new Persona("Luis", "Martínez", "87654321", LocalDate.of(1985, 1, 1), "México", 'H');

        p1.imprimirDatos();
        System.out.println();
        p2.imprimirDatos();
    }
}