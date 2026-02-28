package com.example;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Ana", "Gómez", "12345678", 1990);
        Persona p2 = new Persona("Luis", "Martínez", "87654321", 1985);

        p1.imprimirDatos();
        System.out.println();
        p2.imprimirDatos();
    }
}