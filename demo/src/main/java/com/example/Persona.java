package com.example;

public class Persona {
    private String nombre;
    private String apellido;
    private String numeroDocumento;
    private int anioNacimiento;

    public Persona(String nombre, String apellido, String numeroDocumento, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.anioNacimiento = anioNacimiento;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Número de documento: " + numeroDocumento);
        System.out.println("Año de nacimiento: " + anioNacimiento);
    }
}
